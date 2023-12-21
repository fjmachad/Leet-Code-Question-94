class Solution {
    // returns the in order traversal of a binary tree
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    // helper method to perform the traversal using recursion
    private void inorderHelper(TreeNode root, List<Integer> result)
    {
        if (root == null)
        {
            return;
        }
        inorderHelper(root.left, result);
        result.add(root.val);
        inorderHelper(root.right, result);
    }
}