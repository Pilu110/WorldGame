package com.zaleslaw.worldgame.logic.province;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.zaleslaw.worldgame.logic.Religion;
import com.zaleslaw.worldgame.logic.State;

public class Province {
	
	private int idProvince; // �������� � ��
	private String name;
	private Religion mainReligion;
	private int size;
	private Percent RebelitionLevel;
	private State state;
	
	private double xCentreCoordinate;
	private double yCentreCoordinate;
	
	private ArrayList <IndustryFactory> Factories;
	private ArrayList <DefenceObject>   DefenceObjects;
	private ArrayList <PopulationGroup> popGroupSet;
	// ���� 1 ��������� = 1 �����, ��� ���������� �������������
	// ���������� ������ ���������
	private ArrayList<City> Cities;
	
	Province(int _idProvince){
		
		idProvince = _idProvince;
		
		// ��������� id ��� �������� ��� ������� ��������
		int _idstate = iGetProvinceFieldFromDB("state",_idProvince);
		int _idmainReligion = iGetProvinceFieldFromDB("religion",_idProvince);
		
		// �������� ������� ��������
		state = new State(_idstate);
		
		mainReligion = new Religion(_idmainReligion);
		
		
		name = sGetProvinceFieldFromDB("name",_idProvince );
		size = iGetProvinceFieldFromDB("size",_idProvince );
		xCentreCoordinate = iGetProvinceFieldFromDB("xCentreCoordinate",_idProvince);
		yCentreCoordinate = iGetProvinceFieldFromDB("yCentreCoordinate",_idProvince);
		
		
		
		
	}
    
	private int iGetProvinceFieldFromDB(String fieldName, int _id) {
		String TABLENAME = this.getClass().getName();
		String query =  "SELECT " + fieldName + " FROM " + TABLENAME + 
				// ���������� �� ����� ���������� ��� ��������� ���������, ���� �� � SQL - ���������
				" WHERE " + TABLENAME + "." + fieldName + " = " + _id;
		// ������� ���������� � ��
		return 0;
	}

	private String sGetProvinceFieldFromDB(String fieldName, int _id) {
		String TABLENAME = this.getClass().getName();
		String query =  "SELECT " + fieldName + " FROM " + TABLENAME + 
				// ���������� �� ����� ���������� ��� ��������� ���������, ���� �� � SQL - ���������
				" WHERE " + TABLENAME + "." + fieldName + " = " + _id;
		
		// ������� ���������� � ��
		return "";
		
	}
	
	public static Map<Integer, Province> CreateProvinces() {
		Map<Integer, Province> mapProvinces = new HashMap<Integer, Province>();
		
		
		// �������� �� ���������� �� ��
		Province Moskow = new Province(1);
		mapProvinces.put(1, Moskow );
		Province StPeterburg = new Province(2);
		mapProvinces.put(2, StPeterburg );
		Province Washington = new Province(3);
		mapProvinces.put(3, Washington );
		Province Omsk = new Province(4);
		mapProvinces.put(4, Omsk);
		Province NewYork = new Province(5);
		mapProvinces.put(5, NewYork );
		
		return mapProvinces;
	}

}
