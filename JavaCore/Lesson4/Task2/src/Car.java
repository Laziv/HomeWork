public class Car {
    private String model;
    private int maxSpeed;
    private String transmission;
    private double engineDisplacement;
    private SteeringWheel steeringWheel;
    private Wheel wheell;
    private CarBody carBody;

    public Car(String model, int maxSpeed, String transmission, double engineDisplacement, SteeringWheel steeringWheel, Wheel wheell, CarBody carBody) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.engineDisplacement = engineDisplacement;
        this.steeringWheel = steeringWheel;
        this.wheell = wheell;
        this.carBody = carBody;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public Double getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(Double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Wheel getWheell() {
        return wheell;
    }

    public void setWheell(Wheel wheell) {
        this.wheell = wheell;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }


    public String toString() {
        return "this car is a " + model + " with an engine capacity of " + engineDisplacement + " and an automatic transmission and a top speed of "+ maxSpeed+" km per hour"
                + "\n" + carBody.toString()
                + "\nalso the car has " + steeringWheel.toString() + " and " + wheell.toString();
    }
}
