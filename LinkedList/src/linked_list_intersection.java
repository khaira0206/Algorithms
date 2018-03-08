
class Result{
 	Node tail;
	 int size;
	
	public Result(Node tail, int size){
		
		this.tail = tail;
		this.size = size;
	}
	
}

public class linked_list_intersection {
Node head;


public Node listIntersection(Node list1, Node list2){
	if(list1 == null || list2 == null)
	{
		return null;
	}
	
	Result result1 = getTailAndSize(list1);
	Result result2 = getTailAndSize(list2);
	
	if(result1.tail != result2.tail)
	{
		return null;
	}
	Node longer = result1.size<result2.size ? list2: list1;
	Node shorter = result1.size<result2.size ? list1: list2;
	
	longer  = getKthNode(longer, Math.abs(result1.size - result2.size));
	
	while(shorter != longer)
	{
		
		shorter  = shorter.next;
		longer = longer.next;
	}
	
	return longer;
}
public Result getTailAndSize(Node list)
{
	if(list == null)
		return null;
	int size = 1;
	Node current = list;
	
	while(current.next!=null){
		size++;
		current = current.next;
		
	}
	return new Result(current,size);
}
public Node getKthNode(Node head , int k)
{
	Node current = head;
	while(k > 0 && current != null){
		k--;
		current = current.next;
		
	}
	return current;
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
public static void main(String arg[]){
	
	linked_list_intersection list1 = new linked_list_intersection();
	linked_list_intersection list2 = new linked_list_intersection();
	
	list1.push(1);
	list1.push(2);
	list1.push(3);
	list1.push(4);
	list1.push(5);
	list1.push(6);
	
	
	
	list2.push(list1.head.next.next.data);
	list2.push(10);
	list2.push(22);
	list2.push(56);
	
	list1.print();
	System.out.println("List2");
	list2.print();
	Node val = list2.listIntersection(list1.head, list2.head);
	
	if(val == null)
	{
		System.out.println("Lists don't intersect");
	}
	else{
		
		System.out.println(val);
	}
}
}
