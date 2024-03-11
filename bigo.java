public class BigO {
    public static void main(String[] args) {
        BigO bigO = new BigO();
        bigO.bigOn();
        bigO.bigOn2();
        bigO.bigOlogn();
    }

    public void bigOn() {
        int n = 10; 
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    public void bigOn2() {
        int n = 10; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + ", " + j);
            }
        }
    }

    public void bigOlogn() {
        int n = 8;
        while (n > 1) {
            n = Math.floorDiv(n, 2);
            System.out.println(n);
        }
    }
}

/*
 Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (!numSet.add(num)) {
                // If the add method returns false, it means the element was already in the set
                return true;
            }
        }
        // If we've added all elements to the set without duplicates, return false
        return false;
    }
}


Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                return new int[] {map.get(difference), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

 */