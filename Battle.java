package com.pcwk.ehr.projectbattle;

//Battle
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.pcwk.ehr.projectcrud.Restaurant;

public class B_Restaurant {

    //  기존 메서드들 생략

	public static void battleMode(List<Restaurant> restaurantList) {
	    if (restaurantList.size() < 2) {
	        System.out.println("맛집이 2곳 이상 있어야 배틀이 가능합니다.");
	        return;
	    }

	    Scanner scanner = new Scanner(System.in);
	    Random random = new Random();

	    while (true) {
	        int index1 = random.nextInt(restaurantList.size());
	        int index2;

	        do {
	            index2 = random.nextInt(restaurantList.size());
	        } while (index1 == index2);

	        Restaurant r1 = restaurantList.get(index1);
	        Restaurant r2 = restaurantList.get(index2);

	        System.out.println("\n맛집 배틀! 다음 두 곳 중 어디가 더 끌리나요?");
	        System.out.println("[1] " + r1);
	        System.out.println("[2] " + r2);
	        System.out.println("[3] 맘에 들지 않으면 다시 뽑기");
	        System.out.print("선택(1, 2, 3): ");

	        String input = scanner.nextLine();

	        switch (input) {
	            case "1":
	                System.out.println("\n선택한 맛집: " + r1);
	                return;  // 종료
	            case "2":
	                System.out.println("\n선택한 맛집: " + r2);
	                return;  // 종료
	            case "3":
	                System.out.println("\n맘에 들지 않으면 다시 뽑으세요!");
	                // 루프 반복하며 재추첨
	                break;
	            default:
	                System.out.println("잘못된 입력입니다. 다시 선택하세요.");
	                // 루프 반복하며 재입력
	        }
	    }
	}
}


