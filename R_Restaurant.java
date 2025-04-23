/**
 * Package Name : com.pcwk.ehr.projectcrud <br/>
 * Class Name: R_Restaurant.java <br/>
 * Description:  <br/>
 * Modification imformation : <br/> 
 * ------------------------------------------<br/>
 * 최초 생성일 : 2025-04-23<br/>
 *
 * ------------------------------------------<br/>
 * @author :user
 * @since  :2024-09-09
 * @version: 0.5
 */
package com.pcwk.ehr.projectcrud;

import java.util.List;

public class R_Restaurant {

	// 1. 전체 목록 조회
	public List<Restaurant> doRetrieve() {
		return ReadCSVfile_Edit.getrestaurantList();
	}

	// 2. 단건 목록 조회
	public Restaurant doSelectOne(String resName) {
		return ReadCSVfile_Edit.getRestaurantMap().get(resName);
	}
}
