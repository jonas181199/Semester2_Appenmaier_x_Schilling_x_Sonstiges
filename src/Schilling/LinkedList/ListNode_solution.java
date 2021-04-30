package Schilling.LinkedList;

public class ListNode_solution {

    //Wert des aktuellen Listenelements
    public String value;

    //Verweis auf das nächste Element der Liste.
    // Ist public gesetzt, da es von außen gesetzt wird.
    public ListNode_solution next;

    //Konstruktor mit Wertübergabe
    public ListNode_solution(String value) {
        this.value = value;
    }

    public String toString(){
        return value;
    }

}
