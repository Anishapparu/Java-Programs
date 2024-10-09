import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner old= new Scanner(System.in);
        String s=old.nextLine();
        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=((int)(s.charAt(i))-48);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                int j=i;
                int sum=0;
                while(arr[j]!=0){
                    sum+=arr[j];
                    j++;
                }
                char c=((char)(sum+64));
                System.out.print(c);
                i=j;
            }
        }
    }
    
}