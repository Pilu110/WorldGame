package com.zaleslaw.worldgame.logic;

import java.util.ArrayList;

public class PublicSociety {
	
	private ArrayList<PublicPerson>  Opposities;
	private ArrayList<PublicPerson>  Organizations;
    private ArrayList<PublicPerson>  PhysicalFaces;
	
	// ƒвусторонн€€ ссылка на то, чье они общество, надо пон€ть оправдана ли жта ссылка
	private State state;
	
	
	
	
	
	/**
	 * @return the opposities
	 */
	public ArrayList<PublicPerson> getOpposities() {
		return Opposities;
	}


	/**
	 * @param opposities the opposities to set
	 */
	public void setOpposities(ArrayList<PublicPerson> opposities) {
		Opposities = opposities;
	}


	/**
	 * @return the organizations
	 */
	public ArrayList<PublicPerson> getOrganizations() {
		return Organizations;
	}


	/**
	 * @param organizations the organizations to set
	 */
	public void setOrganizations(ArrayList<PublicPerson> organizations) {
		Organizations = organizations;
	}


	/**
	 * @return the physicalFaces
	 */
	public ArrayList<PublicPerson> getPhysicalFaces() {
		return PhysicalFaces;
	}


	/**
	 * @param physicalFaces the physicalFaces to set
	 */
	public void setPhysicalFaces(ArrayList<PublicPerson> physicalFaces) {
		PhysicalFaces = physicalFaces;
	}


	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}


	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}


	
	
	public PublicSociety() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
