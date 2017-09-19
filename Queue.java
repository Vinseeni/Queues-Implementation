public class Queue {

Node head;//remove from head; dequeue
Node tail;//add to tail;enqueue
    public void enqueue(int data){
        Node addedData = new Node(data);
        if(head ==null){
          head = addedData;
          tail = addedData;
          return;
        }
        Node current = head;

        while(current.next!=null) {
            current=current.next;
        }
            current.next = addedData;
            tail = addedData;
             }

    public int dequeue(){
        int dequeuedData = head.data;
        head = head.next;
        System.out.println(dequeuedData + "\n");
        return dequeuedData;
    }

    public void printLinkedList(){
        Node current = head;

        if (current ==null){
            System.out.println("Empty LinkedList");
        }
        else{
            while(current.next!= null){
                System.out.println(current.data);
                current = current.next;
            }
            System.out.println(current.data);
        }
        System.out.println("\n");
    }

    public static void main(String[] args){
        Queue q1 = new Queue();

        q1.enqueue(4);
        q1.enqueue(3);
        q1.enqueue(6);

        q1.printLinkedList();

        q1.dequeue();

        q1.printLinkedList();
    }

}
