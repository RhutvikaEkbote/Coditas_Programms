import java.util.Collections;

public class Sort_And_Merge_LinkedList {
	 
static node head1 = null;
static node head2 = null;
  

static class node
{
 int data;
 node next;
};

static void setData(node head)
{
 node tmp;
 
 tmp = head;
System.out.println("Merged LinkedList is :");
 while (tmp != null)
 {
   System.out.print(tmp.data + "  ");
   tmp = tmp.next;
 }
}

static node getData(node head, int num)
{
 
 node temp = new node();
 node tail = head;

 temp.data = num;
 temp.next = null;


 if (head == null)
 {
   head = temp;
   tail = temp;
 }


 else
 {
   while (tail != null)
   {
     if (tail.next == null)
     {
       tail.next = temp;
       tail = tail.next;
     }
     tail = tail.next;
   }
 }


 return head;
}

static node mergelists()
{
 node tail = head1;

 while (tail != null)
 {
   if (tail.next == null &&
       head2 != null)
   {
     tail.next = head2;
     break;
   }
   tail = tail.next;
 }


 return head1;
}


static void sortlist()
{
 node curr = head1;
 node temp = head1;

 while (curr.next != null)
 {
   temp = curr.next;
   while (temp != null)
   {
     if (temp.data < curr.data)
     {
       int t = temp.data;
       temp.data = curr.data;
       curr.data = t;
     }
     temp = temp.next;
   }
   curr = curr.next;
 }
}


public static void main(String[] args)
{

 head1 = getData(head1, 4);
 head1 = getData(head1, 7);
 head1 = getData(head1, 5);

 
 head2 = getData(head2, 2);
 head2 = getData(head2, 1);
 head2 = getData(head2, 8);
 head2 = getData(head2, 1);

 head1 = mergelists();

 sortlist();

 setData(head1);
}
}
