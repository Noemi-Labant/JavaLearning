package StreamApi;

public class Car {

    private String color;
    private int weight;
    private boolean isElectric;

    public Car(String color, int weight, boolean isElectric) {
        this.color = color;
        this.weight = weight;
        this.isElectric = isElectric;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public boolean getIsElectric() {
        return isElectric;
    }
}
