import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner old=new Scanner(System.in);
        int[] arr=new int[6];
        int[] val=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=old.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            val[arr[i]]++;
        }
        for(int i=1;i<=9;i++){
            for(int j=0;j<val.length;j++){
                if(i==val[j]){
                    for(int k=0;k<val[j];k++){
                        System.out.print(j+" ");
                    }
                    break;
                }
            }
        }
        
    }
}