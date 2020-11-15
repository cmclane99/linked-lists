public class DoubleEnded {
    private Anode front;        //Reference to first link
    private Anode back;         //Reference to last link

    public DoubleEnded() {
        front = null;
        back = null;
    }

    public void insertFront(Anode newNode) {
        //Insert node at front of list
        if(front == null) {     //Empty list
            back = newNode;
        }
        else {
            newNode.setNext(front);     //newNode --> old first
        }
        front = newNode;
    }

    //deleteFront() and insertBack() can be used to implement a queue
    public Anode deleteFront() {
        //Delete node at front of list
        Anode retNode = front;

        if (front != null) {
            front = front.getNext();

            if (front == null)      //Empty list
                back = null;
        }
        return retNode;
    }

    public void insertBack(Anode newNode) {
        //Inserts node at end of list
        if(front == null) {     //Empty list
            front = newNode;
        }
        else {
            back.setNext(newNode);
        }
        back = newNode;
    }

    public void print() {
        Anode rover = front;

        while(rover != null) {
            System.out.println(rover);
            rover = rover.getNext();
        }
        System.out.println();
    }
}
