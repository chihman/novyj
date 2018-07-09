public class Runner7799 {
    public static void main(String[] args) {



        try {
            double c = Lab02.task7799(5, 45);
            System.out.println(c);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            double c = Lab02.task7799(7297, 30);
            System.out.println(c);

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            double c = Lab02.task7799(10, 90);
            System.out.println(c);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
