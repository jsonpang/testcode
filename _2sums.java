import javafx.scene.control.TableView.TableViewFocusModel;

import java.util.*;
class _2sums {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = { 2, 11, 7, 15 };
        int target = 9;
        int[] res = twoSum(arr, target);
        for (int x : res) {
            System.out.println(x);
            System.out.println(",");

        }
    }
/*     public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //值当成key index 作为value
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            //判断key在不在map中，且获取index的值不等于i的值 
            //把i和这个符合条件的放到value
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    } */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //定义值 target - iindex的数组值
            int complement = target - nums[i];
            //判断如果有这个key 就return
            if (map.containsKey(complement)) {
                //返回符合complement的下标，因为put 是先值后下标的方式
                return new int[] { map.get(complement), i };
            }
            //没有就执行put
            //继续执行for 循环
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}