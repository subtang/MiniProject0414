/**
 * 
 */
package com.pcwk.ehr.restaurant;

import java.util.List;
import java.util.Scanner;

public class U_Restaurant {

	private String resName;
	private String RmenuName;
	private int RmenuCost;
	private double rating;
	private int distance;
	private String breakDay;

	public U_Restaurant(String string, String string2, int i, double d, int j, String string3) {
		// TODO Auto-generated constructor stub
	}

	public static void updateRestaurant(List<U_Restaurant> restaurant, String filename) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("수정할 가게 이름을 입력하세요: ");
		String targetName = scanner.nextLine();

		boolean found = false;
		for (U_Restaurant r : restaurant) {
			if (r.getresName().equalsIgnoreCase(targetName)) {
				System.out.println("기존 정보: " + r);

				System.out.print("새 가게 이름을 입력하세요 (그대로 두려면 Enter): ");
				String newName = scanner.nextLine();
				if (!newName.isEmpty())
					r.setResName(newName);

				System.out.print("새 대표메뉴 이름을 입력하세요 (그대로 두려면 Enter): ");
				String RmenuName = scanner.nextLine();
				if (!newName.isEmpty())
					r.setRmenuName(newName);

				System.out.print("새 대표 메뉴 가격 (Enter로 건너뜀): ");
				String costStr = scanner.nextLine();
				if (!costStr.isEmpty()) {
					try {
						int cost = Integer.parseInt(costStr);
						r.setRmenuCost(cost);
					} catch (NumberFormatException e) {
						System.out.println("가격 입력 오류! 숫자를 입력하세요.");
					}
				}
				System.out.print("새 평점을 입력하세요 (예: 4.5, Enter로 건너뜀): ");
				String ratingStr = scanner.nextLine();
				if (!ratingStr.isEmpty()) {
					try {
						double rating = Double.parseDouble(ratingStr);
						r.setRating(rating);
					} catch (NumberFormatException e) {
						System.out.println("평점 입력 오류! 숫자를 입력하세요.");
					}
				}
				System.out.print("새 거리를 입력하세요 (예: 500m, Enter로 건너뜀): ");
				String distanceStr = scanner.nextLine();
				if (!distanceStr.isEmpty()) {
					try {
						int distance = Integer.parseInt(distanceStr);
						r.setDistance(distance);
					} catch (NumberFormatException e) {
						System.out.println("거리 입력 오류! 숫자를 입력하세요.");
					}
				}
				System.out.print("새 휴무일을 입력하세요 (예: 월요일, Enter로 건너뜀): ");
				String breakDay = scanner.nextLine();
				if (!breakDay.isEmpty())
					r.setBreakDay(breakDay);

				found = true;
				break;
			}
		}
	}

	/**
	 * @return the resName
	 */
	public String getresName() {
		return this.resName;
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
}