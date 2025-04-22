//Savecode

public static void saveRestaurants(String filename, List<Restaurant> restaurantList) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
        // 첫 줄 헤더 작성
        bw.write("resName,rating,RmenuName,RmenuCost");
        bw.newLine();

        for (Restaurant r : restaurantList) {
            String line = String.format("%s,%.1f,%s,%d",
                    r.getResName(), r.getRating(), r.getRmenuName(), r.getRmenuCost());
            bw.write(line);
            bw.newLine();
        }
        System.out.println("저장 완료!");
    } catch (IOException e) {
        System.out.println("파일 저장 오류: " + e.getMessage());
    }
}

public String getResName() {
    return resName;
}

public double getRating() {
    return rating;
}

public String getRmenuName() {
    return RmenuName;
}

public int getRmenuCost() {
    return RmenuCost;
}

//Save Test Code

public class Main {
    public static void main(String[] args) {
        List<Restaurant> restaurants = RestaurantManager.loadRestaurants("restaurants.csv");

        // 예시로 첫 번째 레스토랑 삭제
        if (!restaurants.isEmpty()) {
            restaurants.remove(0);
        }

        // 저장
        RestaurantManager.saveRestaurants("restaurants.csv", restaurants);
    }
}
