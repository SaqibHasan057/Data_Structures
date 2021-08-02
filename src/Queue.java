public class Queue {
    LinkedList queue;

    public Queue(){
        this.queue = new LinkedList();
    }

    public boolean isEmpty(){
        if(this.queue.getLength()==0){
            return true;
        }
        else {
            return false;
        }
    }

    public void enqueue(Item x){
        this.queue.insertAtHead(x);
    }

    public Item dequeue(){
        Item temp = this.queue.getTail().getValue();
        this.queue.deleteTail();
        return temp;
    }

    public void printQueue(){
        System.out.println("Current queue length: "+this.queue.getLength());

        LinkedListNode temp = this.queue.getHead();
        System.out.print("|->");
        while(temp!=null){
            System.out.print(temp.getValue().getValue()+"->");
            temp = temp.getNext();
        }
        System.out.println("|");
    }
}
