

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(new Item(5));
        bst.insert(new Item(3));
        bst.insert(new Item(10));
        bst.insert(new Item(1));
        bst.insert(new Item(4));
        bst.insert(new Item(7));
        bst.insert(new Item(12));
        bst.insert(new Item(2));
        bst.insert(new Item(6));

        bst.inOrderPrint(bst.getRoot());
        System.out.println();

        bst.delete(new Item(7));

        bst.inOrderPrint(bst.getRoot());
        System.out.println();
    }
}
