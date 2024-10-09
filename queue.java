import java.util.Scanner;
class queue{
    Node Head;
    class Node{
        int data;
        Node next;

        Node(int val){
            data=val;
            next=null;
        }
    }
    queue(){
        Node Head=null;
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
    public void display(){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
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


    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        queue old1=new queue();
        while(true){
            int val=old.nextInt();
            if(val==-1){
                break;
            }
            old1.insertend(val);
        }
        old1.deletebeg();
        old1.display();
    }


}