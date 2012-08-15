package com.zaleslaw.worldgame.logic;


import java.util.ArrayList;

import com.zaleslaw.worldgame.logic.database.ExternalDbOpenHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.database.sqlite.SQLiteDatabase;
/**
 * @author user
 *
 */
public  class State implements SaveCreateSQL{
	protected int idState; // Хранится в БД
	protected int populationsize;
    protected int landareasize;
	protected int provincenumber;
	
	
	protected StateBudget   stateBudget;
	protected Goverment     gov;
	protected TypeAI        aiType;
	protected PublicSociety socium;
	
	
	protected StateParameters stateParams;
	
	// 
	protected int [] ownProvinces;
	protected int [] ownOccupiesProvinces;
	protected int [] OccupiesProvincesByForeignStates;
	
	protected  SQLiteDatabase db;
	
	
	public int getPopulationsize() {
		return populationsize;
	}



	public void setPopulationsize(int populationsize) {
		this.populationsize = populationsize;
	}



	public int getLandareasize() {
		return landareasize;
	}



	public void setLandareasize(int landareasize) {
		this.landareasize = landareasize;
	}



	public int getProvincenumber() {
		return provincenumber;
	}



	public void setProvincenumber(int provincenumber) {
		this.provincenumber = provincenumber;
	}



	public int[] getOwnProvinces() {
		return ownProvinces;
	}



	public void setOwnProvinces(int[] ownProvinces) {
		this.ownProvinces = ownProvinces;
	}



	public int[] getOwnOccupiesProvinces() {
		return ownOccupiesProvinces;
	}



	public void setOwnOccupiesProvinces(int[] ownOccupiesProvinces) {
		this.ownOccupiesProvinces = ownOccupiesProvinces;
	}



	public int[] getOccupiesProvincesByForeignStates() {
		return OccupiesProvincesByForeignStates;
	}



	public void setOccupiesProvincesByForeignStates(
			int[] occupiesProvincesByForeignStates) {
		OccupiesProvincesByForeignStates = occupiesProvincesByForeignStates;
	}

    

	public State(String country, String president){
		CreateState();
		Goverment gov = new Goverment(president);
	}
	
	
	
	public State(int _idstate) {
		// TODO Auto-generated constructor stub
	}



	public void PeoplesWriteToPresident(){
		PublicPerson sendPerson = gov.getPresident();
		// Полиморфный код, если социум разный, т.е. от разных публичных персон разные сообщения придут
		for(PublicPerson person: socium.getPhysicalFaces())
			person.SendMessage(sendPerson);
	}
	
	// Rulers
	
     
	
	public void CreateState(){
		
	}
	
	
	
	public void KillState(){
		
	}

	

	@Override
	public void SaveToSQL(int gameNumber) {
		db.execSQL(" INSERT VALUES INTO  States  States.idState = &idState");
		
	}



	@Override
	public void CreateFromSQL() {
		// TODO Auto-generated method stub
		db.execSQL("Select * From States Where States.idState = &idState");
	}

    // Больше похоже на методы президента, персоны, может стоит в президента, в игровую личность включать как поле страну, 
	//а не наоборот, т.е. неясно кто такой игрок - персона или безликая страна
	

	

	
}