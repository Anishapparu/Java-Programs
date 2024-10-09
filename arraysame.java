import java.util.*;
class arraysame{
    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range=old.nextInt();
        int temp=0,temp1=0,count=0;

        int[] arr=new int[range];
        int[] arr1=new int[range];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the val of arr: ");
            arr[i]=old.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the val of arr1: ");
            arr1[i]=old.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr1[i]>arr1[j]){
                    temp1=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp1;
                }
            }
        }
        for(int i=0;i<range;i++){
            if(arr[i]==arr1[i]){
                count++;
            }
        }
        if(count==(range-1)){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr1[i]+" ");
        }

    }
}