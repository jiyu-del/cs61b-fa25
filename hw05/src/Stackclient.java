public class Stackclient {

    public static Stack flipped(Stack s) {
        Stack res = new Stack();
        int size = s.size();
        for (int i = 0; i < size; i++) {
            res.push(s.pop());
        }
        return res;
        /*
        违反原则，直接访问内部结构，而非使用提供的接口方法。
        Node pre = null;
        Node cur = s.next;

        while (cur != null) {
            Node temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }

        s.next = cur;
        return s;
         */
    }
}
