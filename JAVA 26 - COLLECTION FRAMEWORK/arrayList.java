// APPLICATION OF COLLECTION FRAMEWORK 
//  ARRAYLIST

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        // Integer | Float | String | Boolean
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        // ADD ELEMENTS IN LIST
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list); // [0,1,2,3,4,5]

        // Get ELEMENTS FROM LIST
        int ele = list.get(0);
        System.out.println(ele); // 0

        // Add Element in between list
        list.add(1, 6);

        System.out.println(list);// [0, 6 ,1,2,3,4,5]

        // Set Element
        list.set(0, 7);
        System.out.println(list); // [ 7 , 6 ,1,2,3,4,5,]

        // Delete Element
        list.remove(6);
        System.out.println(list);// [7,6,1,2,3,4] 5 is Removed

        // Size of Arraylist

        int size = list.size();
        System.out.println(size);

        // Loops On ArrayList

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        // Soring In ArrayList
        Collections.sort(list);
        System.out.print(list);

    }
}