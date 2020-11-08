package Problem2;

public class SortList {
    private static final int SENTRY = Integer.MAX_VALUE;
    // DO NOT ADD ANY NEW MEMBER VARIABLE AND MEMBER FUNCTION

    // DO NOT CHANGE ANYTHING IN THIS FUNCTION
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode mid = findMidAndBreak(head);
        return mergeLists(sortList(head), sortList(mid));
    }

    public static ListNode findMidAndBreak(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode secondHalf = head;
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            secondHalf = slowPointer;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        secondHalf.next = null;
        return slowPointer;
    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        ListNode sortedList = null;
        if (list1.val <= list2.val) {
            sortedList = list1;
            sortedList.next = mergeLists(list1.next, list2);
        } else {
            sortedList = list2;
            sortedList.next = mergeLists(list1, list2.next);
        }
        return sortedList;
    }
}
