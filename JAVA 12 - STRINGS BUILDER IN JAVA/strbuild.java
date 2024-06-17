// // REVERSE STRING
public class strbuild {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("MANTHAN");
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);

        }

        System.out.println(sb);

    }
}

// public class strbuild {

// public static void main(String[] args) {

// StringBuilder sb = new StringBuilder("manthan");
// System.out.println(sb);

// // // char at index 0
// // System.out.println(sb.charAt(0)); //M

// // // set char at index
// // sb.setCharAt(0, 'A'); //Aanthan
// // System.out.println(sb);

// // // INSET AT INDEX

// sb.insert(0, 'p'); //panthan
// System.out.println(sb);

// // // change at chae Maanthan
// // sb.insert(2, 'A'); //aa
// // System.out.println(sb);

// // // delete at index
// // // sb.delete(2, 3); //a del
// // // System.out.println(sb );

// // // append
// // // less time and faster
// // StringBuilder hyy = new StringBuilder("H");
// // hyy.append("e");
// // hyy.append("l");
// // hyy.append("l");
// // hyy.append("o");
// // System.out.println(hyy);
// // System.out.println(hyy.length());

// }
// }
