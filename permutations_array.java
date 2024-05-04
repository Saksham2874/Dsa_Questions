import java.util.ArrayList;
import java.util.List;

public class permutations_array {
    public static void main(String[] args) {
        List<List<Integer>> ans = permute(new int[]{1, 2, 3});
        System.out.println(ans);
    }
    static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] isValid = new boolean[nums.length];
        helper(nums,ds,ans,isValid);
        return ans;
    }

    private static void helper(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] isValid) {
        if(nums.length == ds.size()){
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i <ds.size() ; i++) {
                list.add(ds.get(i));
            }
            ans.add(list);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(isValid[i] == false){
                ds.add(nums[i]);
                isValid[i] = true;
                helper(nums,ds,ans,isValid);
                isValid[i] = false;
                ds.remove(ds.size()-1);
            }

        }
    }
}
