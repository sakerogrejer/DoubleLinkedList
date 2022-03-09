public class Main
{
    public static void main(String[] args)
    {

    }
}

class DoubleLinkedList<E>
{

    class Node
    {
        E value;
        Node next;
        Node previous;
    }

    @Override
    public String toString() {
        String s = "";
        Node n = head;
        while(n.next !=null)
        {
            if(n.previous != null)
            {
                s += n.value + " " + n.previous.value + " ";
            }else
            {
                s += n.value + " ";
            }

            n = n.next;
        }
        s += n.value;
        return s;
    }

    Node head;
    void add(E i) {
        Node newnode = new Node();
        newnode.value = i;
        newnode.next = head;

        if(this.head != null)
        {
            head.previous = newnode;
        }

        head = newnode;
    }


    void printList()
    {
        Node n = head;
        while(n.next !=null)
        {
            if(n.previous != null)
            {
                System.out.print(n.value + " " + n.previous.value + " ");
            }else
            {
                System.out.print(n.value + " ");
            }

            n = n.next;
        }
        System.out.print(n.value);

    }
}