public class CarBody {
    private String color;
    private String type;
    private int amountOfDoors;

    public CarBody(String color, String type, int amountOfDoors) {
        this.color = color;
        this.type = type;
        this.amountOfDoors = amountOfDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmountOfDoors() {
        return amountOfDoors;
    }

    public void setAmountOfDoors(int amountOfDoors) {
        this.amountOfDoors = amountOfDoors;
    }

    public String toString() {
        return "the body of the car is a " + color + " " + type + " which has " + amountOfDoors +" doors";
    }

}
