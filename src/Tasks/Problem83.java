package Tasks;

public class Problem83 {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode result = head;
        ListNode element = null;

        while (head.next != null) {
            element = head.next;
            if (head.val == element.val) {
                head = element.next;
            } else {
                head = element;
            }
        }

        return result;
    }
}
