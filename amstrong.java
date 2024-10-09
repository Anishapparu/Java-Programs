import java.util.*;
class amstrong {
    public static void main(String[] args) {
        Scanner old = new Scanner(System.in);
        int num, rev=0, rem;
        num = old.nextInt();
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            rev = (rev * 10) + rem;
        }
        System.out.printf("%d", rev);

    }
}

