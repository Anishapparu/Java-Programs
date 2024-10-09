import java.util.Scanner;
class  SLLimportbeg{
    Node Head;
    class Node{
        int data;
        Node next;

        Node(int val){
            data=val;
            next=null;
        }
    }
    SLLimportbeg(){
        Head=null;
    }
    public void insertbegi(int val){
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

    public static void main(String[] args) {
        Scanner old=new Scanner(System.in);
        SLLimportbeg Sll=new SLLimportbeg();
        int val;
        while(true){
            val=old.nextInt();
            if(val==-1){
                break;
            }
            else{
                Sll.insertbegi(val);
            }
        }
        Sll.display();

    }

}