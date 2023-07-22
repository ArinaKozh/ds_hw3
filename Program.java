public class Program {
    
    public static void main(String[] args) {
        
        LinkedList<Employee> linkedList1 = new LinkedList<>();
        linkedList1.addFirst(new Employee("Пётр", 43));
        linkedList1.addFirst(new Employee("Елена", 55));
        linkedList1.addLast(new Employee("Владимир", 21));
        linkedList1.addLast(new Employee("Виктория", 27));
        linkedList1.addLast(new Employee("Алёна", 30));

        System.out.println(linkedList1);
        linkedList1.revert();
        System.out.println(linkedList1);

        DoublyLinkedList<Employee> linkedList2 = new DoublyLinkedList<>();
        linkedList2.addFirst(new Employee("Станислав", 43));
        linkedList2.addLast(new Employee("Пётр", 43));
        linkedList2.addLast(new Employee("Елена", 55));
        linkedList2.addLast(new Employee("Владимир", 21));

        System.out.println(linkedList2);
        linkedList2.revert();
        System.out.println(linkedList2);
    }
}
