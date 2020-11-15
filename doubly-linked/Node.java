public class Node {
    private int age;
    private int ID;
    private String name;
    private Node next;
    private Node prev;

    public Node(int id,int a,String n) {
        ID = id;
        age = a;
        name = n;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node newNode) {
        next = newNode;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node newNode) {
        prev = newNode;
    }

    public String toString() {
        return age+" "+ID;
    }

    public int getID() {
        return ID;
    }

    public int compareTo(Node newNode) {
        return (name.compareTo(newNode.name));
    }
}
