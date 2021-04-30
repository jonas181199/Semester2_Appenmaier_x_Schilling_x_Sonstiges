package Schilling.Lösungen.Queue;

public class TestQueue {

    public static void main(String[] args) {

        //Erstellung einer leeren Queue
        MyQueue queue = new MyQueue();

        //Hinzufügen von Elementen auf den Stack
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
        queue.enqueue("E");
        queue.enqueue("F");

        //Überprüfung der Funktion pop des Stacks
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue() == null);
    }

}
