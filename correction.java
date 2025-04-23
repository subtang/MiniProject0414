package com.pcwk.ehr.projectcrud;
//Correcton

public static void updateRestaurant(List<Restaurant> restaurantList, String filename) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("수정할 가게 이름을 입력하세요: ");
    String targetName = scanner.nextLine();

    boolean found = false;
    for (Restaurant r : restaurantList) {
        if (r.getResName().equalsIgnoreCase(targetName)) {
            System.out.println("기존 정보: " + r);

            System.out.print("새 가게 이름을 입력하세요 (그대로 두려면 Enter): ");
            String newName = scanner.nextLine();
            if (!newName.isEmpty()) r.setResName(newName);

            System.out.print("새 평점을 입력하세요 (예: 4.5, Enter로 건너뜀): ");
            String newRatingStr = scanner.nextLine();
            if (!newRatingStr.isEmpty()) r.setRating(Double.parseDouble(newRatingStr));

            System.out.print("새 대표 메뉴 이름 (Enter로 건너뜀): ");
            String newMenu = scanner.nextLine();
            if (!newMenu.isEmpty()) r.setRmenuName(newMenu);

            System.out.print("새 대표 메뉴 가격 (Enter로 건너뜀): ");
            String newCostStr = scanner.nextLine();
            if (!newCostStr.isEmpty()) r.setRmenuCost(Integer.parseInt(newCostStr));

            found = true;
            break;
        }
    }

    if (found) {
        saveRestaurants(filename, restaurantList);
        System.out.println("맛집 정보가 수정되었습니다!");
    } else {
        System.out.println("해당 가게를 찾을 수 없습니다.");
    }
}

public void setResName(String resName) {
    this.resName = resName;
}

public void setRating(double rating) {
    this.rating = rating;
}

public void setRmenuName(String RmenuName) {
    this.RmenuName = RmenuName;
}

public void setRmenuCost(int RmenuCost) {
    this.RmenuCost = RmenuCost;
}
}

//Correction Test Code
//public class Main {
//    public static void main(String[] args) {
//        String file = "restaurants.csv";
//        List<Restaurant> restaurants = RestaurantManager.loadRestaurants(file);
//
//        RestaurantManager.updateRestaurant(restaurants, file);
//    }
//}
