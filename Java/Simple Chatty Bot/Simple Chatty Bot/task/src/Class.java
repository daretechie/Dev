import java.util.Scanner;

public class Class {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        boolean t = true;
        boolean f = false;
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        if((h1 > h2) && (h2 > h3)){
            System.out.print(t);
        }
        else if ((h1 < h2) && (h2 < h3)) {
            System.out.print(t);
        }
        else if ((h1 == h2) && (h2 < h3)) {
            System.out.print(t);
        }
        else if ((h1 == h2) && (h2 == h3)){
            System.out.print("correctly arranged");
        }
        else {
            System.out.print(f);
        }
    }


}
