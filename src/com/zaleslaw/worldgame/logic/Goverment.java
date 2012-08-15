package com.zaleslaw.worldgame.logic;

import java.util.ArrayList;

public class Goverment {
    
	
	private int Dissent;


	private ArrayList<MinisterPerson> Ministers;
	private PresidentPerson President;
	
	// ¬еро€тность того, что приказ будет исполнен.
	private int effiencyOfRules;
	
	public Goverment(String president) {
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getDissent() {
		return Dissent;
	}

	public void setDissent(int dissent) {
		Dissent = dissent;
	}

	

	public PresidentPerson getPresident() {
		return President;
	}

	public void setPresident(PresidentPerson president) {
		President = president;
	}

	public int getEffiencyOfRules() {
		return effiencyOfRules;
	}

	public void setEffiencyOfRules(int effiencyOfRules) {
		this.effiencyOfRules = effiencyOfRules;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	

}
