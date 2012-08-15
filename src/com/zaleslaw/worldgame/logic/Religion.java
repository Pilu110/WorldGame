package com.zaleslaw.worldgame.logic;

public class Religion {
    
	private String name;
	private int idReligion;
	
	public Religion (int _idReligion, String _name){
		idReligion = _idReligion;
		name = _name;
	}
	
	// ����������� �� ���� ������
	public Religion(int _idReligion) {
		idReligion = _idReligion;
	    getReligonFromDB("name", _idReligion);
		// � ������ ���� ���������� � �������������� Reflections API 
		// �������� ������ ����� ������ � �������� �� �� �������  ������ ������
	}
    
	private void getReligonFromDB(String fieldName, int _idReligion) {
		String TABLENAME = Religion.class.getName();
		String query =  "SELECT " + fieldName + " FROM " + TABLENAME + 
				// ���������� �� ����� ���������� ��� ��������� ���������, ���� �� � SQL - ���������
				" WHERE " + TABLENAME + "." + fieldName + " = " + _idReligion;
		
		
		
		
	}

	
	
	
}
