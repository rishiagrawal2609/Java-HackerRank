import java.util.Scanner;

public class stdInAndStdOut2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String sc = scan.nextLine();
        String s = scan.nextLine();


        System.out.println("String: "+ s);
        System.out.println("Double: "+ d);
        System.out.println("Integer: " + i);


    }
}
