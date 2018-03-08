 class Node{
		int data;
		Node next;
		 public Node(int data){
			this.data= data;
			next = null;
		 }			 
		 }
public class merging_Sorted_Lists {
	Node head;

	
	public static void print(Node head1)
	{
		
		Node n = head1;
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
	
	public static Node merge_Sort(Node head1, Node head2 ){
		
		Node head = new Node(0);
		Node current = head;
		while(head1!=null||head2!=null)
		{
			
			if(head1!=null&&head2!=null){
			if(head1.data <= head2.data)
			{
				current.next = head1;
				head1 = head1.next;
				
			}
			else 
			{
				current.next = head2;
				head2 = head2.next;
				
			}
			current = current.next;
			}
			else if(head1 == null)
			{
				current.next = head2;
				break;
				
			}
			else if(head2 == null)
			{
				current.next = head1;
				break;
			}
		}
		
		return head.next;
	}
	
	public static void main(String[] arg)
	{
		merging_Sorted_Lists list1 =  new merging_Sorted_Lists();
		merging_Sorted_Lists list2 =  new merging_Sorted_Lists();
		
		list1.push(93);
		list1.push(71);
		list1.push(55);
		list1.push(34);
		list1.push(19);
		
		list2.push(81);
		list2.push(62);
		list2.push(43);
		list2.push(24);
		
		
		
		Node head = merge_Sort(list1.head, list2.head);
		print(head);
		
		
		
		
	}
}
