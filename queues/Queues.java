import java.util.LinkedList;
import java.util.Queue;

public class Queues{

public static void main(String[] args){

    // queue = FIFO data structure, first in first out
    // a collection designed for holding elements prior to processing
    // linear data structure

    // .add = enqueue, offer()
    // .remove = dequeue, poll()

    // where are queues useful?
    // 1. keyboard buffer (letters should appear on the screen in the order they're pressed)
    // 2. printer queue (print jobs should be completed in order)
    // 3. used in LinkedLists, PriorityQueues, Breadth-first search

    Queue<String> queue = new LinkedList<String>();

    queue.offer("Karen");
    queue.offer("Chad");
    queue.offer("Steve");
    queue.offer("Harold");

    System.out.println(queue.peek());
    //queue.poll();
    //queue.poll();
    queue.remove("Karen");

    System.out.println(queue);
    }
}
