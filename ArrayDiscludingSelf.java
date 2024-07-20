import javax.xml.transform.SourceLocator;

public class ArrayDiscludingSelf {

    public int[] prdExp(int[] numm){
        int len = numm.length;

        //result array init
        int[] result = new int[len];

        //prefix
        int[] prefix = new int[len];
        prefix[0] = 1;
        for (int i=1; i<len; i++){
            prefix[i] = prefix[i-1] * numm[i-1];
        }

        //suffix
        int[] suffix = new int[len];
        suffix[len-1] = 1;
        for (int i = len-2; i >= 0 ; i--) {
            suffix[i] = suffix[i+1] * numm[i+1];
        }

        //calculate mul of prefix and suffix
        for (int i = 0; i < len; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return  result;
    }

    public static void main(String[] arg){
        ArrayDiscludingSelf sol = new ArrayDiscludingSelf();
        int[] numm = {1, 2, 3, 4};
        int[] result = sol.prdExp(numm);

        for(int num : result){
            System.out.println(num + " ");
        }

    }
}
