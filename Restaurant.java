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
		RmenuName = rmenuName;
		RmenuCost = rmenuCost;
		this.rating = rating;
		this.distance = distance;
		this.breakDay = breakDay;
	}


    public int getECost() {
        return (int)(RmenuCost / rating);
    }


	@Override
	public String toString() {
		return "Restaurant [resName=" + resName + ", RmenuName=" + RmenuName + ", RmenuCost=" + RmenuCost + ", rating="
				+ rating + ", distance=" + distance + ", breakDay=" + breakDay + ", getECost()=" + getECost() + "]";
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
		RmenuName = rmenuName;
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
		RmenuCost = rmenuCost;
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



    // getter & setter 생략 가능
	
}
