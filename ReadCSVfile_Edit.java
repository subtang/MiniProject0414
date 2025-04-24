package com.pcwk.ehr.projectcrud;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.*;
import com.pcwk.ehr.ed01.*;

public class ReadCSVfile_Edit {
	
	static final Logger LOG=LogManager.getLogger(Main.class);

	public static final String Restaurant_DATA = ".\\data\\restaurantListHong.csv.csv";

	private static List<Restaurant> restaurantList = new ArrayList<>();
	private static Map<String, Restaurant> restaurantMap = new HashMap<>();

	// 1. 리스트 출력
	public static List<Restaurant> getrestaurantList() {
		return restaurantList;
	}

	// 2. 맵 출력
	public static Map<String, Restaurant> getRestaurantMap() {
		return restaurantMap;
	}

	// 3. CSV파일 리스트에 로드
	public static List<Restaurant> loadRestaurants(String filename) {

		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line = br.readLine(); // 첫 줄 (헤더) 무시
			while ((line = br.readLine()) != null) {

				String[] data = line.split(",");

				String resName = data[0];
				String RmenuName = data[1];
				int RmenuCost = Integer.parseInt(data[2]);
				double rating = Double.parseDouble(data[3]);
				int distance = Integer.parseInt(data[4]);
				String breakDay = data[5];

				Restaurant newRestaurant = new Restaurant(resName, RmenuName, RmenuCost, rating, distance, breakDay);
				restaurantList.add(newRestaurant);
				restaurantMap.put(resName, newRestaurant);

			}

		} catch (IOException e) {
			LOG.error("파일 읽기 오류: " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			LOG.error("파일 읽기 오류: " + e.getMessage());
			e.printStackTrace();
		}
		return restaurantList;
	}
}