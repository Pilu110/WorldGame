package com.zaleslaw.worldgame.logic;

public class OurState extends State {
	/**
	 * @param args
	 */
	
	public OurState(String country, String president) {
		super(country, president);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    
	public void Genocide(String ethnoName, int deathsNumber){
    	this.populationsize = this.populationsize - deathsNumber;
    }
	
}







