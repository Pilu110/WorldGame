package com.zaleslaw.worldgame.logic;

import java.util.ArrayList;
import java.util.Map;

import com.zaleslaw.worldgame.logic.province.Province;

// �������� ������� �����, �� �������� ��� ��������� ������, ��������� �� �������� ��� ��������� - ��� �����, ����� ������������ ������ ����� ����� ����������� ��� ����� ���������
// ������� ������� �� ���� ������� ���������� ��� ������� ������ � ����� Game, ������ ���� ����� GameOperations � ��� ������������ ������ ����� ������
// ����� �������� ����� �� ������������ ������� �������, 
//���������� ������� ���� ���� ������� �� ����� ��������, � ��� ������� �� ����������� ����� ����� ������������� ���� ���������
public class World implements SaveCreateSQL {

	private int idWorld;
	private int TotalProvinciesNumber;
	private int TotalPopulationSize;
	private int TotalLandAreaSize;
	private int TotalStatesNumber;
	private ArrayList<ForeignState> foreignStateList;
	private Map <Integer,Province> mapProvinces;
	private OurState ourLand;

	public World(String country, String president, int complexcity,
			String DataTime) {

		idWorld = 1;

		// temp initialization

		TotalProvinciesNumber = 10;
		TotalPopulationSize = 1000000;

		TotalLandAreaSize = 150000000;
		TotalStatesNumber = 2;

		// Normal initialization
		ourLand = new OurState(country, president);
		foreignStateList = ForeignState.CreateForeignStates(country);
		mapProvinces = Province.CreateProvinces();

	}

	@Override
	public void SaveToSQL(int gameNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void CreateFromSQL() {
		// TODO Auto-generated method stub

	}

	


    
    
	/**
	 * @return the ourLand
	 */
	public OurState getOurLand() {
		return ourLand;
	}

	/**
	 * @param ourLand the ourLand to set
	 */
	public void setOurLand(OurState ourLand) {
		this.ourLand = ourLand;
	}

	public int getIdWorld() {
		return idWorld;
	}
	public void setIdWorld(int idWorld) {
		this.idWorld = idWorld;
	}
	public int getTotalProvinciesNumber() {
		return TotalProvinciesNumber;
	}
	public void setTotalProvinciesNumber(int totalProvinciesSize) {
		TotalProvinciesNumber = totalProvinciesSize;
	}
	public int getTotalPopulationSize() {
		return TotalPopulationSize;
	}
	public void setTotalPopulationSize(int totalPopulationSize) {
		TotalPopulationSize = totalPopulationSize;
	}
	public int getTotalLandAreaSize() {
		return TotalLandAreaSize;
	}
	public void setTotalLandAreaSize(int totalLandAreaSize) {
		TotalLandAreaSize = totalLandAreaSize;
	}
	public int getTotalStatesNumber() {
		return TotalStatesNumber;
	}
	public void setTotalStatesNumber(int totalStatesNumber) {
		TotalStatesNumber = totalStatesNumber;
	}

	public ArrayList<ForeignState> getForeignStateList() {
		return foreignStateList;
	}

	public void setForeignStateList(ArrayList<ForeignState> foreignStateList) {
		this.foreignStateList = foreignStateList;
	}
	
		
		
}