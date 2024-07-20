import java.util.HashSet;
import java.util.Set;
public class LongestConsecutiveSequence {
    public int longestConsecutiveSequence(int[] nums){
        if(nums.length == 0)
            return 0;

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longStreak = 0;

        for(int num : numSet){
            if (!numSet.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;

                //counting
                while (numSet.contains(currentNum + 1)){
                    currentNum++;
                    currentStreak++;
                }

                longStreak = Math.max(longStreak,currentStreak);
            }
        }
        return longStreak;
    }

    public static void main(String[] arg){
        LongestConsecutiveSequence LCS =new LongestConsecutiveSequence();
        int[] nums = {110,200,1,3,2,4};
        System.out.println(LCS.longestConsecutiveSequence(nums));
    }
}
