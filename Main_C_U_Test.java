/**
 * 
 */
package com.pcwk.ehr.projectcrud;

import java.util.ArrayList;
import java.util.List;

public class Main_C_U_Test {

	public static void main(String[] args) {
		List<Restaurant> restaurantList = new ArrayList<>();

		// CSV 파일 경로 설정 (상대 경로 or 절대 경로)
		String filename = "D:\\JAP_20250317\\01_JAVA\\workpace\\MiniProject\\data\\restaurants.csv";

		// 맛집 등록 기능 호출
		C_Restaurant.addRestaurant(restaurantList, filename);


	

	}
}
