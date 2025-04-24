package com.pcwk.ehr.projectmain;

import com.pcwk.ehr.projectcrud.*;
import com.pcwk.ehr.projectbattle.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = "D:\\JAP_20250317\\01_JAVA\\workspace\\JMember\\data\\restaurantListHong_edit - 시트1 (1).csv";
        List<Restaurant> restaurants = ReadCSVfile.loadRestaurants(file);

        while (true) {
            System.out.println("\n 맛집 추천 프로그램 🍴");
            System.out.println("1. 사용자 모드");
            System.out.println("2. 관리자 모드");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    R_Restaurant(restaurants);
                    break;
                case "2":
                    if (Login.login()) {
                        adminMenu(restaurants, file);
                    }
                    break;
                case "0":
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    // 사용자 메뉴
    public static void R_Restaurant(List<Restaurant> restaurants) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n 사용자 모드");
            System.out.println("1. 맛집 목록 조회");
            System.out.println("2. 배틀 모드");
            System.out.println("0. 메인 메뉴로");
            System.out.print("선택: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    RestaurantManager.S_Restaurant(restaurants);  // RestaurantManager 메서드 호출
                    break;
                case "2":
                    RestaurantManager.B_S_Mark(restaurants);  // RestaurantManager 메서드 호출
                    break;
                case "0":
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    // 관리자 메뉴
    public static void adminMenu(List<Restaurant> restaurants, String file) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n 관리자 모드");
            System.out.println("1. 맛집 등록");
            System.out.println("2. 맛집 수정");
            System.out.println("3. 맛집 삭제");
            System.out.println("0. 메인 메뉴로");
            System.out.print("선택: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    RestaurantManager.C_Details(restaurants, file);  // RestaurantManager 메서드 호출
                    break;
                case "2":
                    RestaurantManager.S_U_Restaurant(restaurants, file);  // RestaurantManager 메서드 호출
                    break;
                case "3":
                    RestaurantManager.S_D_Restaurant(restaurants, file);  // RestaurantManager 메서드 호출
                    break;
                case "0":
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}