import java.util.Scanner;
import java.lang.Math;
class amstrongnew{
    public static void main(String[] args){
        Scanner old=new Scanner(System.in);
        int num=old.nextInt();
        int temp=num;
        int tempp=num;
        int rem,sum=0,flag=0,remm,power=1,count=0;
        while(temp!=0){
            rem=temp%10;
            count++;
            temp/=10;
        }
        while(tempp!=0){
            remm=tempp%10;
            sum+=(Math.pow(remm,count));
            tempp/=10;
        }
        if(sum==num){
            flag=1;
        }
        if(flag==1){
            System.out.print(num+" Hi Janu");
        }
        else{
            System.out.print(num+" Bye Janu");
        }
        System.out.println("\n"+count+" "+sum);
    }
}