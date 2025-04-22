//등록코드
import java.util.Scanner;

public class RestaurantManager {

    // 기존 loadRestaurants()와 saveRestaurants() 메서드 포함된 상태라고 가정

    public static void addRestaurant(List<Restaurant> restaurantList, String filename) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("가게 이름을 입력하세요: ");
        String resName = scanner.nextLine();

        System.out.print("평점을 입력하세요 (예: 4.5): ");
        double rating = Double.parseDouble(scanner.nextLine());

        System.out.print("대표 메뉴 이름을 입력하세요: ");
        String RmenuName = scanner.nextLine();

        System.out.print("대표 메뉴 가격을 입력하세요: ");
        int RmenuCost = Integer.parseInt(scanner.nextLine());

        Restaurant newRes = new Restaurant(resName, rating, RmenuName, RmenuCost);
        restaurantList.add(newRes);

        saveRestaurants(filename, restaurantList); // 리스트를 파일에 저장
        System.out.println("맛집이 등록되었습니다!");
    }
}
//등록 테스트 코드
public class Main {
    public static void main(String[] args) {
        String file = "restaurants.csv";
        List<Restaurant> restaurants = RestaurantManager.loadRestaurants(file);

        RestaurantManager.addRestaurant(restaurants, file);
    }
}
