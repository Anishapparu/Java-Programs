import java.util.Scanner;
class calibraintsecond{
    public static void main(String[] args){
        Scanner old=new Scanner(System.in);
        String s=old.nextLine();
        int j=s.length()-1;
        int i=0;
        while(i>=0){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                break;
            }
        }
        for(int k=i;k<=j;k++){
            System.out.print(s.charAt(k));
        }
    }
}