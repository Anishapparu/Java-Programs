import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner old=new Scanner(System.in);
        int n=old.nextInt();
        String s=old.next();
        if(check(s,n)=="0"){
            System.out.print(" ");
        }
        else if(check(s,n)=="1"){
            System.out.print("Invalid");
        }
        else{
            System.out.print(check(s,n));
        }
    }
    public static String check(String s,int n){
        StringBuilder sb=new StringBuilder();
        if(n==0){
            return "0";
        }
        if(n<0){
            return "1";
        }
        for(int i=0;i<n;i++){
            sb.append(s);
        }
        return sb.toString();
    }
}