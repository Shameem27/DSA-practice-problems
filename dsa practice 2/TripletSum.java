import java.util.*;
public class TripletSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            
            while (j < k) {
                int temp = nums[i] + nums[j] + nums[k];
                if (temp == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                } else if (temp > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        
        return new ArrayList<>(ans);
    }

    public static void main(String[] args) {
        TripletSum ts = new TripletSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        
        List<List<Integer>> result = ts.threeSum(nums);
        System.out.println("Triplets with sum zero:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
