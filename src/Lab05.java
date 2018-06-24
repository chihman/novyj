public class Lab05 {
    public static String task5662(double a, double b, double c) {
        double D;
        D = Math.pow(b, 2) - 4 * a * c;
        String A = " ";
        String B = " ";
        if (D > 0) {
            A = ("Вещественных корней уравнения " + a + "x^2 + " + b + "x + " + c + " = 0 два");
            B = "2";
        }
        if (D < 0) {
            A = ("Вещественных корней уравнения " + a + "x^2 + " + b + "x + " + c + " = 0 нет");
            B = "0";
        }
        if (D == 0) {
            A = ("Вещественных корней уравнения " + a + "x^2 + " + b + "x + " + c + " = 0 один");
            B = "1";
        }
        return B;
    }

    public static boolean task4847(int x, int y, int z) {
        boolean c = x == y || z == y || z == x;
        return c;
    }

    public static boolean task6740(double x, double y) { //передаваемые значения не могут быть инт
        boolean q= (x>1&&x<3)&&(y<-1&&y>-2);//если инт у всегда фолс
        return q;
    }
}
