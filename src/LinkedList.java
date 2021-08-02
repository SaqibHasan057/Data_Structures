
public class LinkedList {
    private LinkedListNode head;
    private LinkedListNode tail;
    private int currentLength;

    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.currentLength = 0;
    }

    public LinkedListNode getHead(){
        if(this.head!=null){
            return this.head;
        }
        else{
            return null;
        }
    }

    public LinkedListNode getTail(){
        if(this.tail!=null){
            return this.tail;
        }
        else{
            return null;
        }
    }



    public void insertAtHead(Item newItem){
        LinkedListNode temp = new LinkedListNode(newItem);

        if(currentLength==0){
            this.head = temp;
            this.tail = temp;
        }
        else{
            temp.setNext(this.head);
            this.head = temp;
        }
        currentLength++;
    }

    public void insertAtTail(Item newItem){
        LinkedListNode temp = new LinkedListNode(newItem);

        if(currentLength==0){
            this.head = temp;
            this.tail = temp;
        }
        else{
            this.tail.setNext(temp);
            this.tail = temp;
        }

        currentLength++;
    }

    public Item search(Item x){
        LinkedListNode temp = this.head;

        while(temp!= null){
            if(temp.getValue().equals(x)){
                return temp.getValue();
            }
            temp = temp.getNext();
        }

        System.out.println("Item is not in the list!!");
        return null;
    }

    public void delete(Item x){

        if(currentLength==0){
            System.out.println("List is empty!!");
            return;
        }

        LinkedListNode temp = this.head;
        LinkedListNode prevTemp = this.head;

        while(temp!=null){
            if(temp.getValue().equals(x)){
                break;
            }
            prevTemp = temp;
            temp = temp.getNext();
        }

        if(temp==null){
            System.out.println("Item does not exist in list!!");
            return;
        }

        if(temp==this.head && temp==this.tail){
            this.head = null;
            this.tail = null;
            currentLength--;
            return;
        }

        if(temp==this.head){
            this.head = temp.getNext();
            currentLength--;
            return;
        }

        if(temp==this.tail){
            this.tail=prevTemp;
            prevTemp.setNext(null);
            currentLength--;
            return;
        }

        prevTemp.setNext(temp.getNext());
        currentLength--;
        return;
    }

    public void deleteHead(){
        if(currentLength==0){
            System.out.println("List is empty!!");
            return;
        }

        if(currentLength==1){
            this.head = null;
            this.tail = null;
            currentLength--;
            return;
        }

        this.head = this.head.getNext();
        currentLength--;
        return;
    }

    public void deleteTail(){
        if(currentLength==0){
            System.out.println("List is empty!!");
            return;
        }

        if(currentLength==1){
            this.head = null;
            this.tail = null;
            currentLength--;
            return;
        }

        LinkedListNode temp = this.head;

        while(temp.getNext().getNext()!=null){
            temp = temp.getNext();
        }

        temp.setNext(null);
        this.tail = temp;
        currentLength--;
    }



    public boolean isEmpty(){
        if(currentLength==0){
            return true;
        }
        else{
            return false;
        }
    }

    public int getLength(){
        return currentLength;
    }

    public void printList(){
        LinkedListNode temp = this.head;
        System.out.print("|->");
        while(temp!=null){
            System.out.print(temp.getValue().getValue()+"->");
            temp = temp.getNext();
        }
        System.out.println("|");
    }


    public void printListWithDetails(){
        System.out.println("Current length: "+this.currentLength);
        if(this.tail!=null) System.out.println("Head value: "+this.head.getValue().getValue());
        if(this.head!=null) System.out.println("Tail value: "+this.tail.getValue().getValue());
        LinkedListNode temp = this.head;
        System.out.print("|->");
        while(temp!=null){
            System.out.print(temp.getValue().getValue()+"->");
            temp = temp.getNext();
        }
        System.out.println("|");
    }



}
