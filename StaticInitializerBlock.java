import java.util.*;
public class StaticInitializerBlock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int b = scan.nextInt();
        try{
            if (b <= 0|| h<=0){
                throw new Exception("Breadth and height must be positive");
            }else{
                System.out.println(b*h);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}