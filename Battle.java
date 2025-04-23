package com.pcwk.ehr.projectbattle;

//Battle
import java.util.*;

public class Battle {

    //  기존 메서드들 생략

    public static void battleMode(List<Restaurant> restaurantList) {
        if (restaurantList.size() < 2) {
            System.out.println("맛집이 2곳 이상 있어야 배틀이 가능합니다.");
            return;
        }

        Random random = new Random();
        int index1 = random.nextInt(restaurantList.size());
        int index2;

        // 중복 방지
        do {
            index2 = random.nextInt(restaurantList.size());
        } while (index1 == index2);

        Restaurant r1 = restaurantList.get(index1);
        Restaurant r2 = restaurantList.get(index2);

        System.out.println(" 맛집 배틀! 다음 두 곳 중 어디가 더 끌리나요?");
        System.out.println("\n[1] " + r1);
        System.out.println("[2] " + r2);

        // 선택은 여기선 안 받아도 되고, 필요하면 추가 가능!
    }
}


