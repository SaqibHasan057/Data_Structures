public class Test {
    public static void main(String[] args) {
        DynamicArray l = new DynamicArray();

        l.insert(new Item(12));
        l.insert(new Item(25));
        l.insert(new Item(16));
        l.insert(new Item(35));
        l.insert(new Item(2));
        l.insert(new Item(59));
        l.insert(new Item(77));
        l.insert(new Item(1));

        l.printArray();

        MinHeap m = new MinHeap(l);

        m.printHeap();

        m.minimum().printValue();

        m.insert(new Item(-500));

        m.printHeap();

        m.extractMinimum().printValue();

        m.printHeap();
    }
}
