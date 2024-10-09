import java.util.Scanner;
class countstring{
    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        String s=old.nextLine();
        int count=0;
        char c=old.next().charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                    count++;
                }
            }

        System.out.print(count);
    }
}