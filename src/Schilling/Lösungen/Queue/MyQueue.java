package Schilling.Lösungen.Queue;

import Schilling.Lösungen.LinkedList.ListNode;

public class MyQueue {
    //Nutzung einer verketteten Liste zur Ablage der Elemente.
    //Es werden zwei Zeiger verwendet, da neue Elemente hinten angefügt werden
    //aber bei der Entnahme stets das vorderste Element verwendet wird
    private ListNode firstElem = null;
    private ListNode lastElem = null;

    //Zähler der aktuell gespeicherten Listenelemente
    private int size = 0;


    //Beim Einfügen eines neuen Elements wird überprüft ob es sich um das erste Element handelt. Ist dies
    //der Fall werden first und last Referenz auf das Element gesetzt. Ist mindestens ein Element bereits in der
    //Queue wird das neue Element am Ende der Liste angefügt
    public void enqueue(String value){
        ListNode tmp = new ListNode(value);
        if (size == 0){
            this.firstElem = tmp;
            this.lastElem = tmp;
        }
        else{
            this.lastElem.next = tmp;
            this.lastElem = tmp;
        }
        this.size++;
    }

    //Beim Entfernen eines Elements wird zunächst überprüft ob überhaupt mind. ein Element in der Liste ist.
    //Ist dies nicht der Fall wird null zurückgegeben. Ist mind. ein Element vorhanden, wird der Wert des ersten Elements
    //bestimmt und das Element aus der Liste entfernt.
    public String dequeue(){
        String result;
        if (size == 0){
            return null;
        }
        else{
            result = this.firstElem.value;
            ListNode newFirst = this.firstElem.next;
            if(newFirst == null){
                this.lastElem = null;
            }

            this.firstElem = newFirst;

            this.size--;
            return result;
        }
    }

    public int size(){
        return this.size;
    }



}
