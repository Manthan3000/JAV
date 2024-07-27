// Java program for reversing a linked list using in-built collections class
import java.util.*;
  
public class LL
{
    public static void main(String[] args)
    {
        // Declaring linkedlist without any initial size
        LinkedList<Integer> ll = new LinkedList<Integer>();
  
        // Appending elements at the end of the list
        ll.add(new Integer(1));
        ll.add(new Integer(2));
        ll.add(new Integer(3));
        ll.add(new Integer(4));
        ll.add(new Integer(5));
        System.out.println("The elements of the linked list before reversing: " + ll);
        // Collections.reverse method to reverse the list
        Collections.reverse(ll);
        System.out.println("The elements of the linked list after reversing: " + ll);
    }
}

// Java program to reverse a linked list
import java.util.*;

public class LL 
{
	public static void main(String[] args)
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add(new String("Physics"));
		ll.add(new String("Maths"));
		ll.add(new String("Java"));
		ll.add(new String("English"));
		ll.add(new String("Chemistry"));
		System.out.println("The elements of the linked list before reversing: " + ll);
		// Calling user defined function for reversing
		ll = reverseLinkedList(ll);
		System.out.println("The elements of the linked list after reversing: " + ll);
	}
	//Takes a linkedlist as a parameter and returns a reversed linked list
	public static LinkedList<String> reverseLinkedList(LinkedList<String> ll)
	{
		for (int i = 0; i < ll.size() / 2; i++) 
		{
			String temp = ll.get(i);
			ll.set(i, ll.get(ll.size() - i - 1));
			ll.set(ll.size() - i - 1, temp);
		}
		// Return the reversed arraylist
		return ll;
	}
}
