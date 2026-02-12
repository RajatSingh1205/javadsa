
    public boolean predictTheWinner(int[] nums) {
        return getScore(nums, 0, nums.length - 1) >= 0;
    }

    private int getScore(int[] nums, int i, int j) {
        if (i == j) {
            return nums[i];
        }

        int left = nums[i] - getScore(nums, i + 1, j);
        int right = nums[j] - getScore(nums, i, j-1);

        return Math.max(left, right);
    }
