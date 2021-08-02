public class MinHeap {
    private DynamicArray heap;

    public MinHeap(){
        this.heap = new DynamicArray();
    }

    public MinHeap(DynamicArray heap){
        this.heap = heap;
        Build_Min_Heap();
    }


    public void MinHeapify(int index){
        int leftIndex = 2*index+1;
        int rightIndex = 2*index+2;

        int smallest=index;

        if(leftIndex<this.heap.size() && this.heap.getByIndex(leftIndex).getValue()<this.heap.getByIndex(smallest).getValue()){
            smallest = leftIndex;
        }

        if(rightIndex<this.heap.size() && this.heap.getByIndex(rightIndex).getValue()<this.heap.getByIndex(smallest).getValue()){
            smallest = rightIndex;
        }

        if(smallest!=index){
            this.heap.swapByIndex(smallest,index);
            MinHeapify(smallest);
        }
    }

    public void Build_Min_Heap(){
        int heapSize = this.heap.size();

        for(int i=heapSize/2;i>=0;i--){
            MinHeapify(i);
        }
    }

    public Item minimum(){
        return this.heap.getByIndex(0);
    }

    public Item extractMinimum(){
        Item temp = this.heap.getByIndex(0);
        this.heap.swapByIndex(0,this.heap.size()-1);
        this.heap.deleteByIndex(this.heap.size()-1);
        MinHeapify(0);
        return temp;
    }

    public void insert(Item item){
        this.heap.insert(item);

        int i = this.heap.size()-1;

        while(i!=0 && this.heap.getByIndex((i-1)/2).getValue()>this.heap.getByIndex(i).getValue()){
            this.heap.swapByIndex((i-1)/2,i);
            i = (i-1)/2;
        }

    }

    public void printHeap(){
        this.heap.printArray();
    }
}
