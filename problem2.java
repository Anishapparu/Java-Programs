import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner old=new Scanner(System.in);
        String s=old.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                if(i!=0){
                    System.out.print(" ");
                }
                char var=s.charAt(i);
                System.out.print((char)(var+32));
            }
            else{
                System.out.print(s.charAt(i));
            }
        }
    }
}