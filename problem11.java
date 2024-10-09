import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner old=new Scanner(System.in);
        int num=old.nextInt();
        int sum=0,rem=0;
        while(num!=0){
            rem=num%10;
            sum+=rem;
            num/=10;
        }
        int flag=0;
        for(int i=2;i<sum;i++){
            if(sum%i==0){
               flag=1;
            }
        }
        if(flag==1){
            System.out.print("No");
        }
        else{
            System.out.print("Yes");
        }
    }
}