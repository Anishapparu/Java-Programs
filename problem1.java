import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner old=new Scanner(System.in);
        String s=old.nextLine();
        String s1="";
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(0))){
                s1+=Character.toLowerCase(s.charAt(0));
            }
            else if(Character.isUpperCase(s.charAt(i))){
                s1+=" ";
                s1+=Character.toLowerCase(s.charAt(i));
            }
            else{
                s1+=s.charAt(i);
            }
        }
        System.out.print(s1);
    }
}