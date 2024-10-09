import java.sql.SQLOutput;
import java.util.Scanner;
public class LinkedList {
    Node Head;
    class Node{
        int data;
        Node next;

        Node(int val){
            data=val;
            next=null;
        }
    }
    LinkedList() {
        Head = null;
    }
        public void insertbeg(int val){
            Node newnode=new Node(val);
            if(Head==null){
                Head=newnode;
            }
            else{
                newnode.next=Head;
                Head=newnode;
            }
        }
        public void display(){
            Node temp=Head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        LinkedList list=new LinkedList();
        System.out.println("Enter the number of list:");
        int n=old.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the values: ");
            int val=old.nextInt();
            list.insertbeg(val);
        }
        list.display();
    }
}
