package com.zaleslaw.worldgame.logic;

import java.util.ArrayList;

public class ForeignState extends State{

	public ForeignState(String country, String president) {
		super(country, president);
		// TODO Auto-generated constructor stub
	}
    
	
	// Создаем все страны из базы данных, за исключением нашей страны
	static public ArrayList<ForeignState> CreateForeignStates(String OurState){
		// Временно
				// не учитываем наше государство
				ArrayList<ForeignState> List = new ArrayList<ForeignState>();
				ForeignState USA = new ForeignState("USA", "Obama");
				List.add(USA);
				
				
	    // Из БД
		return List;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
