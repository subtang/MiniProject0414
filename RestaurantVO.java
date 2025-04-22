/**
 * Package Name : com.pcwk.ehr.restaurant.vo <br/>
 * Class Name: RestaurantVO.java <br/>
 * Description:  <br/>
 * Modification imformation : <br/> 
 * ------------------------------------------<br/>
 * 최초 생성일 : 2025-04-19<br/>
 *
 * ------------------------------------------<br/>
 * @author :PC
 * @since  :2024-09-09
 * @version: 0.5
 */
package com.pcwk.ehr.restaurant.vo;

public class RestaurantVO {
	
	private String  resName; //가게이름
	private String menuName; //대표메뉴이름
	private int    menuCost; //대표메뉴가격
	private double 	 rating; //평점
	private int    distance; //학원에서 거리
	private String breakDay; //휴무일
	
	public RestaurantVO(String resName, String menuName, int menuCost, double rating, int distance, String breakDay) {
		super();
		this.resName = resName;
		this.menuName = menuName;
		this.menuCost = menuCost;
		this.rating = rating;
		this.distance = distance;
		this.breakDay = breakDay;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getMenuCost() {
		return menuCost;
	}

	public void setMenuCost(int menuCost) {
		this.menuCost = menuCost;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getBreakDay() {
		return breakDay;
	}

	public void setBreakDay(String breakDay) {
		this.breakDay = breakDay;
	}

	@Override
	public String toString() {
		return "RestaurantVO [resName=" + resName + ", menuName=" + menuName + ", menuCost=" + menuCost + ", rating="
				+ rating + ", distance=" + distance + ", breakDay=" + breakDay + "]";
	}
	
}
