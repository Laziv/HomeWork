import org.w3c.dom.ls.LSOutput;

public class ControlAirplane extends Airplane{
    public ControlAirplane(int length, int width, int weight) {
        super(length, width, weight);
    }

    public void motionUp() {
        System.out.println("Рухаємось верх на " + Random.getRandomNum(500, 1000) + " км.");
    }

    public void motionDown() {
        System.out.println("Рухаємось вниз на " + Random.getRandomNum(50, 100) + " км.");
    }

    public void motionForward() {
        System.out.println("Рухаємось впред на " + Random.getRandomNum(50, 10000) + " км.");
    }

    public void motionBackwards() {
        System.out.println("Рухаємось назад на " + Random.getRandomNum(5, 10) + " км.");
    }

}
