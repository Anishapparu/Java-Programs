import java.util.*;
class sortarrayuin{
    public static void main(String[] args) {
        Scanner old = new Scanner(System.in);
        int range=old.nextInt();
        int[] arr= new int[range];
        int temp=0;
        System.out.println("Enter array numbers with 10 input : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=old.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}