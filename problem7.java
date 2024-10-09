import java.util.Scanner;
class anish{
  public static void main(String[] args){
    Scanner old=new Scanner(System.in);
    int num=old.nextInt();
    int i=1,j=1,sum=0;
    while(i<=num){
       if(i==1){
         System.out.print("0"+" ");
       }
       if(i==2){
         System.out.print("0"+" ");
       }
       else if(i>2){
         if(i%2!=0){
           sum+=2;
           System.out.print(sum+" ");
         }
         else{
           System.out.print(j+" ");
           j++;
         }
       }
       i++;
    }
  }
}