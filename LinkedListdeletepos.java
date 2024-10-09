import java.util.Scanner;
public class LinkedListdeletepos {
    Node Head;
    class Node{
        int data;
        Node next;

        Node(int val){
            data=val;
            next=null;
        }
    }
    LinkedListdeletepos(){
        Head=null;
    }
    public void insertend(int val) {
        Node newnode = new Node(val);
        if (Head == null) {
            Head = newnode;
        } else {
            Node temp = Head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
        public void display(){
            Node temp=Head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        public void deletepos(int pos){
        Node temp=Head;
        Node pre=null;
        for(int i=1;i<pos;i++){
            pre=temp;
            temp=temp.next;
        }
        pre.next=temp.next;
        }
    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        LinkedListdeletepos list=new LinkedListdeletepos();
        while(true){
            int val=old.nextInt();
            if(val==-1){
                break;
            }
            list.insertend(val);
        }
        list.display();
        System.out.println("Enter the position :");
        int pos=old.nextInt();
        list.deletepos(pos);
        list.display();
    }
}
