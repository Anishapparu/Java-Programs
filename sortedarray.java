import java.util.*;
class sortedarray{
    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        int arr[]={4,3,8,2,9};
        int sort=0,flag=0,temp=0;
        System.out.println("Original Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
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
       System.out.println("\nSorted Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

        }

    }
