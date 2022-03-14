class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> chset = new HashSet<>();
        Set<Integer> paset = new HashSet<>();
        for(int[] des: descriptions){
            chset.add(des[1]);
            if(!chset.contains(des[0]))
                paset.add(des[0]);
            if(paset.contains(des[1]))
                paset.remove(des[1]);
            TreeNode parent = map.getOrDefault(des[0], new TreeNode(des[0]));
            TreeNode child = map.getOrDefault(des[1], new TreeNode(des[1]));
            if(des[2]==1)
                parent.left = child;
            else
                parent.right = child;
            map.put(parent.val, parent);
            map.put(child.val, child);
        }
        int root = 0;
        for(int r: paset){
            root = r;
        }
        
        return map.get(root);
    }
}