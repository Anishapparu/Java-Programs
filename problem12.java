import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner old=new Scanner(System.in);
        String s=old.nextLine();
        String[] str=s.split(" ");
        int max=0,count=0;
        String val="";
        for(int i=0;i<str.length;i++){
            String s1=str[i];
            for(int j=0;j<s1.length();j++){
                count=0;
                for(int k=0;k<s1.length();k++){
                    if(s1.charAt(j)==s1.charAt(k)){
                        count++;
                    }
                }
                if(count>max){
                    max=count;
                    val=str[i];
                }
            }
        }
        System.out.print(val+" "+max);
    }
}