class Solution {
    // List to store the result of the traversal
    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        traverse(root);
        return list;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        // Traverse Left subtree
        traverse(root.left);
        // Visit the Root
        list.add(root.val);
        // Traverse Right subtree
        traverse(root.right);
    }
}