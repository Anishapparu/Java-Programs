import java.util.*;
class twosum{
    public static void main(String[] args) {
        Scanner old = new Scanner(System.in);
        int num = old.nextInt();
        int target = old.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = old.nextInt();
        }
        System.out.println(Arrays.toString(check(arr,target)));
    }
    public static int[] check(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int result=target-arr[i];
            if(map.containsKey(result)){
                int arr1[]={map.get(result),i};
                return arr1;
            }
            map.put(arr[i],i);
        }
        return null;
    }

}
