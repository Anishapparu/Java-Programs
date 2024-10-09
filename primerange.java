import java.util.*;
public class primerange {
    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        int num=old.nextInt();
        for(int i=2;i<=num;i++){
            boolean isPrime=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.print(i+" ");
            }
        }
    }
}
