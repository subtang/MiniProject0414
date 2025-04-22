/**
 * Package Name : com.pcwk.ehr.dao.test <br/>
 * Class Name: RestaurantDaoConsole.java <br/>
 * Description:  <br/>
 * Modification imformation : <br/> 
 * ------------------------------------------<br/>
 * 최초 생성일 : 2025-04-20<br/>
 *
 * ------------------------------------------<br/>
 * @author :PC
 * @since  :2024-09-09
 * @version: 0.5
 */
package com.pcwk.ehr.dao.test;

import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.Logger;

import com.pcwk.ehr.restaurant.vo.RestaurantVO;
import com.pwck.ehr.restaurant.dao.RestaurantDao;

public class RestaurantDaoConsole {

	RestaurantDao dao = new RestaurantDao();

	// 1. 전체 목록 조회
	public void allListPrint() {
		List<RestaurantVO> allList = dao.doRetrieve();

		if (allList != null) {
			for (RestaurantVO vo : allList) {
				System.out.println(vo);
			}
		} else {
			System.out.println("조회할 목록이 없습니다!");
		}

	}

	// 2. 단건 목록 조회
	public void searchByResName(String resName) {
		RestaurantVO list = dao.doSelctOne(resName);
		if (list != null) {
			System.out.println("==검색결과==");
			System.out.println(list);
		} else {
			System.out.println("가게 이름을 확인하시오. 조회 불가!");
		}
	}

	// 3. 목록 삭제 후 CSV에 저장
	public void deleteByResName(String resName) {
		int result = dao.doDelete(resName);
		if (result == 1) {
			System.out.println(resName + " 삭제 후 저장 성공");
		} else if (result == -1) {
			System.out.println(resName + "없는 가게 이름입니다. 삭제 실패!");
		} else {
			System.out.println(resName + "삭제 후 저장 실패");
		}
	}

}
