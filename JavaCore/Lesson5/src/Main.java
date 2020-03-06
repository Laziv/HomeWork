import Task5.Amphibia;
import Task5.Frog;

public class Main {
    public static void main(String[] args) {
        //Task3
        System.out.println("Максимальне число типу float в експоненціальній формі: " + Float.MAX_VALUE);
        System.out.println("Мінімальне число типу float в експоненціальній формі: " + Float.MIN_VALUE);

        System.out.println("Максимальне число типу double в експоненціальній формі: " + Double.MAX_VALUE);
        System.out.println("Мінімальне число типу double в експоненціальній формі: " + Double.MIN_VALUE);

        //Task5
        Amphibia forg = new Frog();
        forg.eat();
        forg.sleep();
        forg.swim();
        forg.walk();
    }
}
