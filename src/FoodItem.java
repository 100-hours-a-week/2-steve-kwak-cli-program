public class FoodItem {
    String name;

    FoodItem(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("선택한 메뉴: " + name);
    }
}
