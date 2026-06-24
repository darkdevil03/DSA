package course_01_core_java.chapter03_data_structures.linked_list;

/*
    Main method written separately in the same package "collectionsBuild.LinkedList" of name LLMain
*/

class Node{
    int val;
    Node next;
    public Node(int val){ // node
        this.val=val; //
        // System.out.println(this.val+" : "+this.next); // Checks
    }
}

public class Ex01_SingleLL{

    Node head;

    //Insertion of value to Single LinkedList
    public void insert(int val){
        if(head==null){
            head=new Node(val);
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = new Node(val);
        }
    }

    //Insertion of value based on position. Note position starts from 0
    public void insertValAtPosition(int val, int pos){

        if(head==null){
            head=new Node(val);
        }
        else if(pos==0){
            insertAtStart(val);
        }
        else{
            System.out.println();
            System.out.println("Insertion of value "+ val +" at position "+pos+" into LL");
            int posCheck=0;
            Node trav = head;
            while(trav!=null){
                if(posCheck+1 == pos){
                    Node newNode = new Node(val);
                    newNode.next=trav.next;
                    trav.next=newNode;
                }
                posCheck++;
                trav=trav.next;
            }
        }
    }

    //Insertion of value at start
    public void insertAtStart(int val){
        System.out.println();
        System.out.println("Insertion of value "+ val +" at start position into LL");
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
    }

    //Insertion of value at last
    public void insertAtLast(int val){
        System.out.println();
        System.out.println("Insertion of value "+ val +" at last position into LL");
        Node trav= head;
        while(trav.next!=null){
            trav=trav.next;
        }
        trav.next=new Node(val);
    }

    // deletion from position
    public void deleteAtPos(int pos){

        if(head==null){
            System.out.println(" No Single Linked List Created !!");
        }else if(pos==0){
           deleteAtStart(); // head=head.next;
        }else{
            System.out.println();
            System.out.println("Value deleted from "+pos+" position of LL");
            int posTrack=1;
            Node trav=head;
            while(trav!=null){
                if(posTrack==pos){
                    trav.next=trav.next.next;
                    break;
                }
                posTrack++;
                trav=trav.next;

            }
        }
    }

    // Deletion at start
    public void deleteAtStart(){
        System.out.println();
        System.out.println("Value deleted from 0 position of LL");
        if(head==null){
            System.out.println(" No Single Linked List Created !!");
        }else{
            head=head.next;
        }
    }

    // Deletion at last
    public void deleteAtLast(){
        System.out.println();
        System.out.println("Value deleted from last position of LL");
        Node trav = head;
        while(trav.next.next!=null){
            trav=trav.next;
        }
        trav.next=null;
    }

    //Printing the values in Linked list
    public void show(){
        System.out.println("Current Single Linked List Values :");
        Node trav= head;
        while(trav!=null){
            System.out.print(trav.val+" ");
            trav=trav.next;
        }
        System.out.println();
    }
}
