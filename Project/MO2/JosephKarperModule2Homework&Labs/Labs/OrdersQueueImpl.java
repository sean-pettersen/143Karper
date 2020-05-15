package m02_student_code.student.tacotruck.queue;

import java.util.ArrayDeque;
import java.util.Deque;

import m02_student_code.student.tacotruck.TacoImpl;

/**
 * Reference the following when working on the queue implementation:
 * https://www.baeldung.com/java-array-deque#2-arraydeque-as-a-queue
 *
 * Note that the orders are a queue, so its FIFO approach.
 */
public class OrdersQueueImpl {

    /**
     * This is the queue that will hold and manage the TacoImpl
     */
    private Deque<TacoImpl> tacoQueue = new ArrayDeque<>();

    /**
     *
     * @param tacoOrder
     */
    public void addOrder(TacoImpl tacoOrder) {
    	tacoQueue.add(tacoOrder);
    }

    /**
     * True if more tacos remain, else false.
     * @return
     */
    public boolean hasNext() {
      return !tacoQueue.isEmpty();
    }

    /**
     * Note that this method will remove the first (in terms of FIFO)taco from the tacoQueue and return it.
     *
     * Once returned it should be permenantly removed.
     *
     * Outcome
     * ========
     * It will remove and return the FIFO record. This is tested in the test file.
     *
     * @return The taco.
     */
    public TacoImpl closeNextOrder() {
        return tacoQueue.pop();
    }

    /**
     * How many order remain in the tacoQueue
     *
     * @return How many orders are in the queue
     */
    public int howManyOrders() {
        return tacoQueue.size();
    }
}
