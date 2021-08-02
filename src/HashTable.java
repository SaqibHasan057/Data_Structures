public class HashTable {
    private LinkedList[] table;
    private int tableSize;

    private int hashIndex(Item x){
        int hashCode = x.hash();

        hashCode = hashCode%1000;
        hashCode = hashCode*hashCode+191*hashCode+19;
        hashCode = hashCode%this.tableSize;

        return hashCode;
    }

    public HashTable(){
        this.tableSize = 100;
        this.table = new LinkedList[this.tableSize];

        for(int i=0;i<this.tableSize;i++){
            this.table[i] = new LinkedList();
        }
    }

    public HashTable(int tableSize){
        this.tableSize = tableSize;
        this.table = new LinkedList[this.tableSize];

        for(int i=0;i<this.tableSize;i++){
            this.table[i] = new LinkedList();
        }
    }

    public void insert(Item x){
        int index = this.hashIndex(x);
        this.table[index].insertAtTail(x);
    }

    public void delete(Item x){
        int index = this.hashIndex(x);
        Item temp = this.table[index].search(x);

        if(temp==null){
            System.out.println("Item does not exist in hashtable!!");
        }
        else{
            this.table[index].delete(x);
        }
    }

    public Item Search(Item x){
        int index = this.hashIndex(x);
        Item temp = this.table[index].search(x);
        return temp;
    }

    public void printTable(){
        for(int i=0;i<tableSize;i++){
            if(this.table[i].getLength()>0){
                System.out.print(i+": ");
                this.table[i].printList();
            }
        }
    }


}
