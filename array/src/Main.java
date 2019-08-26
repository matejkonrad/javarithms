public class Main {
    public static void main(String[] args) {
        MyDynamicArray test = new MyDynamicArray();


        System.out.println("Is empty? " + test.isEmpty());

        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);

        test.insert(1, 14);
        test.prepend(99);
//        System.out.println("First item is: " + test.get(0));

        System.out.println("First item is: " + test.get(0));
        System.out.println("Second item is: " + test.get(1));
        System.out.println("Third item is: " + test.get(2));
        System.out.println("Fourth item is: " + test.get(3));
        System.out.println("Fifth item is: " + test.get(4));
        System.out.println("Fifth item is: " + test.get(5));
        System.out.println();
        System.out.println("Finding: " + test.find(99));
        System.out.println("Finding zero: " + test.find(0));
        System.out.println("Finding nothing: " + test.find(123123));
        System.out.println();
        System.out.println("Before delete: " + test.get(1));
        test.delete(1);
        System.out.println("after delete: " + test.get(1));

        System.out.println();
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());

        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);

        System.out.println();
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());

        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);

        System.out.println();
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());

        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);

        System.out.println();
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());

        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);

        System.out.println();
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());

        System.out.println();
        System.out.println("Poppin: " + test.pop());
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());

        System.out.println();
        System.out.println("Poppin: " + test.pop());
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());

        System.out.println();
        System.out.println("Poppin: " + test.pop());
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());


        System.out.println();
        System.out.println("Poppin: " + test.pop());
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());


        System.out.println();
        System.out.println("Poppin: " + test.pop());
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());


        System.out.println();
        System.out.println("Poppin: " + test.pop());
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());


        System.out.println();
        System.out.println("Poppin: " + test.pop());
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());


        System.out.println();
        System.out.println("Poppin: " + test.pop());
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());


        System.out.println();
        System.out.println("Poppin: " + test.pop());
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());


        System.out.println();
        System.out.println("Poppin: " + test.pop());
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());


        System.out.println();
        System.out.println("Poppin: " + test.pop());
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());

        System.out.println();
        System.out.println("Poppin: " + test.pop());
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());

        System.out.println();
        System.out.println("Poppin: " + test.pop());
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());

        System.out.println();
        System.out.println("Poppin: " + test.pop());
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());

        System.out.println();
        System.out.println("Poppin: " + test.pop());
        System.out.println("Capacity is: " + test.capacity());
        System.out.println("Size is: " + test.size());
    }
}
