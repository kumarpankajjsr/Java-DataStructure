package com.doubly_linked_list;

public class DoublyLinkedList
{
     DoublyNode head;

     public void add(int data)
     {
         DoublyNode node = new DoublyNode();
         node.data = data;
         node.next = null;
         node.previous = null;

         if(head == null)
         {
              head = node;
         }
         else
         {
             DoublyNode n = head;
             while(n.next != null)
             {
                 n = n.next;

             }
             node.previous = n;
             n.next = node;
         }
     }
     public void display()
     {
         DoublyNode n = head;
         while(n.next != null)
         {
              System.out.print(n.data+" ");
              n = n.next;
         }
         System.out.print(n.data+" ");
     }
}
