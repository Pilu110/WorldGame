package com.zaleslaw.worldgame.logic;


public class Game {
    
	private World world;
	
	public Game(String state, String person, int complexcity, String dataTime) {
		// TODO Auto-generated constructor stub
		world = new World(state,person, complexcity, dataTime);
	}
    

	void CreateNewGame() {

	}

	public void SaveGame() {

	}

	public void EditGame() {

	}

	void CreateGameFromData() {

	}

	public void createGame(int Regime) {
		switch (Regime) {
		case 1:
			CreateNewGame();
			break;
		case 2:
			CreateGameFromData();
			break;
		default:
			SendMessageToGamer();

		}

	}

	public void SendMessageToGamer() {

	}
	
	
	
	
	
	// Goverment

	public void DeclareNewElection() {

	}

	public void CreateNewGoverment() {

	}

	// Taxes
	public void GrowTax() {

	}

	// Economy

	// Demography

	public void Genocide(String ethnoName, int deathsNumber) {
		world.getOurLand().Genocide(ethnoName, deathsNumber);
	}

	// Peoples + Elections

	// Diplomacy

	// War and peace
	public void Mobilization() {

	}

	public void DeclareWar() {

	}
    
	
	public void MakePeace(){
		
	}
	// Political System
	public void ChangePoliticalSystem() {

	}
    
    
    // State army business
	
	public void BuildArmy(){
		
	}
	
	public void BuildNavy(){
		
	}
	
	public void BuildRocket(){
		
	}
	
	public void BuildNuke(){
		
	}
    
	
	// Sciense
	
	// Есть государственные технологии, на которые мжно тратить научные баллы, 
	//так что через некоторое время технология с определенной вероятностью откроется
	// причем дерево технологий не видно сразу, а открывается по мере надобности и там есть явно альтернативные ветки
    public void Investigate(){
    	
    }
    
    public void Invest(){
    	
    }
    
    public void BuyTechnology(){
    	
    }
    
    public void StealTechnology(){
    	
    }
    
    
}
