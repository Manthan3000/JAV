import java.util.LinkedList;
import java.util.*;

public class LL {

    public static void main(String[] args) {
        LinkedList<Integer> LIST = new LinkedList<>();
        LIST.add(1);
        LIST.add(2);
        LIST.add(3);
        LIST.add(4);
        LIST.add(5);
        System.out.println(LIST);
        Collections.reverse(LIST);

    }
}