/**
 * Package Name : com.pwck.ehr.restaurant.dao <br/>
 * Class Name: RestaurantDao.java <br/>
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
package com.pwck.ehr.restaurant.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pcwk.ehr.restaurant.cmn.PLog;
import com.pcwk.ehr.restaurant.cmn.Workdiv;
import com.pcwk.ehr.restaurant.vo.RestaurantVO;

public class RestaurantDao implements Workdiv<RestaurantVO>, PLog {

	public static final String Restaurant_DATA = ".\\data\\restaurantListHong.csv.csv";

	private List<RestaurantVO> restaurant = new ArrayList<RestaurantVO>();
	private Map<String, RestaurantVO> restaurantMap = new HashMap<>();

	// 파일에서 회원정보 읽기
	public RestaurantDao() {

		getmemberReaderFile(Restaurant_DATA);

	}

	/**
	 * 회원정보 파일 to List<MemberVO>
	 * 
	 * @param path
	 * @return
	 */
	public List<RestaurantVO> getmemberReaderFile(String path) {

		// 1. file read
		// 2. 읽은 한 줄 -> RestaurantVO
		// 3. List<MemberVO> RestaurantVO에 추가

		try (BufferedReader reader = new BufferedReader(new FileReader(path));) {
			String line;
			while ((line = reader.readLine()) != null) {
//					Log.debug(line); 

				String[] dataArr = line.split(",");

				String resName = dataArr[0]; // 가게이름
				String menuName = dataArr[1]; // 대표메뉴이름
				int menuCost = Integer.parseInt(dataArr[2]); // 대표메뉴가격
				double rating = Double.parseDouble(dataArr[3]); // 평점
				int distance = Integer.parseInt(dataArr[4]); // 학원에서 거리
				String breakDay = dataArr[5]; // 휴무일

				RestaurantVO restaurantVO = new RestaurantVO(resName, menuName, menuCost, rating, distance, breakDay);
//					Log.debug(memberVO);
				restaurant.add(restaurantVO);
				restaurantMap.put(resName, restaurantVO);

			}
			Log.debug("┌──────────────────┐");
			Log.debug("│List<RestaurantVO>│");
			Log.debug("└──────────────────┘");

			for (RestaurantVO vo : restaurant) {
//					Log.debug(vo);
			}

		} catch (FileNotFoundException e) {
			Log.debug("FileNotFoundException:" + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			Log.debug("IOException:" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			Log.debug("Exception:" + e.getMessage());
			e.printStackTrace();
		}

		return restaurant;
	}
	//csv에 저장하기
	@Override
	public int saveToCSV() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(Restaurant_DATA));) {
			for (RestaurantVO vo : restaurant) {
				String line = String.join(",", vo.getResName(), vo.getMenuName(), String.valueOf(vo.getMenuCost()),
						String.valueOf(vo.getRating()), String.valueOf(vo.getDistance()), vo.getBreakDay());
				writer.write(line);
				writer.newLine();
			}
			Log.info("CSV 저장 성공");
			return 1;

		} catch (IOException e) {
			Log.error("CSV 저장 실패:" + e.getMessage());
			return 0;
		} catch (Exception e1) {
			Log.error("CSV 저장 실패:" + e1.getMessage());
			return 0;
		}
	}
	//전체 목록 조회하기
	@Override
	public List<RestaurantVO> doRetrieve() {
		return restaurant;
	}
	//단건 목록 조회하기
	@Override
	public RestaurantVO doSelctOne(String resName) {
		return restaurantMap.get(resName.trim());
	}
	//목록 삭제하기
	@Override
	public int doDelete(String resName) {
		RestaurantVO removed = restaurantMap.remove(resName);

		if (removed == null) {
			Log.warn("삭제 실패 -가게명 없음:" + resName);
			return -1;
		}

		restaurant.remove(removed);
		int saveResult = saveToCSV();
		if (saveResult == 0) {
			Log.warn("삭제 후 저장 실패 -가게명:" + resName);
			return -2;
		}
		Log.info("삭제 후 저장 성공 -가게명:" + resName);
		return 1;
	}

}
