package circularlinkedlist;

public class Circularlinkedlist {
	public Node head;
	public Node tail;
	public int size;
	public Node createCSLL(int nodeValue)
	{
		head=new Node();
		Node node=new Node();
		node.value=nodeValue;
		node.next=null;
		head=node;
		tail=node;
		size=1;
		return head;
		
	}
public void insertionOfCSLL(int location,int value)
{
	Node node=new Node();
	node.value=value;
	if(head==null)
	{
		createCSLL(value);
	}else if(location==0) //insertion at beginning
	{  
		node.next=head;
		head=node;
		tail.next=head;
}else if(location>=size) {
	tail.next=node;
	tail=node;
	tail.next=head;
}else {
	Node tempNode=head;
	int index=0;
	while(index<location-1) {
		tempNode=tempNode.next;
		index++;
	}
	node.next=tempNode.next;
	tempNode.next=node;
}
	size++;
}
public void traversalOfCSLL() {
	if(head==null) {
		System.out.println("List does not exist");
	}else {
		Node tempNode=head;
		for (int i = 0; i <=size-1; i++) {
			System.out.println(tempNode.value + " ");
			tempNode=tempNode.next;
		}
	}
}
boolean searchingOfCSLL(int searchValue) {
	if(head!=null) {
		Node tempNode=head;
		for (int i = 0; i < size; i++) {
			if(tempNode.value==searchValue) {
				System.out.println("The value is present in "+" the index of " + i);
				return true;
			}
			tempNode=tempNode.next;
		}
	}
	System.out.println("The value is not present");
	return false;
}
public void deletingCSLL() {
	head=null;
	tail.next=null;
	tail=null;
	System.out.println("The list is deleted");
}
}
