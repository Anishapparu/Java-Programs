import java.util.*;
class primenot{
    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        int num=old.nextInt();
        int count=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count>=1){
            System.out.print("Not a prime");
        }
        else if(count==0){
            System.out.print("Prime number");
        }
    }
}
