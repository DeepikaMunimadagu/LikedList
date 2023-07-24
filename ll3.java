public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse second half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL;
        Node nextR;
        //alt merge
        while(left != null && right != null){
            nextL = left.next;
            nextR = right.next;
            nextR = right.next;
            right.next = null;

            left = nextL;
            right = nextR;
        }

    }
