public class Runner3943 {
    public static void main(String[] args) {


        double c = Lab02.task3943(-5,81);
        System.out.println(c);
        c = Lab02.task3943(7507,7499);
        System.out.println(c);
        c = Lab02.task3943(7489,-7489);
        System.out.println(c);
        c = Lab02.task3943(-7481,7477);
        System.out.println(c);


        try {
            c = Lab02.task3943(-5,81);
            System.out.println(c);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            c = Lab02.task3943(7507,7499);
            System.out.println(c);

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            c = Lab02.task3943(7489,-7489);
            System.out.println(c);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}