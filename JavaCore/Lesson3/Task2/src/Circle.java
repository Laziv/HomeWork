public class Circle {
    public double radius;
    public double diameter;

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = radius * 2;
    }

    public void calculateSquare(){
        double rez =  (Math.PI / 4) * (diameter * diameter);
        System.out.println("Площа кола при діаметрі " + diameter + " = " + rez);
    }

    public void calculateLength(){
        double rez =  Math.PI * diameter;
        System.out.println("Довжина кола при радіосі " + radius + " = " + rez);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        circle1.calculateSquare();
        circle1.calculateLength();
    }

}
