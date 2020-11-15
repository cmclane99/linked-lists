public class UseLinkedList {

    public static void main(String[] args) {
        Anode Node1 = new Anode("Tom",18,23174);
        Anode Node2 = new Anode("Jake",20,16985);
        Anode Node3 = new Anode("Mike",19,48264);
        Anode Node4 = new Anode("Caleb",22,74612);

        LinkedList myList = new LinkedList();   //Single Ended Linked List

        myList.insertSort(Node1);      //Insert Node1
        myList.insertSort(Node2);      //Insert Node2
        myList.insertSort(Node3);      //Insert Node3

        Anode findResult = myList.find(23174);      //Find node in list
        if(findResult != null) {
            System.out.println("Match found: "+findResult);
        }
        else {
            System.out.println("Match not found");
        }

        myList.delete(23174);   //Delete node

        myList.print();

        //------------------------------------------------------------------
        DoubleEnded dList = new DoubleEnded();      //Double Ended Linked List

        dList.insertFront(Node1);
        dList.insertFront(Node2);
        dList.insertBack(Node3);
        dList.insertBack(Node4);
        dList.print();

        dList.deleteFront();
        dList.print();

    }
}
