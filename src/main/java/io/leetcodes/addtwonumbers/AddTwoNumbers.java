package io.leetcodes.addtwonumbers;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        var headNode = new ListNode(0);
        var current = headNode;
        var carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            var l1Value = (l1 != null) ? l1.val : 0;
            var l2Value = (l2 != null) ? l2.val : 0;

            int sum = l1Value + l2Value + carry;
            carry = sum / 10;
            int digito = sum % 10;

            current.next = new ListNode(digito);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

        }

        return headNode.next;

    }

}
