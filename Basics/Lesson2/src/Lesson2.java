public class Lesson2 {
    public static void main(String agrs[]) {
        //1
        int a = 9;
        int b = -30;
        int c = 25;
        int d = b * b - 4 * a * c;
        if (d > 0) {
            int x1 = (-b + (int) Math.sqrt(d)) / (2 * a);
            int x2 = (-b - (int) Math.sqrt(d)) / (2 * a);
            System.out.println("x1=" + x1 + "; x2=" + x2);
        } else if (d == 0) {
            int x = -b / (2 * a);
            System.out.println("x=" + x);
        } else {
            System.out.println("рівняння не має коренів");
        }
        //2
        byte vByte = 127;
        short vShort = 32767;
        char vChar = 'A';
        boolean vBool = false;
        int vInt = 2147483647;
        long vLong = 9223372036854775807L;
        float vFloat = 2.5F;
        double vDouble = 100.64745;
    }
}
