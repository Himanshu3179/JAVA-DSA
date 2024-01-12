public class pattern2 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("*");
        }
        System.out.println();
        int stars = n - 1;
        int spaces = 1;

        for (int row = 1; row <= n - 1; row++) {
            for (int csr = 1; csr <= stars; csr++) {
                System.out.print("*");
            }
            for (int csp = 1; csp <= spaces; csp++) {
                System.out.print(" ");
            }

            for (int csr = 1; csr <= stars; csr++) {
                System.out.print("*");
            }

            // prep
            stars--;
            spaces += 2;
            System.out.println();
        }

    }
}
