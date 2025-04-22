//Restaurant 코드

public class Restaurant {
    private String resName;
    private double rating;
    private String RmenuName;
    private int RmenuCost;

    public Restaurant(String resName, double rating, String RmenuName, int RmenuCost) {
        this.resName = resName;
        this.rating = rating;
        this.RmenuName = RmenuName;
        this.RmenuCost = RmenuCost;
    }

    public int getECost() {
        return (int)(RmenuCost / rating);
    }

    public String toString() {
        return String.format("가게이름: %s | 평점: %.1f | 대표메뉴: %s | 가격: %d | 가성비: %d",
            resName, rating, RmenuName, RmenuCost, getECost());
    }

    // getter & setter 생략 가능
}
