package Problem3;

import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        ListNode head = list;
        if (head == null) {
            return;
        }
        printListInReverse(head.next, print);
        print.println(head.val);
    }
}
