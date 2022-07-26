public class Startandendindex {
    public static int[] searchRange(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        int[] poss = { -1, -1 };
        int i = mid;
        int j = mid;

        if (nums.length == 0) {
            return poss;
        } else if ((nums.length == 1) && (nums[0] == target)) {
            poss[0] = 0;
            poss[1] = 0;
        } else if ((nums.length == 2) && (nums[0] == target) && (nums[1] == target)) {
            poss[0] = 0;
            poss[1] = 1;
        } else if ((nums[start] == target) && (nums[start + 1] != target)) {
            poss[0] = start;
            poss[1] = start;
            start = end;

        } else if ((nums[end] == target) && (nums[end - 1] != target)) {
            poss[0] = end;
            poss[1] = end;
            end = start;
        }

        while (start < end) {
            mid = (start + end) / 2;
            i = mid;
            j = mid;
            if (target == nums[mid]) {

                if (((i - 1) >= 0) && (nums[i - 1] != target)) {
                    poss[0] = mid;
                } else {
                    while (((i - 1) >= 0) && (nums[i - 1] == target)) {
                        i--;

                        poss[0] = i;
                    }
                }
                if (((j + 1) < nums.length) && (nums[j + 1] != target)) {
                    poss[1] = mid;
                } else {
                    while (((j + 1) < nums.length) && (nums[j + 1] == target)) {
                        j++;
                        poss[1] = j;
                    }
                }

                return poss;

            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return poss;

    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 41, 41, 41 };
        int[] nums1 = { 1, 2, 3, 11, 11, 11, 11 };
        int target1 = 3;
        int[] poss = searchRange(nums1, target1);
        System.out.println(poss[0]);
        System.out.println(poss[1]);
        int target = 1;
        poss = searchRange(nums, target);
        System.out.println(poss[0]);
        System.out.println(poss[1]);
    }
}
