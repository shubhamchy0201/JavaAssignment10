public class LinkedListImplementation {
    public static void main(String[] args) {
        SList sList=new SList();
        sList.insert(10);
        sList.insert(20);
        sList.insert(30);
        sList.insert(40);
        sList.insert(45);
        System.out.println("Before deleting node: ");
        sList.iterator();
        sList.delete(2);
        System.out.println("\nAfter Deleting node: ");
        sList.iterator();
        System.out.println();
        sList.insert(78);
        sList.insert(89);
        sList.insert(47);
        sList.insert(41);
        sList.iterator();
    }
}
