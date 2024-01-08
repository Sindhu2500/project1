package singlyLinfedlist;

public class Singlylinkedlist {
	public Node head;
	public Node tail;
	public int size;
	public Node createSLL(int nodevalue)
	{
		head=new Node();
		Node node=new Node();
		node.value=nodevalue;
		node.next=null;
		head=node;
		tail=node;
		size=1;
		return head;
	}
	public void insertSLL(int loc,int value){
		Node node=new Node();
		node.value=value;
		if(head==null){
			createSLL(value);
		}
		else if(loc==0){  //insertion at beginning
			node.next=head;
			head=node;
		}
		else if(loc>=size){ // insertion at last
			node.next=null;
			tail.next=node;
			tail=node;
		}
		else{
			Node tempNode=head;
			int index=0;
			while(index<loc-1){
				tempNode=tempNode.next;
				index++;
			}
			Node nextNode=tempNode.next;
			tempNode.next=node;
			node.next=nextNode;
		}
		size++;
	}
	public void traversalSLL(){
		if(head==null){
			System.out.println("List does not exist");
		}
		else{
			Node tempNode=head;
			for(int i=0;i<size;i++){
				System.out.println(tempNode.value+" ");
				tempNode=tempNode.next;
			}
		}
	}
	boolean searchingSLL(int searchvalue){
		if(head!=null){
			Node tempNode=head;
			for(int i=0;i<size;i++){
				if(searchvalue==tempNode.value){
					System.out.println("the value is present in the list of"+i);
					return true;
				}
				tempNode=tempNode.next;
			}
		}
		System.out.println("value is not present");
		return false;
	}
	
	public void deletingSLL(){
		head=null;
		tail=null;
		System.out.println("the list is deleted"); 
	}
}

