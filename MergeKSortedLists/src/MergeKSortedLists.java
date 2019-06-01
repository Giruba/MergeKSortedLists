import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {
	public static void MergeSortedLists(LinkedList[] linkedLists, int size) {
		LinkedListNode[] sortedLinkedLists = new LinkedListNode[linkedLists.length];
		for(int index = 0; index < linkedLists.length; index++) {
			sortedLinkedLists[index] = linkedLists[index].GetLinkedListHead();
		}
		PriorityQueue<LinkedListNode> priorityQueue = new PriorityQueue<LinkedListNode>(
				new Comparator<LinkedListNode>() {

					@Override
					public int compare(LinkedListNode arg0, LinkedListNode arg1) {
						return arg0.GetLinkedListNodeData() - arg1.GetLinkedListNodeData();
					}
					
				});
		
		for(int index = 0; index < sortedLinkedLists.length; index++) {
			priorityQueue.add(sortedLinkedLists[index]);
		}
		
		int totalSize = sortedLinkedLists.length*size;
		int[] resultantArray = new int[totalSize];
		
		for(int index = 0; index < totalSize; index++) {
			if(priorityQueue.size() != 0) {
				LinkedListNode item = priorityQueue.remove();
				resultantArray[index] = item.GetLinkedListNodeData();
				if(item.GetLinkedListNodeNext() != null) {
					priorityQueue.add(item.GetLinkedListNodeNext());
				}
			}
		}
		PrintResultantArray(resultantArray);
	}
	
	public static void PrintResultantArray(int[] resultantArray) {
		for(int index = 0; index < resultantArray.length; index++) {
			System.out.print(resultantArray[index]+" ");
		}
	}
}
