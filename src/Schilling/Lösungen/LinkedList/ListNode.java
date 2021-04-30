package Schilling.Lösungen.LinkedList;

public class ListNode {

    //Wert des aktuellen Listenelements
    public String value;

    //Verweis auf das nächste Element der Liste.
    // Ist public gesetzt, da es von außen gesetzt wird.
    public ListNode next;

    //Konstruktor mit Wertübergabe
    public ListNode(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }
}
