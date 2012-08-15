package com.zaleslaw.worldgame.logic.province;

import com.zaleslaw.worldgame.logic.Ideology;
import com.zaleslaw.worldgame.logic.Religion;

public class PopulationGroup {
	
	
	
	private Religion religion;
	private Ideology ideology;
	private int size;
	private Ethnos ethnos;
	private Profession profession;
    private double Cash;
	private int idPopGroup;
	/**
	 * @return the idPopGroup
	 */
	public int getIdPopGroup() {
		return idPopGroup;
	}
	/**
	 * @param idPopGroup the idPopGroup to set
	 */
	public void setIdPopGroup(int idPopGroup) {
		this.idPopGroup = idPopGroup;
	}
	/**
	 * @return the religion
	 */
	public Religion getReligion() {
		return religion;
	}
	/**
	 * @param religion the religion to set
	 */
	public void setReligion(Religion religion) {
		this.religion = religion;
	}
	/**
	 * @return the ideology
	 */
	public Ideology getIdeology() {
		return ideology;
	}
	/**
	 * @param ideology the ideology to set
	 */
	public void setIdeology(Ideology ideology) {
		this.ideology = ideology;
	}
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/**
	 * @return the ethnos
	 */
	public Ethnos getEthnos() {
		return ethnos;
	}
	/**
	 * @param ethnos the ethnos to set
	 */
	public void setEthnos(Ethnos ethnos) {
		this.ethnos = ethnos;
	}
	/**
	 * @return the profession
	 */
	public Profession getProfession() {
		return profession;
	}
	/**
	 * @param profession the profession to set
	 */
	public void setProfession(Profession profession) {
		this.profession = profession;
	}
	/**
	 * @return the cash
	 */
	public double getCash() {
		return Cash;
	}
	/**
	 * @param cash the cash to set
	 */
	public void setCash(double cash) {
		Cash = cash;
	}
	
    
}
