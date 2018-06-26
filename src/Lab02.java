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
        if (x >61) {
            IllegalArgumentException ex = new IllegalArgumentException("подкоренное выражение меньше 0");
            throw ex;
        }
        double a = 3 * (Math.sqrt(61 - x));
        return a;

    }


}
