package com.pcwk.ehr.projectcrud;

//Delete
public static void deleteRestaurant(List<Restaurant> restaurantList, String filename) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("삭제할 가게 이름을 입력하세요: ");
    String targetName = scanner.nextLine();

    boolean removed = restaurantList.removeIf(r -> r.getResName().equalsIgnoreCase(targetName));

    if (removed) {
        saveRestaurants(filename, restaurantList);
        System.out.println("맛집이 삭제되었습니다!");
    } else {
        System.out.println("해당 가게를 찾을 수 없습니다.");
    }
}
}

//Delete Test Code
//public class Main {
//    public static void main(String[] args) {
//        String file = "restaurants.csv";
//        List<Restaurant> restaurants = RestaurantManager.loadRestaurants(file);
//
//        RestaurantManager.deleteRestaurant(restaurants, file);
//    }
//}
