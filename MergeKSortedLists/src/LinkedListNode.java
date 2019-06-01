
public class LinkedListNode {
	private int data;
	private LinkedListNode nextNode;
	
	public LinkedListNode(int data) {
		this.data = data;
	}
	
	public void SetLinkedListNodeData(int data) {
		this.data = data;
	}
	
	public void SetLinkedListNodeNext(LinkedListNode nextNode) {
		this.nextNode = nextNode;
	}
	
	public int GetLinkedListNodeData() {
		return this.data;
	}
	
	public LinkedListNode GetLinkedListNodeNext() {
		return this.nextNode;
	}
}
