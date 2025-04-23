package com.pcwk.ehr.projectcrud;

public class D_Restaurant {

	// 1. 전체 목록 삭제하기
	public boolean doDelete(String delName) {
		ReadCSVfile_Edit.loadRestaurants(ReadCSVfile_Edit.Restaurant_DATA); // 콘솔 실행 시 CSV 불러오기 하면 삭제 가능
		Restaurant removed = ReadCSVfile_Edit.getRestaurantMap().remove(delName);

		if (removed != null) {
			// List에서도 삭제
			ReadCSVfile_Edit.getrestaurantList().remove(removed);
			return true; // 성공
		}
		return false; // 실패
	}
}
