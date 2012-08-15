package com.zaleslaw.worldgame;

import java.util.ArrayList;

import com.zaleslaw.worldgame.logic.database.ExternalDbOpenHelper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class NewGameActivity extends Activity{
	@Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newgame);
        
        
        
        
	
	Button CreateGame = (Button)findViewById(R.id.button1);
	CreateGame.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent i = new Intent(NewGameActivity.this, OperatingWindow.class);
			
			ArrayList<String> ListOfStates = GetListOfStatesForGamer();
			
			// verifyCompleteDataForm() - проверяем. что все настройки заполнены и заполняем оставшеся по умолчанию и уведотмляем об этом пользователя
			// Нужно передать данные в активность  http://developer.alexanderklimov.ru/android/activity.php
	        startActivity(i);
	   
			
		}
	});
	

    }
	
	
	
	 private ArrayList<String> GetListOfStatesForGamer() {
			
			String DB_NAME = "Test.db";
			String TABLE_NAME = "State";
			 String FRIEND_ID = "_id";
			 String FRIEND_NAME = "name";
			 SQLiteDatabase database;
			
			ExternalDbOpenHelper LocalDbHelper = new ExternalDbOpenHelper(this, DB_NAME);
			
			ArrayList<String> ListOfStates = new ArrayList<String>();

			 try {
	             //Открываем базу данных
				 LocalDbHelper.openDataBase();
	             
				 LocalDbHelper.selectData(ListOfStates, TABLE_NAME);
	             //Закрываем базу данных
				 LocalDbHelper.close();
	         }catch(SQLException sqle){}

			return ListOfStates;
		}
	 
	 
/*	 private void setUpList() {
			//Испльзуем стандартный адаптер и layout элемента для краткости
		 ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
						android.R.layout.simple_list_item_1, GetListOfStatesForGamer());
			listView = adapter.getListView();

			//Подарим себе тост, для души
			listView.setOnItemClickListener(new OnItemClickListener() {
				public void onItemClick(AdapterView parent, View view,
								int position,long id) {
					Toast.makeText(getApplicationContext(),
								((TextView) view).getText() +
								 " could be iDev's friend",
								 Toast.LENGTH_SHORT).show();
				}
			});
		}*/
	
}
