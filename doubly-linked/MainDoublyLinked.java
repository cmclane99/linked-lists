public class MainDoublyLinked {

    public static void main(String[] args) {
        Node node1 = new Node(45321,28,"Jake");
        Node node2 = new Node(89572,22,"Mike");
        Node node3 = new Node(58294,21,"Scott");
        Node node4 = new Node(54632,25,"Fred");

        DoublyLinked newDL = new DoublyLinked();

        newDL.insertFront(node1);
        newDL.insertFront(node2);
        newDL.insertFront(node3);
        newDL.insertBefore(node4,45321);

        newDL.displayForward();
        System.out.println();

        newDL.delete(45321);
        newDL.displayForward();
    }
}
