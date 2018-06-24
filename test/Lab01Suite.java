import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Target;

public class Lab01Suite {
    @Test// отправляет в лаб02 сравнивает с известным результатом (аль+ентер юнит4)
    public void task4411test() {
        double result; //переменная
        result = Lab02.task4411(11.13);
        Assert.assertEquals(18.13, result, 0.001);//класс для проверки значений,


        double result2;
        result2 = Lab02.task4411(-7919);
        Assert.assertEquals(-7912, result2, 0.001);

        double result3;
        result3 = Lab02.task4411(0);
        Assert.assertEquals(7, result3, 0.001);

    }

    @Test
    public void task2790test() {
        double result;
        result = Lab02.task2790(6997);
        Assert.assertEquals(0.9205, result, 0.001);


        result = Lab02.task2790(31);
        Assert.assertEquals(0.8572, result, 0.001);


        result = Lab02.task2790(90);
        Assert.assertEquals(0, result, 0.001);


        result = Lab02.task2790(0);
        Assert.assertEquals(1, result, 0.001);


        result = Lab02.task2790(180);
        Assert.assertEquals(1, result, 0.001);
    }

    @Test
    public void task3946test() {
        double result;
        int[] arr = new int[]{1, 2, 3, 4, 1}; //создание тест массива
        result = Lab07.task3946(arr);//отправка в лаб7 запись в переменную резулт
        Assert.assertEquals(2.2, result, 0.001);//сравнение с известным результатом с точностью 0,001

        arr = new int[]{1, 2, 3, 4, 1, 3, 4, 4, 4, 4};
        result = Lab07.task3946(arr);
        Assert.assertEquals(3, result, 0.001);

        arr = new int[]{};
        result = Lab07.task3946(arr);
        Assert.assertEquals(0, result, 0.001);
    }

    @Test
    public void task5662test() {
        String A = Lab05.task5662(1, 2, 3);
        Assert.assertEquals("0", A);

        Lab05.task5662(11, 13, 19);
        Assert.assertEquals("0", A);
        Lab05.task5662(3, 17, 5);
        Assert.assertEquals("2", A);
        Lab05.task5662(5, 31, 29);
        Assert.assertEquals("2", A);
        Lab05.task5662(3, 6, 3);
        Assert.assertEquals("1", A);

    }

    @Test
    public void task3669test() {
        long A = Lab06.task3669(8, 13);
        Assert.assertEquals(1235520, A);
        A = Lab06.task3669(13, 8);
        Assert.assertEquals(1235520, A);
        A = Lab06.task3669(159, 161);
        Assert.assertEquals(4095840, A);
        A = Lab06.task3669(648, 648);
        Assert.assertEquals(648, A);
        A = Lab06.task3669(-2, 600);
        Assert.assertEquals(0, A);
       /* A = Lab06.task3669(35, 24);

        Assert.assertEquals("399703747322880000", A);*/
    }

    @Test
    public void task4283test() {
        int[] arr = new int[]{1, 2, 3, 4, 1, 2}; //создание тест массива через пробел не получается
        int a = Lab07.task4283(3, arr);
        Assert.assertEquals(a, 1);
        arr = new int[]{1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3}; //создание тест массива через пробел не получается
        a = Lab07.task4283(5, arr);
        Assert.assertEquals(a, 0);
        arr = new int[]{3, 2, 2, 2, 2, 2}; //создание тест массива через пробел не получается
        a = Lab07.task4283(2, arr);
        Assert.assertEquals(a, 5);
        arr = new int[]{4, 4, 4, 4, 4, 4}; //создание тест массива через пробел не получается
        a = Lab07.task4283(1, arr);
        Assert.assertEquals(a, 0);

    }

    @Test
    public void task6497test() {
        int[] arr = new int[]{9, 8, 9, 1, 1, 5, 1, 1};
        double a[] = Lab07.task6497(arr);
        double[] b = new double[]{4, 6250, 3, 6250, 4, 6250, 3, 3750, 3, 3750, 0, 6250, 3, 3750, 3, 3750};

        Assert.assertEquals(a, b);//нет точности
    }

    @Test
    public void task9774() {
        double x = 31;
        double data1[] = new double[]{9, 8, 7, 6, 5, 4};
        double a[] = Lab07.task9774(x, data1);
        double b[] = new double[]{279, 248, 217, 186, 155, 124};
        Assert.assertEquals(a, b);//нет точности

        x = -3;
        double data2[] = new double[]{9, 8, 7, 6, 5, 4};
        double a2[] = Lab07.task9774(x, data2);
        double b2[] = new double[]{-27, -24, -21, -18, -15, -12};
        Assert.assertEquals(a2, b2);//нет точности

        x = 11;
        double data3[] = new double[]{98, 76, 54};
        double a3[] = Lab07.task9774(x, data3);
        double b3[] = new double[]{1078, 836, 594};
        Assert.assertEquals(a3, b3);//нет точности

        x = 73;
        double data4[] = new double[]{,};
        double a4[] = Lab07.task9774(x, data4);
        double b4[] = new double[]{};
        Assert.assertEquals(a4, b4);//нет точности
    }

    @Test
    public void task9271test() {

        double data1[] = new double[]{5, 4, 6, 2, 3, 1};
        double a[] = Lab07.task9271(data1);
        double b[] = new double[]{4, 3, 5, 1, 2, 0};
        Assert.assertEquals(a, b);//нет точности

        double data2[] = new double[]{1, 2, 3, 4, 1, 2};
        double a2[] = Lab07.task9271(data2);
        double b2[] = new double[]{0, 1, 2, 3, 0, 1};
        Assert.assertEquals(a2, b2);//нет точности

        double data3[] = new double[]{3, 4, 1, 2, 3, 4, 1, 2, 3, 1, 2};
        double a3[] = Lab07.task9271(data3);
        double b3[] = new double[]{2, 3, 0, 1, 2, 3, 0, 1, 2, 0, 1};
        Assert.assertEquals(a3, b3);//нет точности

        double data4[] = new double[]{4, 2, 3, 4, 3, 2};
        double a4[] = Lab07.task9271(data4);
        double b4[] = new double[]{2, 0, 1, 2, 1, 0};
        Assert.assertEquals(a4, b4);//нет точности

    }

    @Test
    public void task4847test() {
        boolean c = Lab05.task4847(31, 59, 83);
        Assert.assertFalse(c);

        c = Lab05.task4847(19, 19, 41);
        Assert.assertTrue(c);
    }

    @Test
    public void task6740test() {
        boolean c = Lab05.task6740(2, -1.5);
        Assert.assertTrue(c);
        c = Lab05.task6740(0, 0);
        Assert.assertFalse(c);
    }

    @Test
    public void task1292test() {
        char[] arr = new char[]{'a', 'X'};
        String a = Lab07.task1292(arr);
        String b="a";
        Assert.assertEquals(b, a);

        char[] arr2 = new char[]{'a', 'b', 'X'};
        a = Lab07.task1292(arr);
        Assert.assertEquals("ab", a);

        char[] arr3 = new char[]{'a', 'b', 'c', 'X'};
        a = Lab07.task1292(arr);
        Assert.assertEquals("abc", a);
    }

}


