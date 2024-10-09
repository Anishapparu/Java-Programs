import java.util.Scanner;
public class LinkedListdele {
    Node Head;
    class Node{
        int data;
        Node next;

        Node(int val){
            data=val;
            next=null;
        }
    }
    LinkedListdele(){
        Head=null;
    }
    public void insertend(int val){
        Node newnode=new Node(val);
        if(Head==null){
            Head=newnode;
        }
        else{
            Node temp=Head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    public void position(int pos,int val){
        Node newnode=new Node(val);
        Node temp=Head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
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
        LinkedListdele listt=new LinkedListdele();
        System.out.print("Enter the number of value:");
        int n=old.nextInt();
        for(int i=0;i<n;i++){
            int val=old.nextInt();
            listt.insertend(val);
        }
        System.out.println("Enter the position value:");
        int pos=old.nextInt();
        System.out.println("Enter the value of node:");
        int val=old.nextInt();
        listt.position(pos,val);
        listt.display();
    }

}
