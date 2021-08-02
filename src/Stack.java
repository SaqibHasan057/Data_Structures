public class Stack {
    private LinkedList stack;
    private int stackSize;


    public Stack(){
        this.stack = new LinkedList();
        this.stackSize = 10;
    }

    public Stack(int stackSize){
        this.stack = new LinkedList();
        this.stackSize = stackSize;
    }

    public boolean isEmpty(){
        if(stack.getLength()==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(stack.getLength()==stackSize){
            return true;
        }
        else{
            return false;
        }
    }

    public Item peek(){
        if(!this.isEmpty()){
            return stack.getHead().getValue();
        }
        else{
            System.out.println("Stack is empty!!");
            return null;
        }

    }

    public void push(Item x){
        if(this.isFull()){
            System.out.println("Stack is full!!");
        }
        else {
            stack.insertAtHead(x);
        }

    }

    public Item pop(){
        if(!this.isEmpty()){
            Item temp = stack.getHead().getValue();
            stack.deleteHead();
            return temp;
        }
        else{
            System.out.println("Stack is empty!!");
            return null;
        }
    }

    public void printStackStyle(){
        System.out.println("Current stack length: "+this.stack.getLength());

        LinkedListNode temp = this.stack.getHead();
        System.out.println("--");
        while(temp!=null){
            System.out.println(temp.getValue().getValue());
            temp = temp.getNext();
        }
        System.out.println("--");
    }
}
