import java.util.Arrays;

public class dup_sort_method {
    public static void dup(int arr[]){
        Arrays.sort(arr);
        for (int num: arr){
            System.out.print(num+" ");
        }
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1])
                System.out.println(arr[i]+ " is a duplicate");
        }
    }

    public static void main(String[] arg){
        int arr[] = {1,3,6,2,3,3,9,6};
        dup(arr);
    }
}
