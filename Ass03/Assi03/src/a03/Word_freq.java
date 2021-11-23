package a03;

public class Word_freq {
	//implementing a linked list
	public class Node{
		String str;
		int freq;
		Node next;
	}
	Node head;
	
	public Word_freq() {
		head = null;	
	}
	
	public Node insert(String word) {
		Node temp_node = new Node();
		temp_node.str = word;
		temp_node.freq = 1;
		temp_node.next = null;
		return temp_node;
	}
	
	public Node Search(Node head , String word) {
		if(head == null) {
			Node temp = insert(word);
			head = temp;
			return head;
		}
		else if(head.str.compareTo(word)==0) {
			head.freq += 1;
			return head;
		}
		else if (head.str.compareTo(word)!=0 ) {
			head.next = Search (head.next , word);
		}
		return head;
	}
	
	public void Display (Node head) {	
		while (head!=null) {
			System.out.println("Frequency of word '" + head.str + "' is " + head.freq);
			head = head.next;
		}
	}
	
}
