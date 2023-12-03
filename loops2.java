public class loops2 {
    public static void main(String[] args) {
    createSeries(0,2,10);
    }
    public static void createSeries(int a,int b,int n){
        for (int i = 0; i < n; i++) {
            int secpart = 0;
            for (int j = 0; j <= i; j++) {
                secpart = secpart + (int)(Math.pow(2,j)*b);
            }
            if(i!=(n-1)){
                System.out.print((a+secpart)+" ");
            }else{
                System.out.print(a+secpart);
            }
        }
    }
}

