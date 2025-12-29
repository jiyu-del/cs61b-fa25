public class Stack {
    private Node dummy;
    private int size;

    private static class Node {
        int val;
        Node next;

         Node(int x, Node n) {
            val = x;
            next = n;
        }
    }

    public Stack() {
        dummy = new Node(-1, null);
    }

    /* puts x on top of the stack.
    *
    * */
    void push(int x) {
        dummy.next = new Node(x, dummy.next);
        size++;
    }

    /*
    * removes and returns the top item on the stack.
     */
    int pop() {
        Node node = dummy.next;
        dummy.next = node.next;
        size--;
        return node.val;
    }

    /*
    * returns the number of items on the stack.
     */
    int size() {
        return size;
    }

    /*
    * compute the sum of the numbers on the stack.
     */
    int sum() {
        Node p = dummy;
        int numsum = 0;
        while (p.next != null) {
            numsum += p.next.val;
            p = p.next;
        }
        return numsum;
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);        // s is 1
        s.push(10);       // s is 10 on top of 1
        s.push(100);      // s is 100 on top, 10 in the middle, 1 on the bottom
        System.out.println(s.size());         // returns 3
        s.pop();          // removes and returns 100 (top item)
        // also, s is now 10 on top, 1 on bottom

        System.out.println(s.sum());          // returns 10 + 1 = 11
        System.out.println(s.size());         // returns 2

    }
}
