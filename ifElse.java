import java.util.Scanner;

public class ifElse {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scan.close();

        if (N%2!=0){
            System.out.println("Wierd");
        } else if (N<5) {
            System.out.println("Not Wierd");
        } else if (N<=20){
            System.out.println("Wierd");
        } else {
            System.out.println("Not Wierd");
        }
    }
}
