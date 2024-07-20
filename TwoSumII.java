public class TwoSumII {
    public int[] twoSum(int[] numbers, int target){
        int left = 0; int right = numbers.length-1;

        while(left<right){
            int sum = numbers[left]+numbers[right];

            if (sum == target) {
                return new int[]{++left, ++right};
            } else if (sum<target) {
                left++;
            }else if (sum>target){
                right--;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSumII solution = new TwoSumII();
        int[] numbers = {1, 2, 3, 4};
        int target = 3;
        int[] result = solution.twoSum(numbers, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]"); // Output: [1, 2]
    }
}
