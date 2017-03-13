import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class sol {
    public static  Node insert(Node head,int data) {     
        if (head == null) {         
            head = new Node(data); 
        } else {  
            Node node = insert(head.next, data);
            head.next = node; // Can merge these two lines as well
        }
        return head;
    }
        //Complete this method
   

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}