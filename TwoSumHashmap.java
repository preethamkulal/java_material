import java.util.HashMap;
import java.util.Scanner;

public class TwoSumHashmap {
    public static int[] twoSum(int[] arr,int tgt){
        int []idx = new int[2];
        int ln = arr.length;
        HashMap<Integer,Integer>hm = new HashMap<>();

        for (int i = 0; i < ln; i++) {
            if(hm.containsKey(tgt - arr[i])){
                idx[0] = hm.get(tgt - arr[i]);
                idx[1] = i;
                System.out.println(idx[0]+" "+idx[1]);
                return idx;
            }
                hm.put(arr[i],i);
        }
        return idx;
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int target = sc.nextInt();
        int[] arr = {1,3,4,5};
        int[] idx = new int[2];
        idx = twoSum(arr,target);
        System.out.println(idx);
    }
}
