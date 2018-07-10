import java.io.FileReader;

public class Lab02 {
    public static double task4411(double x) {
        double a = x + 7;
        return a;
    }

    public static double task2790(double x) {
        double e = Math.sqrt(1 - Math.pow(Math.sin(Math.toRadians(x)), 2));
        return e;
    }

    public static double task9020(double x) {
        if (x > 61) {
            IllegalArgumentException ex = new IllegalArgumentException("подкоренное выражение меньше 0");
            throw ex;
        }
        double a = 3 * (Math.sqrt(61 - x));
        return a;

    }

    public static double task3943(int x, int y) {
        if (x + Math.sqrt(y) < -1) {
            IllegalArgumentException ex = new IllegalArgumentException("Подкоренное выражение должно быть неотрицательным ");
            throw ex;
        }
        double a = -5 * Math.sqrt(x + Math.sqrt(y));
        return a;
    }

    public static double task7799(int mass, int aDeg) {
        if (mass<1) {
            IllegalArgumentException ex = new IllegalArgumentException("Масса должна быть положительной ");
            throw ex;
        }

       double force = mass*9.8067*Math.cos(aDeg*Math.PI/180); //поменять на а рад
        return force;

    }
    public static double task9354(int a, int b, int c){
        if (a == 0) {
            IllegalArgumentException ex = new IllegalArgumentException("Уравнение y=0x^2+1x+3 не является квадратным ");
            throw ex;
        }
        double discriminant = Math.pow(b,2)-4*a*c;
        return discriminant;

    }

    }





