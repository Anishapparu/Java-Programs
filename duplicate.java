import java.util.*;
class nestednew{
    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.printf("   "+i*j);
            }
            System.out.println();
        }
    }
}