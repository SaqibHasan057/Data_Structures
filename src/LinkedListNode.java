public class LinkedListNode{
    private Item value;
    private LinkedListNode next;

    public LinkedListNode(){
        this.value = new Item(-699);
        this.next = null;
    }

    public LinkedListNode(Item value){
        this.value = value;
        this.next = null;
    }

    public LinkedListNode(Item value, LinkedListNode next){
        this.value = value;
        this.next = next;
    }

    public Item getValue(){
        return this.value;
    }

    public LinkedListNode getNext(){
        return this.next;
    }

    public void setValue(Item value){
        this.value = value;
    }

    public void setNext(LinkedListNode next){
        this.next = next;
    }

    public void printNode(){
        System.out.println("Node value: "+this.value.getValue());
    }
}