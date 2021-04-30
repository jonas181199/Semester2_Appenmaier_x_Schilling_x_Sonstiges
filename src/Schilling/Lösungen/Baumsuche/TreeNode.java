package Schilling.Lösungen.Baumsuche;

public class TreeNode {
    //Wert des Baumelements
    public String value;
    //Linker Kindknoten
    public TreeNode left;
    //Rechter Kindknoten
    public TreeNode right;

    public TreeNode(String value){
        this.value = value;
    }

    public String toString(){
        return value;
    }
}
