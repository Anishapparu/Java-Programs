import java.util.*;
class anish{
    public static int power(int num1, int num2) {
        int res = 1;
        for (int i = 1; i <= num2; i++) {
            res = res * num1;
        }
        return res;
    }
}
class classs{
    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the exponent");
        num1=old.nextInt();
        System.out.println("Enter the power");
        num2=old.nextInt();
        anish obj=new anish();
        System.out.println(obj.power(num1,num2));
    }
}
