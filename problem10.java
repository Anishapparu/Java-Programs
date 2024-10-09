import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String[] args){
        Scanner old=new Scanner(System.in);
        String s=old.nextLine();
        int j=0,sum=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                sum+=(int)Math.pow(2,j);
            }
            j++;
        }
        System.out.print(sum);
    }
}