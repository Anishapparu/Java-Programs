import java.util.Scanner;
public class priorityqueue {
    Node head;
    class Node{
        int data;
        int pri;
        Node next;

        Node(int val,int k){
            data=val;
            pri=k;
            next=null;
        }
    }
    priorityqueue(){
        head=null;
    }
    public void enqueue(int val,int pri){
        Node newnode=new Node(val,pri);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            if(head.pri>pri){
                newnode.next=head;
                head=newnode;
            }
            else{
                while(temp.next!=null && temp.next.pri<pri){
                    temp=temp.next;
                }
                newnode.next=temp.next;
                temp.next=newnode;
            }
        }
    }
    public void dequeue(){
        head=head.next;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        priorityqueue list=new priorityqueue();
        int n=old.nextInt();
        for(int i=0;i<n;i++){
            int val=old.nextInt();
            int prii=old.nextInt();
            list.enqueue(val,prii);
        }
        System.out.println("Enqueue:");
        list.display();
        System.out.println("\nDequeue:");
        list.dequeue();
        list.display();
    }

}
