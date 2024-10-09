import java.util.*;
class rev{
    public static void main(String[] args) {
        Scanner old = new Scanner(System.in);
        int num,rem,rev=0;
        System.out.println("Enter number:");
        num=old.nextInt();
        while(num!=0){
            rem=num%10;
            num=num/10;
            rev=(rev*10)+rem;
        }
        System.out.println("the reverse number of your input:"+rev);
    }
}
