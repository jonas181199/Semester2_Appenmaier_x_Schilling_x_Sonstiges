package Schilling.LinkedList;

public class TestList_solution {

    public static void main (String[] args){
        //erstellen der Elemente
        ListNode_solution node1 = new ListNode_solution("Jonas");
        ListNode_solution node2 = new ListNode_solution("Elias");
        ListNode_solution node3 = new ListNode_solution("Mama");
        ListNode_solution node4 = new ListNode_solution("Roland");
        ListNode_solution node5 = new ListNode_solution("Maria");
        ListNode_solution node6 = new ListNode_solution("Eugen");

        //Verkettung der Elemente
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        //Ausführen der Verkettung
        for(ListNode_solution i = node1; i != null; i = i.next){
            System.out.println(i.value);
        }




    }

}
