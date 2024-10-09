import java.util.*;
class arrdup{
    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        int range=old.nextInt();
        int[] arr=new int[range];
        int[] temp=new int[range];
        for(int i=0;i<range;i++){
            arr[i]=old.nextInt();
        }
        for(int i=0;i<range;i++){
            for(int j=i+1;j<range;j++){
                if(arr[i]==arr[j]){
                    continue;
                }
                else if(arr[i]!=arr[j]){
                    temp[i]=arr[i];
                }
            }
        }
        for(int i=0;i<range;i++){
            System.out.print(temp[i]+" ");
        }
    }
}