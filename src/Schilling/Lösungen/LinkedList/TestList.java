package Schilling.Lösungen.LinkedList;

public class TestList {

    public static void main(String[] args) {

        //Erstellung der einzelnen Listenelemente
        ListNode node_1 = new ListNode("A");
        ListNode node_2 = new ListNode("B");
        ListNode node_3 = new ListNode("C");
        ListNode node_4 = new ListNode("D");
        ListNode node_5 = new ListNode("E");
        ListNode node_6 = new ListNode("F");


        //Verkettung der einzelnen Listenelmente zu einer Liste
        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        node_4.next = node_5;
        node_5.next = node_6;

        //Test der Verkettung
        for(ListNode i = node_1; i != null; i = i.next){
            System.out.println(i.value);
        }

    }

}
