import java.util.Comparator;

public class LinkedList<T> {

    public class Node{

        public Node next;
        public T value;
    }

    private Node head;
    
    public void addFirst(T value){
        Node node = new Node();
        node.value = value;
        if (head != null){
            node.next = head;
        }
        head = node;
    }

    public void removeFirst(){
        if (head != null){
            head = head.next;
        }
    }

    public void addLast(T value){
        Node node = new Node();
        node.value = value;
        if (head == null){
            head = node;
        }
        else{
            Node lastNode = head;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
    }

    public void removeLast(){
        if (head == null)
            return;
        if (head.next == null){
            head = null;
            return;
        }
        Node node = head;
        while(node.next.next != null){
            node = node.next;
        }
        node.next = null;
    }

    public Node contains(T value){
        Node node = head;
        while (node != null){
            if (node.value.equals(value)){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void sort(Comparator<T> comparator){
        Node node = head;
        while (node != null){
            Node minNode = node;
            Node node2 = node.next;
            while (node2 != null){
                if(comparator.compare(minNode.value, node2.value) > 0){
                    minNode = node2;
                }
                node2 = node2.next;
            }
            if (node != minNode){
                T temp = minNode.value;
                minNode.value = node.value;
                node.value = temp;
            }
            node = node.next;
        }
    }

    public void revert(){
        if (head == null)
            return;
        Node node = head.next;
        head.next = null;
        while (node != null){
            Node nextNode = node.next;
            node.next = head;
            head = node;
            node = nextNode;
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
