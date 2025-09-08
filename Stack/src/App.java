import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {


/*
        Stack<String> stack = new Stack<>();

        stack.push("Stack 1");
         stack.push("Stack 2");
          stack.push("Stack 3");

        
          stack.pop(); 
         System.out.println(stack.peek());

         System.out.println(stack.search("Stack 1")); */
/*
 * 
         Queue<String> queue = new LinkedList<String>();

         queue.offer("Jhon");
         queue.offer("Alv");
         queue.offer("Doe");
 */

        /* System.out.println(queue);
         System.out.println(queue.peek()); */

         //queue.poll();
         //System.out.println(queue);

         //System.out.println(queue.isEmpty());
         //System.out.println(queue.size());
         //System.out.println(queue.contains("Alv"));
            
         
         Queue<String> queue = new PriorityQueue<String>(Collections.reverseOrder());

        queue.offer("B");
         queue.offer("C");
          queue.offer("D");
           queue.offer("A");

     
           while (!queue.isEmpty()) {

                 System.out.println(queue.poll());
           }


    }
}
