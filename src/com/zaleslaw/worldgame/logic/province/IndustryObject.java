package com.zaleslaw.worldgame.logic.province;

public abstract class IndustryObject implements ProvinceObject{

private int daysForBuilding;
private double price;
private String product;
/**
 * @return the daysForBuilding
 */
public int getDaysForBuilding() {
	return daysForBuilding;
}
/**
 * @param daysForBuilding the daysForBuilding to set
 */
public void setDaysForBuilding(int daysForBuilding) {
	this.daysForBuilding = daysForBuilding;
}
/**
 * @return the price
 */
public double getPrice() {
	return price;
}
/**
 * @param price the price to set
 */
public void setPrice(double price) {
	this.price = price;
}
/**
 * @return the product
 */
public String getProduct() {
	return product;
}
/**
 * @param product the product to set
 */
public void setProduct(String product) {
	this.product = product;
}


}
