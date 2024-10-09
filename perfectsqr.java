import java.util.*;
class perfextsqr{
    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        int num=old.nextInt();
        int count=0;
        for(int i=1;i<num/2;i++){
            if(i*i==num){
                System.out.println("the sqr of the number is: "+i);
                count++;
                break;
            }
        }
        if(count>=1){
            System.out.println("the number is perfect square number ");
        }
        else{
            System.out.print("the number is not a perfect square");
        }
    }
}