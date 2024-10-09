import java.util.Scanner;
class problem5{
    public static void main(String[] args){
        Scanner old=new Scanner(System.in);
        int size1=old.nextInt();
        int size2=old.nextInt();
        int[] arr=new int[size1];
        int[] arr1=new int[size2];
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int[] neww1=new int[10];
            Solution(neww1,num);
            for(int j=0;j<arr1.length;j++){
                int[] neww2=new int[10];
                num2=arr1[i];
                Solution(neww2,num2);
                if(compare(neww1,neww2)==1){
                    System.out.print("("+i+","+j+")");
                }
                
            }
            
            
        }
    }
    public static int[] Soluton(int[] arr,int num){
        while(num!=0){
            arr[num%10]++;
            num/=10;
        }
        return arr;
    }
    public static int compare(int[] arr1,int[] arr2){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return 0;
            }
        }
        return 1;
    }
}