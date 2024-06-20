import java.util.Scanner;

public class bit {

    public static void main(String[] args) {

        // GET BIT
        System.out.println("GET BIT :");

        int n1 = 5; // 0101
        int pos1 = 1;
        int bitMask1 = 1 << pos1;

        if ((bitMask1 & n1) == 0) {
            System.out.println("bit was zero ");
        } else {
            System.out.println("bit was one ");
        }

        // SET BIT
        System.out.println("SET BIT :");
        int n2 = 5; // 0101
        int pos2 = 1;
        int bitMask2 = 1 << pos2;

        int newnum = bitMask2 | n2;
        System.out.println(newnum);

        if ((bitMask2 | n2) == 0) {
            System.out.println("bit was zero ");
        } else {
            System.out.println("bit was one ");
        }

        // CLEAR BIT
        System.out.println("CLEAR BIT :");

        int n3 = 5; // 0101
        int pos3 = 2;
        int bitMask3 = 1 << pos3;

        int not = ~(bitMask3);
        int newnumber = not & n3;
        System.out.println(newnumber);

        if ((bitMask3 | n3) == 0) {
            System.out.println("bit was zero ");
        } else {
            System.out.println("bit was one ");
        }

        // UPDATE BIT
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        int n4 = 5; // for n = 5 0101 decimal = 7

        int pos4 = 1;
        // update bit to 1 else update bit to 0
        int bitmask = 1 << pos4;
        if (oper == 1) {
            int newNum = bitmask | n4;
            System.out.println(newNum);
        } else {
            int newbit = ~(bitmask);
            int newNum = newbit & n4;
            System.out.println(newNum);
        }

    }
}