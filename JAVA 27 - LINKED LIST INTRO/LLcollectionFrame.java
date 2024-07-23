import java.util.*;

public class LLcollectionFrame {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        // ADD FIRST
        list.addFirst("a");
        list.addFirst("is");

        System.out.println(list);// ["a" , "is"]
        // ADD LAST
        list.addLast("this");
        // linkedlist add() by default last
        list.add("List");// last el
        System.out.println(list);// ["this","a","is","List"]

        System.out.println(list.size());// 4

        // TRAVERSING THE LIST Search for " a "
        String value = "a";
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) == value) {
                System.out.println(value + "  found at index  " + i);
            }

            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        // Delete removefirst()
        list.removeFirst();
        System.out.println(list);// [is, a, List]
        list.removeLast();
        System.out.println(list);// [is, a]
        list.remove(1);
        System.out.println(list);// [is]
    }
}
