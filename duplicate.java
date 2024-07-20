import java.util.*;


public class duplicate {

    public static void checkdup(int arr[] ){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i]))
                System.out.println(arr[i]+" is a duplicate");
            else
                set.add(arr[i]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int len = sc.nextInt();
        int arr[] = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
            //System.out.println();
        }       
        checkdup( arr);

    }

}
