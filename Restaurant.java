package com.pcwk.ehr.projectcrud;

//Restaurant 코드

public class Restaurant {
    private String resName;
    private String RmenuName;
    private int RmenuCost;
    private double rating;
    private int distance;
    private String breakDay;

    /**
	 * @param resName
	 * @param rmenuName
	 * @param rmenuCost
	 * @param rating
	 * @param distance
	 * @param breakDay
	 */
	public Restaurant(String resName, String rmenuName, int rmenuCost, double rating, int distance, String breakDay) {
		super();
		this.resName = resName;
		this.RmenuName = rmenuName;
		this.RmenuCost = rmenuCost;
		this.rating = rating;
		this.distance = distance;
		this.breakDay = breakDay;
	}
	


    public int getECost() {
        return (int)(RmenuCost / rating);
    }


	@Override
	public String toString() {
		return "가성비 맛집 [가게이름:" + resName + ", 대표메뉴:" + RmenuName + ", 가격:" + RmenuCost + "원, 평점:"
				+ rating + "점, 거리:" + distance + "m, 휴무일:" + breakDay + ", 가성비:" + getECost() + "점]";
	}


	/**
	 * @return the resName
	 */
	public String getResName() {
		return resName;
	}


	/**
	 * @param resName the resName to set
	 */
	public void setResName(String resName) {
		this.resName = resName;
	}


	/**
	 * @return the rmenuName
	 */
	public String getRmenuName() {
		return RmenuName;
	}


	/**
	 * @param rmenuName the rmenuName to set
	 */
	public void setRmenuName(String rmenuName) {
		this.RmenuName = rmenuName;
	}


	/**
	 * @return the rmenuCost
	 */
	public int getRmenuCost() {
		return RmenuCost;
	}


	/**
	 * @param rmenuCost the rmenuCost to set
	 */
	public void setRmenuCost(int rmenuCost) {
		this.RmenuCost = rmenuCost;
	}


	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}


	/**
	 * @param rating the rating to set
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}


	/**
	 * @return the distance
	 */
	public int getDistance() {
		return distance;
	}


	/**
	 * @param distance the distance to set
	 */
	public void setDistance(int distance) {
		this.distance = distance;
	}


	/**
	 * @return the breakDay
	 */
	public String getBreakDay() {
		return breakDay;
	}


	/**
	 * @param breakDay the breakDay to set
	 */
	public void setBreakDay(String breakDay) {
		this.breakDay = breakDay;
	}


	
}
