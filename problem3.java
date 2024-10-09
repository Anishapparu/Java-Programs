import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String[] args){
        Scanner old=new Scanner(System.in);
        int num=old.nextInt();
        int count=0;
        int k=0,l=0;
        for(int i=0;i<num;i++){
            if(i%2==0){
                System.out.print((int)Math.pow(2,k)+" ");
                k++;
            }
            else{
                System.out.print((int)Math.pow(3,l)+" ");
                l++;
            }
        }
    }
}