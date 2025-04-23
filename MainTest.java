package com.pcwk.ehr.projectmain;

import java.util.List;
import java.util.Scanner;

import com.pcwk.ehr.projectcrud.D_Restaurant;
import com.pcwk.ehr.projectcrud.R_Restaurant;
import com.pcwk.ehr.projectcrud.ReadCSVfile_Edit;
import com.pcwk.ehr.projectcrud.Restaurant;

public class MainTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ReadCSVfile_Edit.loadRestaurants(ReadCSVfile_Edit.Restaurant_DATA); // 시작 시 CSV 불러오기

		// 객체 생성
		R_Restaurant rService = new R_Restaurant();
		D_Restaurant dService = new D_Restaurant();

		System.out.println("번호를 선택하시오>");
		int num = sc.nextInt();
		String str = sc.nextLine(); // 문자열 입력 받기 버퍼 때문

		switch (num) {
		case 1: // 1. 전체 목록 조회
			List<Restaurant> all = rService.doRetrieve();
			for (Restaurant res : all) {
				System.out.println(res);
			}
			System.out.println("전체 리스트 출력 완료");
			break;

		case 2: // 2. 단건 목록 조회
			System.out.print("가게명 입력: ");
			String resName = sc.nextLine();
			Restaurant one = rService.doSelectOne(resName);
			if (one != null) {
				System.out.println("'" + one + "'" + "\n조회 완료!");
			} else {
				System.out.println("'" + resName + "'" + "\n가게 이름을 다시 확인해주세요!");
			}
			break;

		case 3: // 삭제
			System.out.print("삭제할 가게명 입력: ");
			String delName = sc.nextLine();
			boolean deleted = dService.doDelete(delName);
			System.out.println(deleted ? "삭제 성공!" : "삭제 실패 가게명을 확인하시오!");
			break;
		}

	}

}
