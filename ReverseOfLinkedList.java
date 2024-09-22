
class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
class LL
{
    static Node head;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
 
    public static void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
 
        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }
 
 
 
    public static void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }

    public static void reverse()
    {
        Node current=head;
        Node prev=null;
        while(current != null)
        {   
            Node next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        LL list=new LL();

        list.head=new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        
        list.print();

        list.reverse();
        System.out.println();
        list.print();
        addFirst(6);
        System.out.println();
        list.print();
        

    }
}