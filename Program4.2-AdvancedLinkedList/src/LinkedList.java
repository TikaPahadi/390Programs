public class LinkedList {
	public Node head;

	
	public void add(int num){
		if(head == null){
			head = new Node(num);			
		} else {
			Node temp = new Node(num);
			temp.next = head;
			this.head = temp;
		}
	}
	
	public void addAtLast(int num){
		if(head == null){
			head = new Node(num);
		} else {
			Node last = findLastNode();
			last.next = new Node(num);
		}
	}
	
	public Node remove(){
		if(head == null){
			return null;
		} else {
			return head = head.next;
		}
	}
	
	
	public void print(){
		Node temp = head;
		System.out.println("");
		if(temp == null){
			System.out.print("Empty List. ");
		} else {	
			while(temp != null){
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}
	
	public void addCollection(int[] array){
		for(int i = 0; i < array.length; i++){
			add(array[i]);
		}
	}
	
	public Node findLastNode(){
		if(head == null){
			return head;
		} else {
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			return temp;
		}
	}
	
	
	
}