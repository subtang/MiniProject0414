/**
 * Package Name : com.pcwk.ehr.projectmain <br/>
 * Class Name: RestaurantManager.java <br/>
 * Description:  <br/>
 * Modification imformation : <br/> 
 * ------------------------------------------<br/>
 * 최초 생성일 : 2025-04-24<br/>
 *
 * ------------------------------------------<br/>
 * @author :user
 * @since  :2024-09-09
 * @version: 0.5
 */
package com.pcwk.ehr.projectmain;

import com.pcwk.ehr.projectcrud.*;
import com.pcwk.ehr.projectbattle.*;
import java.util.*;

public class RestaurantManager {


public static void C_Details(List<Restaurant> list, String file) {
    C_Restaurant.addRestaurant(list, file);
}

public static void S_U_Restaurant(List<Restaurant> list, String file) {
    U_Restaurant.U_Restaurant(list, file);
}

public static void S_D_Restaurant(List<Restaurant> list, String file) {
    Scanner sc = new Scanner(System.in);
    System.out.print("삭제할 가게 이름: ");
    String name = sc.nextLine();

    Restaurant target = null;
    for (Restaurant r : list) {
        if (r.getResName().equalsIgnoreCase(name)) {
            target = r;
            break;
        }
    }

    if (target != null) {
        list.remove(target);
        Save.saveRestaurants(file, list);
        System.out.println("\n 삭제 완료!");
    } else {
        System.out.println("\n 해당 가게를 찾을 수 없습니다.");
    }
}

public static void S_Restaurant(List<Restaurant> list) {
    if (list.isEmpty()) {
        System.out.println("\n 등록된 맛집이 없습니다.");
    } else {
        System.out.println("\n 전체 맛집 목록:");
        list.forEach(System.out::println);
    }
}

public static void B_S_Mark(List<Restaurant> list) {
    B_Restaurant.battleMode(list);
}

public static List<Restaurant> Restaurant_Mark(List<Restaurant> list) {
    return list;
}
}
