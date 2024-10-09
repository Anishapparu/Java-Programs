import java.util.Scanner;
class Matrix{
    public static void main(String[] args){
        Scanner old=new Scanner(System.in);
        int row,col,val;
        row=old.nextInt();
        col=old.nextInt();
        int sum=0;
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=old.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                sum+=arr[i][j];
            }
        }
        System.out.print(sum);
    }
}