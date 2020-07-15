import java.util.List;

import java.util.*;

public class _3sums_demo {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res = threeSum(arr);
        System.out.println(res);
        
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        //meiju a
        for (int first = 0; first < len; ++first) {
            //判断重复需要和上一次枚举的数不相同
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            //third 对应指针初始指向数组的最右端
            int third = len -1;
            int target = -nums[first];
            //枚举second
            for (int second = first + 1; second < len; ++second) {
                //判断重复 相邻的需要和上一次枚举的数不相同
                if (second > first +1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                //需要保证second的指针在third指针的左侧 而且 要寻找nums[second] + nums[third] = target
                //所以如果nums[second] + nums[third] > target
                //直接右边往左边移动
                while (second < third && nums[second] + nums[third] > target) {
                    --third;
                }
                //如果指针重复，随着b后续的增加
                //就不会有满足 first + second + third = 0 并且 second < third 的 third 了，
                //可以退出循环
                if (second == third) {
                    break;
                }
                //最后判断
                if (nums[second] + nums[third] ==target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);


                }
            }

        }
        return ans;
    }
    
}