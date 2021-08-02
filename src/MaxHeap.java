public class MaxHeap {
    private DynamicArray heap;


    public MaxHeap(){
        this.heap = new DynamicArray();
    }

    public MaxHeap(DynamicArray heap){
        this.heap = heap;
        Build_Max_Heap();
    }


    public void MaxHeapify(int index){
        int leftIndex = 2*index+1;
        int rightIndex = 2*index+2;

        int largest=index;

        if(leftIndex<this.heap.size() && this.heap.getByIndex(leftIndex).getValue()>this.heap.getByIndex(largest).getValue()){
            largest = leftIndex;
        }

        if(rightIndex<this.heap.size() && this.heap.getByIndex(rightIndex).getValue()>this.heap.getByIndex(largest).getValue()){
            largest = rightIndex;
        }

        if(largest!=index){
            this.heap.swapByIndex(largest,index);
            MaxHeapify(largest);
        }
    }

    public void Build_Max_Heap(){
        int heapSize = this.heap.size();

        for(int i=heapSize/2;i>=0;i--){
            MaxHeapify(i);
        }
    }

    public Item maximum(){
        return this.heap.getByIndex(0);
    }

    public Item extractMaximum(){
        Item temp = this.heap.getByIndex(0);
        this.heap.swapByIndex(0,this.heap.size()-1);
        this.heap.deleteByIndex(this.heap.size()-1);
        MaxHeapify(0);
        return temp;
    }

    public void insert(Item item){
        this.heap.insert(item);

        int i = this.heap.size()-1;

        while(i!=0 && this.heap.getByIndex((i-1)/2).getValue()<this.heap.getByIndex(i).getValue()){
            this.heap.swapByIndex((i-1)/2,i);
            i = (i-1)/2;
        }

    }

    public void printHeap(){
        this.heap.printArray();
    }


}
