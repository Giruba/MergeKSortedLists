import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Merge K Sorted Linked Lists");
		System.out.println("---------------------------");
		
		try{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the individual length of the lists");
			int totalElementsInSingleList = scanner.nextInt();
			System.out.println("Enter the number of lists");
			int numberOfLists = scanner.nextInt();
			LinkedList[] allLists = new LinkedList[numberOfLists];
			for(int listIndex = 0; listIndex <numberOfLists; listIndex++) {
				System.out.println("List "+(listIndex));
				allLists[listIndex] = new LinkedList(null);
				for(int elementIndex = 0; elementIndex < totalElementsInSingleList; elementIndex++) {
					System.out.println("Enter the element at index "+(elementIndex));
					allLists[listIndex].SetLinkedListHead(
							allLists[listIndex].InsertAtEnd(allLists[listIndex].GetLinkedListHead(), scanner.nextInt()));
				}
			}
			MergeKSortedLists.MergeSortedLists(allLists, totalElementsInSingleList);
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getMessage());
		}
	}
}
