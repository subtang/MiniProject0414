package com.pcwk.ehr.projectmain;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = "restaurants.csv";
        List<Restaurant> restaurants = RestaurantManager.loadRestaurants(file);

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
                    if (AuthManager.login()) {
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
                    S_Restaurant(restaurants);
                    break;
                case "2":
                    B_Restaurant(restaurants);
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
                    C_Restaurant(restaurants, file);
                    break;
                case "2":
                    U_Restaurant(restaurants, file);
                    break;
                case "3":
                    D_Restaurant(restaurants, file);
                    break;
                case "0":
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    public static void S_Restaurant(List<Restaurant> restaurants) {
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }

    public static void C_Restaurant(List<Restaurant> restaurants, String file) {
        RestaurantManager.C_Details(restaurants, file);
    }

    public static void U_Restaurant(List<Restaurant> restaurants, String file) {
        RestaurantManager.S_U_Restaurant(restaurants, file);
    }

    public static void D_Restaurant(List<Restaurant> restaurants, String file) {
        RestaurantManager.S_D_Restaurant(restaurants, file);
    }

    public static void B_Restaurant(List<Restaurant> restaurants) {
        List<Restaurant> selected = RestaurantManager.Restaurant_Mark(restaurants);
        RestaurantManager.B_S_Mark(selected);
    }
