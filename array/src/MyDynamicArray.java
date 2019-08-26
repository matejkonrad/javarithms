public class MyDynamicArray {
    public int[] data;
    private int size = 0;

    MyDynamicArray() {
        this.data = new int[16];
    }

    MyDynamicArray(int capacity) {
        int startingCapacity = this.startingCapacity(capacity, 16);
        this.data = new int[startingCapacity];
    }

    public int get(int index) {
        this.checkIndex(index);
        return data[index];
    }

    public void insert(int index, int element) {
        this.checkIndex(index);
        this.ensureBiggerCapacity();
        for (int i = this.size - 1; i >= index; i--){
            data[i + 1] = data[i];
        }
        data[index] = element;
        this.size += 1;
    }

    public void prepend(int element) {
        this.insert(0, element);
    }

    public void push(int item) {
        this.ensureBiggerCapacity();
        data[this.size] = item;
        this.size += 1;
    }

    public int find(int element) {
        for (int i = 0; i < this.size - 1; i++) {
            if(this.data[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void delete(int index) {
        for (int i = index; i < this.size - 1; i++) {
            if (i == this.size - 1) {
                this.data[i] = 0;
            } else {
                this.data[index] = this.data[index + 1];
            }
        }
        this.size -= 1;
    }

    public void remove(int element) {
        for (int i = 0; i < this.size - 1; i++) {
            if(this.data[i] == element) {
                this.delete(i);
            }
        }
    }

    public int pop() {
        this.size -= 1;
        int popped = data[this.size];
        data[this.size] = 0;
        this.ensureSmallerCapacity();
        return popped;
    }

    public int size() {
        return this.size;
    }

    public int capacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    private void ensureBiggerCapacity() {
        if (this.size >= data.length) {
            this.resizeAndCopy(data.length * 2);
        }
    }

    private void ensureSmallerCapacity() {
         if (this.size == data.length / 4) {
            this.resizeAndCopy(data.length / 2);
        }
    }

    private void resizeAndCopy(int resizeTo) {
        int[] temp = data;
        this.data = new int[resizeTo];
        int looper = Math.min(resizeTo, temp.length);
        for (int i = 0; i < looper; i++) {
            this.data[i] = temp[i];
        }
    }

    private void checkIndex(int index) {
        if (index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index cannot be bigger than size");
        }
    }

    private int startingCapacity(int givenCapacity, int capacity) {
        if (givenCapacity > capacity) {
            return startingCapacity(givenCapacity, (int) Math.pow(capacity, 2));
        }
        return capacity;
    }
}
