import java.util.ArrayList;

public class Mara extends FoodItem {
    ArrayList<String> ingredients;
    Spiciness spiciness;

    Mara(String name, int spicinessLevel) {
        super(name);
        ingredients = new ArrayList<>();
        spiciness = new Spiciness(spicinessLevel);  // 맵기 설정
    }

    void addIngredients(ArrayList<String> ingredients) {
        this.ingredients.addAll(ingredients);
    }

    @Override
    void display() {
        super.display();
        System.out.println("선택한 재료: " + ingredients);
        spiciness.displaySpiciness();  // 맵기 출력
    }
}
