
public class delete_from_singlyList {

	Node head;
	  class Node{
		 
		 int data;
		 Node next;
		 
		  Node(int data)
		 {
			this.data = data;
			 next = null;
			 
		 }
	 }
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		
		new_node.next = head;
		head = new_node;
	}
	public void print()
	{
		Node current = head;
		while(current!=null)
		{
			System.out.println(current.data+" ");
			current = current.next;
		}
	}
	public void delete(Node ptr)
	{
		
		ptr.data = ptr.next.data;
		ptr.next = ptr.next.next;
		
		
	}
	public static void main(String arg[])
	{
		delete_from_singlyList list = new delete_from_singlyList();
		list.push(10);
		list.push(11);
		list.push(12);
		list.push(14);
		list.push(55);
		
		list.print();
		
		list.delete(list.head.next);
		
		list.print();
		
	}
	
}
