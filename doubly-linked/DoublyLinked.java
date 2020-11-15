public class DoublyLinked {
    private Node front;     //Reference to first link
    private Node back;      //Reference to last link

    public DoublyLinked() {
        front = null;
        back = null;
    }

    public Node delete(int key) {
        Node rover, prev;

        rover = front;
        prev = null;
        while(rover != null) {

            if(rover.getID() == key) break;
            prev = rover;
            rover = rover.getNext();
        }

        if(rover != null) {

            if(prev == null) {
                front = rover.getNext();
            }
            else {
                rover.getPrev().setNext(rover.getNext());

                if(rover.getNext() != null) {       //If false, delete from end of list
                    rover.getNext().setPrev(rover.getPrev());
                }
            }
        }
        return rover;
    }

    public void insertBefore(Node newNode, int key) {
        Node rover, prev;

        rover = front;
        prev = null;
        if (front == null) {
            front = newNode;
            back = newNode;
        }
        else {
            while(rover != null && rover.getID() != key) {
                prev = rover;
                rover = rover.getNext();
            }
            newNode.setNext(rover);                     //<---
            if(prev != null) {
                newNode.setPrev(rover.getPrev());       //<---
                rover.getPrev().setNext(newNode);       //<---
                rover.setPrev(newNode);                 //<---
            }
            else {
                front = newNode;
            }
        }

    }

    public void displayBackward() {
        Node rover = back;
        while(rover != null) {
            System.out.println(rover);
            rover = rover.getPrev();
        }
    }

    public void displayForward() {
        Node rover = front;
        while(rover != null) {
            System.out.println(rover);
            rover = rover.getNext();
        }
    }

    public void insertFront(Node newNode) {
        if(front == null) {
            back = newNode;
        }
        else {
            front.setPrev(newNode);     //newNode <-- old front node
        }
        newNode.setNext(front);     //newNode --> old front node
        front = newNode;            //front --> newNode
    }
}
