public class Anode {
    private int age;
    private int ID;
    private String name;
    private Anode next;

    public Anode(int newAge, int newID) {
        age = newAge;
        ID = newID;
    }

    public Anode(String n, int newAge, int newID) {  //Used for insertSort()
        name = n;
        age = newAge;
        ID = newID;
    }

    public Anode getNext() {
        return next;
    }

    public void setNext(Anode newNode) {
        next = newNode;
    }

    public String toString() {
        return name+" "+age+" "+ID;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    /*public int compareTo(Anode newNode) {
        return name.compareTo(newNode.name);
    }*/
}
