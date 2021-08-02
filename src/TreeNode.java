public class TreeNode {
    private Item value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(){
        this.value = new Item(0);
        this.left = null;
        this.right = null;
    }

    public TreeNode(Item value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Item getValue(){
        return this.value;
    }

    public TreeNode getLeft(){
        return this.left;
    }

    public TreeNode getRight(){
        return this.right;
    }

    public void setValue(Item value){
        this.value = value;
    }

    public void setLeft(TreeNode left){
        this.left = left;
    }

    public void setRight(TreeNode right){
        this.right = right;
    }
}
