public class BinarySearchTree {
    private TreeNode root;


    public BinarySearchTree(){
        root = null;
    }

    public BinarySearchTree(Item x){
        TreeNode newRoot = new TreeNode(x);
        this.root = newRoot;
    }

    public TreeNode getRoot(){
        return this.root;
    }

    public void insert(Item x){
        TreeNode newNode = new TreeNode(x);

        if(this.root==null){
            this.root = newNode;
            return;
        }

        TreeNode temp = this.root;

        while(temp!=null){
            if(x.getValue()<temp.getValue().getValue()){
                if(temp.getLeft()==null){
                    temp.setLeft(newNode);
                    return;
                }
                else{
                    temp = temp.getLeft();
                }
            }
            else{
               if(temp.getRight()==null){
                   temp.setRight(newNode);
                   return;
               }
               else{
                   temp = temp.getRight();
               }
            }
        }
    }


    public Item search(Item x){
        if(this.root==null){
            System.out.println("Tree is empty!!");
            return null;
        }

        TreeNode temp = root;

        while(temp!=null){
            if(temp.getValue().equals(x)){
                return temp.getValue();
            }


            if(x.getValue()<temp.getValue().getValue()){
                temp = temp.getLeft();
            }
            else{
                temp = temp.getRight();
            }
        }

        System.out.println("Item does not exist in tree!!");
        return null;
    }

    public void delete(Item x){

        if(root==null){
            System.out.println("Tree is empty!!");
            return;
        }


        TreeNode temp = root;
        TreeNode prevTemp = root;
        int direction = -1;

        while(temp!=null){
            if(temp.getValue().equals(x)){
                if(temp.getLeft()==null && temp.getRight()==null){
                    if(direction==0){
                        prevTemp.setLeft(null);
                    }

                    if(direction==1){
                        prevTemp.setRight(null);
                    }
                }
                else if(temp.getLeft()!=null && temp.getRight()==null){
                    if(direction==0){
                        prevTemp.setLeft(temp.getLeft());
                    }

                    if(direction==1){
                        prevTemp.setRight(temp.getLeft());
                    }
                }
                else if(temp.getLeft()==null && temp.getRight()!=null){
                    if(direction==0){
                        prevTemp.setLeft(temp.getRight());
                    }

                    if(direction==1){
                        prevTemp.setRight(temp.getRight());
                    }
                }
                else{
                    TreeNode t2 = temp.getRight();
                    TreeNode prevt2 =temp;
                    while(t2.getLeft()!=null){
                        prevt2=t2;
                        t2=t2.getLeft();
                    }
                    temp.setValue(t2.getValue());

                    if(t2.getRight()==null){
                        if(prevt2!=temp){
                            prevt2.setLeft(null);
                        }
                        else{
                            prevt2.setRight(t2.getRight());
                        }

                    }
                    else{
                        if(prevt2!=temp){
                            prevt2.setLeft(t2.getRight());
                        }
                        else{
                            prevt2.setRight(t2.getRight());
                        }
                    }
                }

                return;
            }
            else if(x.getValue()<temp.getValue().getValue()){
                prevTemp=temp;
                direction=0;
                temp=temp.getLeft();
            }
            else{
                prevTemp=temp;
                direction=1;
                temp=temp.getRight();
            }
        }

        System.out.println("Item not in tree!");




    }


    public void inOrderPrint(TreeNode node){
        if(node==null){
            return;
        }

        inOrderPrint(node.getLeft());
        System.out.print("|"+node.getValue().getValue()+"|");
        inOrderPrint(node.getRight());

        return;
    }
}
