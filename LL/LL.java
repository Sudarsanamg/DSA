package LL;

public class LL {


    private  Node head;
    private  Node tail;
    private  int size;

    public  LL()
    {
        this.size=0;
    }

    public void  insert_at_first(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size+=1;
    }

    //insert at end

    public  void  insert_At_end(int data)
    {
        if(head==null)
        {

            Node node =new Node(data);
            tail=node;
            tail.data=node.data;
            head=tail;
        }
        else {
            Node node =new Node(data);
            tail.next=node;
            tail=node;
        }
        size+=1;
    }



    public  void  Display()
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("end");
    }




    private  class  Node
    {
        private int data;
        private Node next;

        public  Node(int data)
        {
            this.data= data;
        }
        public  Node(int data,Node next)
        {
            this.data=data;
            this.next=next;
        }
    }
}
