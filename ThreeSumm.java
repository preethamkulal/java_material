import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumm {

    public List<List<Integer>> threesum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            
            int left = i+1,right = nums.length-1;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum<0){
                    left++:
                } else if (sum>0) {
                    right++;
                } else if (sum == 0) {
                    result.add()
                }
            }
        }
    }

    public static void main(String[] arg){
            ThreeSumm sol = new ThreeSumm();
            System.out.println(sol.threesum(new int[] {1, -2, 1, 0, 5, -1, -4, 2}));
    }
}
