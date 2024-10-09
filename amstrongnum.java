import java.util.*;
class amstrongnum{
    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        int num=old.nextInt();
        int temp=num;
        int temp1=num;
        int count=0,rem,pow=1,add=0;
        while (temp1 != 0) {
            count++;
            temp1/=10;
        }
        System.out.print(count);
        while(temp!=0){
            rem=temp%10;
            for(int i=0;i<count;i++){
                pow*=rem;
            }
            add+=pow;
            temp=temp/10;
        }
        System.out.print(add);
    }
}
