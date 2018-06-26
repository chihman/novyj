/**
 * Created by pro-28 on 26.06.2018.
 */
public class Runner9020 {
    public static void main(String[] args) {


       double c= Lab02.task9020(0);
        System.out.println(c);
        c= Lab02.task9020(-9);
        System.out.println(c);
         c= Lab02.task9020(61);
        System.out.println(c);
         c= Lab02.task9020(60);
        System.out.println(c);


        try {
            c = Lab02.task9020(62);
            System.out.println(c);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            c = Lab02.task9020(7573);
            System.out.println(c);

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            c = Lab02.task9020(75);
            System.out.println(c);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
