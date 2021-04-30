package Schilling.Lösungen.Baumsuche;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestTraversal {


    // Please implement methods:
    //  * depthFirstTraversal
    //  * breadthFirstTraversal
    // which print out the content of the tree in the
    // particular order and test your implementation
    // Consider the example usages of stack and queue below.

    //für Tiefensuche wird ein Stack benötigt
    public static void depthFirstTraversal(Stack<TreeNode> stack){
        if(!stack.empty()){
            TreeNode node = stack.pop();
            System.out.println("Aktuelles Element: " + node.value);
            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
            depthFirstTraversal(stack);
        }
    }

    //für Breitensuch wird eine Queue benötigt
    public static void breadthFirstTraversal(Queue<TreeNode>queue){
        if(!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.println("Aktuelles Element: " + node.value);
            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }
        }
    }

    public static void main(String[] args) {

        //Building Tree
        //1. Create Nodes
        TreeNode nodeA = new TreeNode("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        TreeNode nodeD = new TreeNode("D");

        /*
        TreeNode nodeE = new TreeNode("E");
        TreeNode nodeG = new TreeNode("G");
        TreeNode nodeL = new TreeNode("L");
        TreeNode nodeM = new TreeNode("M");
        TreeNode nodeP = new TreeNode("P");
        TreeNode nodeQ = new TreeNode("Q");
        TreeNode nodeW = new TreeNode("W");
        TreeNode nodeX = new TreeNode("X");
        TreeNode nodeY = new TreeNode("Y");
        */


        //2. Set References
        nodeA.right = nodeC;
        nodeA.left = nodeB;
        nodeB.left = nodeD;



        /*
        nodeA.right = nodeM;

        nodeG.right = nodeE;
        nodeM.left = nodeB;
        nodeM.right = nodeW;
        nodeB.left = nodeX;
        nodeB.right = nodeQ;
        nodeW.right = nodeY;
        nodeY.left = nodeP;
        nodeY.right = nodeL;
        */


        //Example operations for stack
        // Initialization
        Stack<TreeNode> stack = new Stack<TreeNode>();
        // Add new element
        stack.push(nodeA);
        //stack.push(nodeG);
        //stack.push(nodeM);
        //stack.push(nodeB);
        //stack.push(nodeW);
        //stack.push(nodeY);
        System.out.println("-----Depth first-----");
        depthFirstTraversal(stack);
        // Remove latest element
        //TreeNode tmp = stack.pop();





        // Example operations for queue
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        // Add new element
        queue.offer(nodeA);
        // Remove first element
        //TreeNode tmp2 = queue.poll();
        System.out.println("-----Breadth first-----");
        breadthFirstTraversal(queue);


    }
}
