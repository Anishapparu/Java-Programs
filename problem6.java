import java.util.Scanner;
import java.lang.Math;
class anish{
  public static void main(String[] args){
    Scanner old=new Scanner(System.in);
    int range=old.nextInt();
    int count=0;
    int[] arr=new int[range];
    for(int i=0;i<arr.length;i++){
      arr[i]=old.nextInt();
    }
    for(int i=0;i<arr.length;i++){
      int sum=0;
      for(int j=i;j<arr.length;j++){
        sum+=arr[j];
        if(check(sum)==1){
          count++;
        }
      }
    }
    System.out.print(count);
  }
  public static int check(int sum){
    for(int i=1;i*i<=sum;i++){
      if(i*i==sum){
        return 1;
      }
    }
    return 0;
  }
}