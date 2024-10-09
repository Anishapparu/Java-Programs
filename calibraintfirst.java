import java.util.Scanner;
public class calibraintfirst {
    public static void stringsol(String str){
        char[] arr=str.toCharArray();
        char[] arr2=new char[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                arr2[i]=' ';
            }
        }
        int j= arr2.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=' '){
                if(arr[j]==' '){
                    j--;
                }
                arr2[j]=arr[i];
                j--;
            }
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]);
        }
    }

    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        String s="A man in the boat says I see 1 2 3 in the sky";
        stringsol(s);
    }

}
