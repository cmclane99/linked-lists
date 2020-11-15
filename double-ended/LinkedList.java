public class LinkedList {
    private Anode front;

    public LinkedList() {
        front = null;
    }

    public void insertFront(Anode newNode) {    //Insert node at front of list
        newNode.setNext(front);
        front = newNode;
    }

    public Anode deleteFront(Anode newNode) {   //Deletes first node
        Anode temp = front;
        front = front.getNext();
        return temp;
    }

    public void print() {
        Anode rover = front;

        while(rover != null) {
            System.out.println(rover);
            rover = rover.getNext();
        }
        System.out.println();
    }

    public Anode find(int key) {
        Anode rover = front;

        while(rover != null) {
            if(rover.getID() == key) break;
            rover = rover.getNext();
        }
        return rover;   //Returns reference to node or null
    }

    public Anode delete(int key) {
        Anode rover, prev;
        rover = front;          //If empty list, rover returns null
        prev = null;

        while(rover != null) {      //Find Node with matching key
            if(rover.getID() == key) break;
            prev = rover;
            rover = rover.getNext();
        }

        if(rover != null) {

            if(prev == null) {      //Delete from list containing one element
                front = null;
            }
            else {
                prev.setNext(rover.getNext());  //List of more than one node
            }
        }
        return rover;
    }

    public void insertSort(Anode newNode) {     //Maintains order as elements are inserted in list
        String key = newNode.getName();
        Anode rover, prev;

        rover = front;
        prev = null;
        if(front == null) {  //Empty list
            front = newNode;
        }
        else {
            while(rover != null && rover.getName().compareTo(key) < 0) {
                prev = rover;
                rover = rover.getNext();
            }
            newNode.setNext(rover);
            if(prev != null) {       //Insert at middle or end of list
                prev.setNext(newNode);
            }
            else {                  //Insert at front of list
                front = newNode;
            }
        }

    }

   /* public void insertSortEZ(Anode newNode) {     //Implements sentinels at front and back of list
        String key = newNode.getName();
        Anode rover, prev;

        rover = front;
        prev = null;
        while (rover != null && rover.getName().compareTo(key) < 0) {
            prev = rover;
            rover = rover.getNext();
        }
        newNode.setNext(rover);
        prev.setNext(newNode);
    }
*/
}
