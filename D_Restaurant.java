package com.pcwk.ehr.projectcrud;

public class D_Restaurant {

	// 1. 전체 목록 삭제하기
	public boolean doDelete(String delName) {
		Restaurant removed = ReadCSVfile_Edit.getRestaurantMap().remove(delName);

		if (removed != null) {
			// List에서도 삭제
			ReadCSVfile_Edit.getrestaurantList().remove(removed);
			Save.saveRestaurants(ReadCSVfile_Edit.Restaurant_DATA, ReadCSVfile_Edit.getrestaurantList());
			return true; // 성공
		}
		return false; // 실패
	}
}
