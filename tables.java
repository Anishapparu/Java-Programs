import java.util.*;
class table{
    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        int ini,table,dest;
        System.out.println("Enter the table:");
        table=old.nextInt();
        System.out.println("Enter the initial value:");
        ini=old.nextInt();
        System.out.println("Enter the destination:");
        dest=old.nextInt();
        for(int i=ini;i<=dest;i++){
            System.out.printf("%d * %d =%d\n",i,table,i*table);
        }
    }
}