package Collection;

import java.util.ArrayDeque;

public class Arraydeque {
    public static void main(String[] args) {
        ArrayDeque adq = new ArrayDeque();
        adq.add(200);
        adq.add(300);
        adq.add(400);
        System.out.println(adq);

        adq.offer(200);
        adq.offerLast("s");
        adq.offerFirst(40);
        System.out.println(adq);
    }
}
