

public class palindrome {

	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
			
		}
		}
		public boolean isPalindrome(Node head)
		{
		Node  two = reverseandClone(head);
			return isEqual( head,  two);
		}
		
		public Node reverseandClone(Node node)
		{
			Node head = null;
			
			while(node!=null)
			{
				Node n =  new Node(node.data);
				n.next = head;
				head = n;
				node = node.next;
			}
			
			
			return head;
		}
		
		public boolean  isEqual(Node one,Node two)
		{
			while(one != null && two != null){
				
				if(one.data != two.data){
					return false;
					
				}
				one = one.next;
				two = two.next;
				
			}
			 return one == null && two == null;
		
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
		public static void main(String arg[])
		{
			palindrome list = new palindrome();
			
			list.push(1);
			list.push(1);
			list.push(2);
			list.push(3);
			list.push(2);
			list.push(1);
			list.push(1);
			
			boolean isPalindrome = list.isPalindrome(list.head); 
			
			if(isPalindrome != false)
			System.out.println("List is palinndrome");
			else
				System.out.println("List is not palinndrome");	
		}
		
	}
	
	

