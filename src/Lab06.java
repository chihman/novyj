public class Lab06 {
    public static long task3669(int a, int b) {
        long c = 0;
        long q = 0;
        if (a > b) {
            q=b;
            for (int i = a - b; i > 0; i--) {
                q = q * (b + 1);
                b=b+1;
            }
            System.out.println(q);


        } else {
            q = a;
            for (int i = b - a; i > 0; i--) {
                q = q * (a + 1);
                a = a + 1;

                System.out.println(q);

            }
        }
        return q;
    }
}


