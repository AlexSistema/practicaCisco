import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = (sc.nextInt());
        while (j <= 50) {
            j += sc.nextInt();
            System.out.println(j);
        }
    }
}