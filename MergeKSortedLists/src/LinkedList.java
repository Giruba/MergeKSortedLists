
public class LinkedList {
	private LinkedListNode head;
	
	public LinkedList(LinkedListNode linkedListNode) {
		this.head = linkedListNode;
	}
	
	public void SetLinkedListHead(LinkedListNode linkedListNode) {
		this.head = linkedListNode;
	}
	
	public LinkedListNode GetLinkedListHead() {
		return this.head;
	}
	
	public LinkedListNode InsertAtEnd(LinkedListNode linkedListNode, int data) {
		if(linkedListNode == null) {
			linkedListNode = new LinkedListNode(data);
			return linkedListNode;
		}
		LinkedListNode current = linkedListNode;
		while(current != null && current.GetLinkedListNodeNext() != null) {
			current = current.GetLinkedListNodeNext();
		}
		current.SetLinkedListNodeNext(new LinkedListNode(data));
		return linkedListNode;
	}
}
