

public class LinkedList {
Node head;

static class Node
{
	int data;
	Node next;
	
	public Node(int d)
	{
		data= d;
		next =null;
		
	}
	}
	public void print()
	{
		Node n = head;
		
		while(n!=null)
		{
			System.out.println(n.data + " ");
			n = n.next;
		}
	}
	
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	public void insert_after(Node prev_node, int new_data)
	{
		if(prev_node == null)
		{
			System.out.println("previous node can't be null");
			
		}
		Node new_node = new Node(new_data);
		
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		
	}
	public void append(int new_data)
	{
		Node n = head;
		if(head == null)
		{
			n = new Node(new_data);
			return;
		}
		
		while(n.next != null)
		{
			n = n.next;
			
		}
		Node new_node = new Node(new_data);
		new_node.next = null;
		n.next = new_node;
		return;
	}
	public void delete(int key)
	{
		Node temp = head, prev = null;
		if(temp != null && temp.data == key)
		{
			head = head.next;
			return;
			
		}
		while(temp != null && temp.data != key)
		{
			prev  = temp;
			temp = temp.next;
			
		}
		if(temp == null)
		{
			return;
			
		}
		prev.next = temp.next;
		
	}
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		list.head.next = second;
		second.next = third;
		
		list.push(4);
		list.push(5);
		list.push(6);
		list.insert_after(list.head.next.next, 9999);
		list.append(555);
		list.delete(555);
		list.delete(9999);
		list.print();
	}


}		
