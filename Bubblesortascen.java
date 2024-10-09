import java.util.Scanner;
public class Bubblesortascen {
    public static void Bubble(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        int renge=old.nextInt();
        int[] arr=new int[renge];
        for(int i=0;i<arr.length;i++){
            arr[i]=old.nextInt();
        }
        Bubble(arr);
    }
}
