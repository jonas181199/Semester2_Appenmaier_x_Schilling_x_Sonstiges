package Schilling.Stack;

import Schilling.LinkedList.ListNode_solution;

public class JonasStack {
    //Nutzung einer verketteten Liste zur Ablage der Elemente
    private ListNode_solution lastElement = null;

    //Zähler der aktuell gespeicherten Elemente
    private int size = 0;

    //push methode fügt neues Element hinzu
    //entweder als erstes Element oder ans Ende des letzten Elements
    public void push(String value){
        ListNode_solution newElement = new ListNode_solution(value);
        if (lastElement == null){
            lastElement = newElement;
        }else{
            newElement.next = this.lastElement;
            this.lastElement = newElement;
        }
        this.size++;
    }

    //pop methode entfernt das letzte Element und gibt es zurück
    //bei einer leeren Liste wird null zurückgegeben
    public String pop(){
        if(lastElement == null){
            return null;
        } else {
            String tmp = lastElement.value;
            lastElement = lastElement.next;
            size--;
            return tmp;
        }
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size==0;
    }



}
