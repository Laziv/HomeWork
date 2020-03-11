public abstract class Airplane {
    private int length;
    private int width;
    private int weight;

    public Airplane(int length, int width, int weight) {
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public void startEngines() {
        System.out.println("До готовності злетіти залишилось " + Random.getRandomNum(20, 88) + " сек.");
    }

    public void takeoffAirplane() {
        System.out.println("Літак на повному баку палива пролетить " + Random.getRandomNum(0, 1000) + " км.");
    }

    public void landingAirplane() {
        System.out.println("Літак іде на посадку");
    }
}
