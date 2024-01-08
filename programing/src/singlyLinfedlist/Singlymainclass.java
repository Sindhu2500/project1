package singlyLinfedlist;

public class Singlymainclass {
	public static void main(String[] args) {
		 Singlylinkedlist 	sll=new Singlylinkedlist();
		 sll.createSLL(5);
		 System.out.println("the list is created"+"with the value of"+sll.head.value);
		 sll.insertSLL(1, 3);
		 sll.insertSLL(2, 4);
		 sll.insertSLL(3, 5);
		 sll.insertSLL(4, 6);
		 sll.insertSLL(5, 7);
		 sll.traversalSLL();
		 sll.searchingSLL(3);
		 sll.deletingSLL();
}
}
