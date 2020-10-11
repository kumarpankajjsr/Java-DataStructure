package com.linkedlist_data_structure;

public class LinkedList
{
       Node head;

       public void add(int data)
       {
             Node node = new Node();
             node.data = data;
             node.next = null;

             if(head == null)
             {
                 head = node;
             }
             else
             {
                 Node n = head;
                 while(n.next != null)
                 {
                      n = n.next;
                 }
                 n.next = node;
             }
       }

       public void display()
       {
           Node n = head;
           while(n.next != null)
           {
                System.out.print(n.data+" ");
                n = n.next;
           }
           System.out.print(n.data);
       }
}
