/**
 * 
 */
package com.pcwk.ehr.projectcrud;

import java.util.List;
import java.util.Scanner;

public class C_Restaurant {


	public static void addRestaurant(List<Restaurant> restaurantList, String filename) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("가게 이름을 입력하세요: ");
		String resName = scanner.nextLine();

		System.out.print("대표 메뉴를 입력하세요: ");
		String RmenuName = scanner.nextLine();

		System.out.print("가격을 입력하세요: ");
		int RMenuCost = Integer.parseInt(scanner.nextLine());

		System.out.print("평점을 입력하세요(예: 4.5) : ");
		double rating = Double.parseDouble(scanner.nextLine());

		System.out.print("거리를 입력하세요: ");
		int distance = Integer.parseInt(scanner.nextLine());

		System.out.print("휴무일을 입력하세요: ");
		String breakDay = scanner.nextLine();

		// Restaurant 객체 생성
		Restaurant restaurant = new Restaurant(resName, RmenuName, RMenuCost, rating, distance, breakDay);
		restaurantList.add(restaurant);

		// 저장
		Save.saveRestaurants(filename, restaurantList);
		System.out.println("맛집이 등록되었습니다!");
	}



	public static List<C_Restaurant> addRestaurant(String file) {
		
		return null;
	}

	public String getResName() {
		return null;
	}

	public String getRmenuName() {
		return null;
	}

	public String getRmenuCost() {
		return null;
	}

	public String getRating() {
		return null;
	}

	public String getDistance() {
		return null;
	}

	public String getBreakDay() {
		return null;
	}

}
