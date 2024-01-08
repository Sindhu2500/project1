package circularlinkedlist;

public class Circularmainclass {
	public static void main(String[] args) {
		 Circularlinkedlist 	csll=new Circularlinkedlist();
		 csll.createCSLL(5);
			System.out.println("The list is inserted with the values");
			
			csll.insertionOfCSLL(1, 9);
			csll.insertionOfCSLL(2, 8);
			csll.insertionOfCSLL(3, 7);
			csll.insertionOfCSLL(4, 6);
			csll.insertionOfCSLL(5, 11);
			
			csll.traversalOfCSLL();
			
			csll.searchingOfCSLL(7);
			
			csll.deletingCSLL();


		}
		}

