public class Triangle {
    public static void main(String[] args) {
        int height = 3;
        int starsToPrint = 1;

        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < starsToPrint; j++) {
                System.out.print("*");

                if (j < starsToPrint - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            starsToPrint += 2;
        }
    }
}