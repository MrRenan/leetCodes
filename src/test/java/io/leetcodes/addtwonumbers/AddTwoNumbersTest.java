package io.leetcodes.addtwonumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    @DisplayName("Given input: l1 = [2,4,3], l2 = [5,6,4], should return [7,0,8]")
    void shouldReturnSevenAndZeroAndEightWithSuccess() {
        // ARRANGE
        var l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        var l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        var expected = new ListNode(7, new ListNode(0, new ListNode(8)));

        // ACT
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        // ASSERT
        assertLinkedListEquals(expected, result);
    }

    @Test
    @DisplayName("Given input: l1 = [0], l2 = [0], should return [0]")
    void shouldReturnZeroWithSuccess() {
        // ARRANGE
        var l1 = new ListNode(0);
        var l2 = new ListNode(0);
        var expected = new ListNode(0);

        // ACT
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        // ASSERT
        assertLinkedListEquals(expected, result);
    }

    @Test
    @DisplayName("Given input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9], should return [8,9,9,9,0,0,0,1]")
    void shouldReturn89990001WithSuccess() {
        // ARRANGE
        var l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9)))))));
        var l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        var expected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));

        // ACT
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        // ASSERT
        assertLinkedListEquals(expected, result);
    }

    private void assertLinkedListEquals(
            ListNode expected,
            ListNode actual) {

        while (expected != null && actual != null) {
            Assertions.assertEquals(expected.val, actual.val);

            expected = expected.next;
            actual = actual.next;
        }

        Assertions.assertNull(expected);
        Assertions.assertNull(actual);
    }

}