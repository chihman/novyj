import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Target;

public class Lab01Suite {
    @Test// отправляет в лаб02 сравнивает с известным результатом (аль+ентер юнит4)
    public void task4411test(){
        double result; //переменная
        result=Lab02.task4411(11.13);
        Assert.assertEquals(18.13,result,0.001);//класс для проверки значений,


        double result2;
        result2=Lab02.task4411(-7919);
        Assert.assertEquals(-7912,result2,0.001);

        double result3;
        result3=Lab02.task4411(0);
        Assert.assertEquals(7,result3,0.001);

    }
    @Test
    public void  task2790test(){
        double result;
        result = Lab02.task2790(6997);
        Assert.assertEquals(0.9205,result,0.001);


        result = Lab02.task2790(31);
        Assert.assertEquals(0.8572,result,0.001);


        result= Lab02.task2790(90);
        Assert.assertEquals(0,result,0.001);


        result = Lab02.task2790(0);
        Assert.assertEquals(1,result,0.001);


        result = Lab02.task2790(180);
        Assert.assertEquals(1,result,0.001);
    }
    @Test
    public void task3946test(){
        double result;
        int[] arr =new int[]{1,2,3,4,1}; //создание тест массива
        result =Lab07.task3946(arr);//отправка в лаб7 запись в переменную резулт
        Assert.assertEquals(2.2,result,0.001);//сравнение с известным результатом с точностью 0,001

        arr = new int []{1,2,3,4,1,3,4,4,4,4};
        result =Lab07.task3946(arr);
        Assert.assertEquals(3,result,0.001);

        arr = new int []{};
        result =Lab07.task3946(arr);
        Assert.assertEquals(0,result,0.001);
    }

}
