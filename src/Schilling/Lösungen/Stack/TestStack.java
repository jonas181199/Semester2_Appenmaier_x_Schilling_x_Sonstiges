package Schilling.Lösungen.Stack;

public class TestStack {

    public static void main(String[] args) {

        //Erstellung des leeren Stacks
        MyStack stack = new MyStack();

        //Hinzufügen von Elementen auf den Stack
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        stack.push("F");

        //Überprüfung der Funktion pop des Stacks
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

}
