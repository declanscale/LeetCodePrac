import java.lang.*;
import java.util.Scanner;

public class reverseList{
	public static ListNode reverseList(ListNode head){
		ListNode prev = null;
		ListNode curr = head;

		while(curr != null){
			ListNode nextTemp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextTemp;
		}

		return prev;
	}

	public static void main(String[] args) {
		
	}

}








