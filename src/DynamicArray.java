public class DynamicArray {
    private Item[] arr;
    private int currentLength;
    private int size;

    public DynamicArray(){
        this.currentLength = 0;
        this.size = 2;
        this.arr = new Item[this.size];
    }

    public void insert(Item newItem){
        if(this.currentLength==this.size){
            this.size = this.size*2;
            Item[] temp = new Item[this.size];

            for(int i=0;i<this.currentLength;i++){
                temp[i] = this.arr[i];
            }

            this.arr = temp;
        }

        this.arr[currentLength] = newItem;
        currentLength++;
    }

    public Item getByIndex (int index){
        if(index<0 || index>=this.currentLength){
            System.out.println("Index is out of bounds!!");
            return null;
        }

        return this.arr[index];
    }

    public Item getByValue(Item x){
        for(int i=0;i<this.currentLength;i++){
            if(this.arr[i].equals(x))return this.arr[i];
        }

        System.out.println("Item does not exist in array!!");
        return null;
    }

    public void deleteByIndex(int index){

        if(index<0 || index>=this.currentLength){
            System.out.println("Index is out of bounds!!");
            return;
        }

        for(int i=index;i<this.currentLength-1;i++){
            this.arr[i]=this.arr[i+1];
        }

        this.currentLength--;

        if(this.currentLength==(this.size/2)){
            this.size = this.size/2;
            Item[] temp = new Item[this.size];

            for(int i=0;i<this.currentLength;i++) {
                temp[i] = this.arr[i];
            }
            this.arr = temp;
        }

    }

    public void deleteByValue(Item x){
        for(int i=0;i<this.currentLength;i++){
            if(this.arr[i].equals(x)){
                deleteByIndex(i);
                return;
            }
        }

        System.out.println("Item does not exist in array!!");
        return;
    }

    public void swapByIndex(int index1,int index2){
        Item temp = this.arr[index1];
        this.arr[index1]= this.arr[index2];
        this.arr[index2]= temp;
    }



    public int size(){
        return currentLength;
    }

    public void printInfo(){
        System.out.println("Current Length: "+this.currentLength);
        System.out.println("Memory allocated: "+this.size);
    }

    public void printArray(){
        System.out.print("|");
        for(int i=0;i<this.currentLength;i++){
            System.out.print(this.arr[i].getValue()+"|");
        }
        System.out.println();
    }
}
