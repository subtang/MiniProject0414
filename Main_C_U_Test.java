/**
 * 
 */
package com.pcwk.ehr.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Main_C_U_Test {

	public static void main(String[] args) {
		List<C_Restaurant> restaurantList = new ArrayList<>();

		// CSV 파일 경로 설정 (상대 경로 or 절대 경로)
		String filename = "D:\\JAP_20250317\\01_JAVA\\workpace\\MiniProject\\data\\restaurants.csv";

		// 맛집 등록 기능 호출
		C_Restaurant.addRestaurant(restaurantList, filename);

		// 테스트용 맛집 리스트 생성
		List<U_Restaurant> uList = new ArrayList<>();
		uList.add(new U_Restaurant("김밥천국", "김치볶음밥", 6000, 4.5, 500, "일요일"));

		
		// 수정 기능 호출
		U_Restaurant.updateRestaurant(uList, "D:\\JAP_20250317\\01_JAVA\\workpace\\MiniProject\\data\\restaurants.csv");

		// 수정 결과 출력
		for (U_Restaurant res : uList) {
			System.out.println(res);
		}
	}
}
