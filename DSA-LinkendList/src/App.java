import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {



        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");

       // linkedList.poll();
      // linkedList.add(0,"E");

      System.out.println(linkedList.peekFirst());
      System.out.println(linkedList.peekLast());
      linkedList.addFirst("0");
      linkedList.addLast("5");
     System.out.println(linkedList);

     String removeFirst = linkedList.removeFirst();
     String removeLast = linkedList.removeLast();

     System.out.println("First remove: " + removeFirst );
     System.out.println("Last remove: " + removeLast);
    }
}
