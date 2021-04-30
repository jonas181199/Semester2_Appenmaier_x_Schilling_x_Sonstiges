package Schilling.Lösungen.Stack;

import Schilling.Lösungen.LinkedList.ListNode;

public class MyStack {

    //Nutzung einer verketteten Liste zur Ablage der Elemente
    private ListNode lastElem = null;

    //Zähler der aktuell gespeicherten Listenelemente
    private int size = 0;

    //Die push Methode fügt ein neues Element hinzu, indem es
    //bei einer leeren Liste, das übergebene Element als Ausgang nimmt.
    //Bei einer bestehenden Liste, wird das neue Element an letzte Position gesetzt
    public void push(String value){
        ListNode newElem = new ListNode(value);
        if (lastElem == null){
            lastElem = newElem;
        }else{
            newElem.next = this.lastElem;
            this.lastElem = newElem;
        }
        this.size++;
    }

    //Die pop Methode entfert das letzte Element und gibt dieses zurück. Bei einer leeren
    //Liste wird nur null zurückgegeben. Bei einer bestehenden Liste wird das letzte Element zurück-
    //gegeben und die Referenz auf das letzte Element entfernt.
    public String pop(){
        if(lastElem == null){
            return null;
        }else{
            String tmp = lastElem.value;
            lastElem = lastElem.next;
            size--;
            return  tmp;
        }
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

}
