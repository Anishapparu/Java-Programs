import java.util.Scanner;
public class LinkedListPos{
    Node Head;
    class Node{
        int data;
        Node next;

        Node(int val){
            data=val;
            next=null;
        }
    }
    LinkedListPos(){
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
    public void deletebeg(){
        if(Head==null){
            System.out.print("The linked list is empty");
        }
        else{
            Head=Head.next;
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
        LinkedListPos list=new LinkedListPos();
        System.out.println("Enter the list numbers:");
        int n=old.nextInt();
        for(int i=0;i<n;i++){
            int val=old.nextInt();
            list.insertend(val);
        }
        list.deletebeg();
        list.display();
    }
}