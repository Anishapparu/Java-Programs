import java.util.*;
class arraysearch{
    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        System.out.println("Enter the range:");
        int range=old.nextInt();
        System.out.println("Enter the Searching number:");
        int num=old.nextInt();
        int count=0;
        int[] arr=new int[range];
        for(int i=0;i<range;i++){
            System.out.print("Enter the value of array:");
            arr[i]=old.nextInt();
        }
        for(int i=0;i<range;i++){
            if(num==arr[i]){
                count=1;
            }
        }
        if (count == 1) {

            System.out.print("number found");
        }
        else{
            System.out.print("number not found");
        }

    }
}