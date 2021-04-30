package Schilling.Stack;

public class TestJonasStack {

    public static void main(String [] args){

        //leeren Stack erstellen
        JonasStack stack = new JonasStack();

        //Elemente hinzufügen
        stack.push("Jonas");
        stack.push("Elias");
        stack.push("Roland");
        stack.push("Michaela");
        stack.push("Maria");
        stack.push("Eugen");

        System.out.println(stack.pop());
        System.out.println(stack.pop());



    }


}
