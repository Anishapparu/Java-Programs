import java.util.Scanner;
public class prorstring {
    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        String s="%$#*^";
        String p;
        int[] arr=new int[5];
        int temp;
        String[] arr1=new String[5];
        for(int i=0;i<5;i++){
            arr[i]=s.charAt(i);
        }
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(s);
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("The priority symbols are: ");
       for(int i=0;i<5;i++){
           char c=(char)(arr[i]);
           System.out.print(c+" ");
       }




    }
}
