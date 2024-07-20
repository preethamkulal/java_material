import java.util.*;

public class KmostOccurringElements {
    public static List<Integer> freq(int[] arr, int k){
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
                (a,b) -> a.getValue() - b.getValue()
        );

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            minHeap.offer(entry);
            if (minHeap.size() > k){
                minHeap.poll();
            }
        }
        List<Integer> K_ele = new ArrayList<>();
        while (!minHeap.isEmpty()){
            K_ele.add(minHeap.poll().getKey());
        }
        Collections.reverse(K_ele);
        return K_ele;
    }

    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,6,6,3,3,3,8,8,8};
        int k = 4;
        List<Integer> result = freq(arr,k);
        System.out.println(result);
    }
}
