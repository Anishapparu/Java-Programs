import java.util.*;
class stringpri{
    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        String s="1 5 3 2 4 6";
        int count=0,space=0;
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                space++;
            }
            else{
                count++;
            }
        }
        System.out.println(count);
        int[] arr=new int[count];
        for(int i=0;i<count;i++){
            if(s.charAt(i)==' '){
                continue;
            }
            else{
                arr[i]=s.charAt(i);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(s.charAt(i)==' '){
                space++;
            }
            else{
                System.out.print(arr[i]+" ");
            }
        }

    }
}