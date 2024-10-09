import java.util.*;
class primearray{
    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        int num1=old.nextInt();
        int flag=0;
        for(int i=2;i<num1;i++){
            if(num1%i!=0){
                flag++;

            }
        }
        if(flag>=1) {
            System.out.println("the number is prime");
        }
    }
}