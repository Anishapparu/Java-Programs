import java.util.*;
class stringg{
    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        int num,sum=0;
        System.out.println("Enter number");
        num=old.nextInt();
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}