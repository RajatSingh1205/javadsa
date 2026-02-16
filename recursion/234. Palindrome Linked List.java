    ListNode left;

    public boolean isPalindrome(ListNode head) {
        left = head;
        return check(head);

    }
    public boolean check(ListNode right) {
        if (right == null) {
            return true;
        }

        boolean isSubpelin = check(right.next);

        if (!isSubpelin || left.val != right.val) {
            return false;
        }

        left = left.next;
        return true;
    }
