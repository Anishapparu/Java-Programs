import java.util.*;
class back {
    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        int range=old.nextInt();
        int[] arr=new int[range];
        int flag=0;
        for(int i=1;i<=range;i++){
            arr[i]=old.nextInt();
        }
        for(int i=0;i<range;i++){
            for(int j=i+1;j<=range;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" ");
                }
                else{
                    if(arr[i]!=arr[j]){
                        flag=1;
                    }
                }
            }
        }
        for(int i=0;i<range;i++){
            for(int j=i+1;j<=i+2;j++){
                if(arr[i]!=arr[j]){
                    flag=1;
                }
            }
        }
        if(flag==1){
            System.out.println("No duplicate");
        }
    }
}