package com.zaleslaw.worldgame.logic;



import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.database.sqlite.SQLiteDatabase;

public class SQLWork {
    
	public static String TABLE_NAME;
	public static String NAME1;
	public static String NAME2;
   public static   String DATABASE;
	
	SQLiteDatabase db;
	
	public SQLWork() {
	 TABLE_NAME = "state";
	 NAME1 = "populationsize";
	 NAME2 = "landareasize";
	}
    
	
	public void FirstFill(){
		db.execSQL("CREATE TABLE"
				+ TABLE_NAME
				+ ("id INTEGER PRIMARY KEY AUTOINCREMENT" + NAME1 + " TEXT, "
						+ NAME2 + " TEXT"));
		
		
		ContentValues values = new ContentValues();
		values.put(NAME1, 10);
		values.put(NAME2, 100);
		db.insert(TABLE_NAME, NAME1, values);
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	

}