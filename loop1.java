public class loop1 {
    public static void main(String[] args) {
        printTables(2);
    }

    public static void printTables(int N){
        for (int i = 1; i <= 10; i++) {
            System.out.println(N+" X "+i+" = "+(N*i));
        }
    }
}
