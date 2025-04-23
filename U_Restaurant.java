/**
 * 
 */
package com.pcwk.ehr.projectcrud;

import java.util.List;
import java.util.Scanner;

public class U_Restaurant {

	private String resName;
	private String RmenuName;
	private int RmenuCost;
	private double rating;
	private int distance;
	private String breakDay;

	public static void U_Restaurant(List<Restaurant> restaurantList, String filename) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("수정할 가게 이름을 입력하세요: ");
		String targetName = scanner.nextLine();

		boolean found = false;
		for (Restaurant r : restaurantList) {
			if (r.getResName().equalsIgnoreCase(targetName)) {
				System.out.println("기존 정보: " + r.getResName() + ", " + r.getRmenuName());

				System.out.print("새 가게 이름을 입력하세요 (Enter로 건너뜀): ");
				String newName = scanner.nextLine();
				if (!newName.isEmpty())
					r.setResName(newName);

				System.out.print("새 대표 메뉴 이름을 입력하세요 (Enter로 건너뜀): ");
				String newMenu = scanner.nextLine();
				if (!newMenu.isEmpty())
					r.setRmenuName(newMenu);

				System.out.print("새 가격을 입력하세요 (Enter로 건너뜀): ");
				String costStr = scanner.nextLine();
				if (!costStr.isEmpty())
					r.setRmenuCost(Integer.parseInt(costStr));

				System.out.print("새 평점을 입력하세요 (Enter로 건너뜀): ");
				String ratingStr = scanner.nextLine();
				if (!ratingStr.isEmpty())
					r.setRating(Double.parseDouble(ratingStr));

				System.out.print("새 거리를 입력하세요 (Enter로 건너뜀): ");
				String distanceStr = scanner.nextLine();
				if (!distanceStr.isEmpty())
					r.setDistance(Integer.parseInt(distanceStr));

				System.out.print("새 휴무일을 입력하세요 (Enter로 건너뜀): ");
				String breakDay = scanner.nextLine();
				if (!breakDay.isEmpty())
					r.setBreakDay(breakDay);

				found = true;
				break;
			}
		}

		if (found) {
			Save.saveRestaurants(filename, restaurantList); // 저장
			System.out.println("수정 완료되었습니다!");
		} else {
			System.out.println("해당 가게를 찾을 수 없습니다.");
		}
	}
}
