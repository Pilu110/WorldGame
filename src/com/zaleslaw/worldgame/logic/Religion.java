package com.zaleslaw.worldgame.logic;

public class Religion {
    
	private String name;
	private int idReligion;
	
	public Religion (int _idReligion, String _name){
		idReligion = _idReligion;
		name = _name;
	}
	
	// Конструктор по базе данных
	public Religion(int _idReligion) {
		idReligion = _idReligion;
	    getReligonFromDB("name", _idReligion);
		// в идеале надо переделать с использованием Reflections API 
		// получаем список полей класса и выбираем их из таблицы  именем класса
	}
    
	private void getReligonFromDB(String fieldName, int _idReligion) {
		String TABLENAME = Religion.class.getName();
		String query =  "SELECT " + fieldName + " FROM " + TABLENAME + 
				// Правомерно ли число передавать как строковою константу, есть ли в SQL - параметры
				" WHERE " + TABLENAME + "." + fieldName + " = " + _idReligion;
		
		
		
		
	}

	
	
	
}
