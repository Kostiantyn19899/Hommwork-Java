package homework1410;

public class Task4 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i < n +1 ; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n -1; i > 0 ; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
