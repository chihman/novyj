/**
 * Created by pro-28 on 19.06.2018.
 */
public class Lab07 {
    public static double task3946(int[] arr) {//принимает массив целых чисел
        if (arr.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double result;
        result = sum / arr.length;
        return result;

    }

    public static int task4283(int k, int[] arr) {

        int c = 0;
        int n = 0;
        for (int i = 0; i != arr.length; i++) {
            if (arr[n] == k) {
                c = c + 1;
            }
            n = n + 1;

        }
        System.out.println(c);
        return c;
    }

    public static double[] task6497(int[] arr) {
        double c = 0;
        for (int i = 0; i != arr.length; i++) {
            c = c + arr[i];
            System.out.println(c);
        }
        c = c / arr.length;
        double a = 0;
        double[] arr2 = new double[arr.length + 1];

        for (int i = 0; i != arr.length; i++) {
            a = arr[i] - c;
            arr2[i] = a;
        }
        return arr2;
    }


    public static void task9774(double x, double[] arr) {//поменял void на возвращает

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * x;
            System.out.println(arr[i]);

        }

    }

    public static double[] task9271(double[] arr) {
        double[] arr2 = new double[arr.length];
        double a = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < a) {
                a = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - a;
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static String task1292(char [] a) {

        char[] arr = new char[a.length];
        int i = 0;
        while (a [i]!= 'X') {

            arr[i] = a[i];
            i++;
        }

        String b = new String(arr);

        return b;
    }

}