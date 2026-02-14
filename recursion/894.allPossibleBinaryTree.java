    public List<TreeNode> allPossibleFBT(int n) {
        if (n % 2 == 0) {
            return new ArrayList<>();
        } else if (n == 1) {
            List<TreeNode> base = new ArrayList<>();
            base.add(new TreeNode(0));
            return base;
        }

        List<TreeNode> res = new ArrayList<>();

        for (int i = 1; i < n; i += 2 ) {

            List<TreeNode> leftSide = allPossibleFBT(i);
            List<TreeNode> rightSide = allPossibleFBT(n - 1 - i);


            for (TreeNode left : leftSide) {
                for (TreeNode right : rightSide) {
                    TreeNode root = new TreeNode();
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;

    }
