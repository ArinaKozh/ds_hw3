public class DoublyLinkedList<T> {
    private Node head;
    private Node tail;
    public class Node
    {
        public T value;
        public Node next, prev;
    }
    public void addFirst(T value){
        Node node = new Node();
        node.value = value;
        if (head == null && tail == null){
            tail = node;
        }
        else{
            node.next = head;
            head.prev = node;
        }
        head = node;
    }

    public void removeFirst(){
        if (head != null){
            head = head.next;
            head.prev = null;
        }
    }

    public void addLast(T value){
        Node node = new Node();
        node.value = value;
        if (tail == null && head == null){
            head = node;
        }
        if (tail != null){
            tail.next = node;
            node.prev = tail;
        }
        tail = node;
    }

    public void removeLast(){
        if (tail != null){
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void revert(){
        if (head == null || head == tail){
            return;
        }
        Node temp = head;
        head = tail;
        tail = temp;
        Node node = head;
        while (node != null){
            temp = node.next;
            node.next = node.prev;
            node.prev = temp;
            node = node.next;
        }
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        Node node = head;
        while (node != null){
            stringBuilder.append(node.value);
            stringBuilder.append('\n');
            node = node.next;
        }
        return stringBuilder.toString();
    }
}
