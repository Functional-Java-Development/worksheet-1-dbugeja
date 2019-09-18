import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Ex2Q2 {

    public static void main(String[] args) {
        String myTempInput = "";

        String a[] = new String[]{"a", "an", "the", "so", "it", "do", "did", "for", "by", "of", "to"};
        LinkedList<String> myLinkedLS = new LinkedList<String>();

        List mylist = Arrays.asList(a);

        System.out.println("The list is:" + mylist);

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a word");
        myTempInput = in.nextLine();
        System.out.println(myTempInput.length());

        while (myTempInput.length() != 0) {
            myLinkedLS.add(myTempInput);
            System.out.println("Enter a word");
            myTempInput = in.nextLine();
        }
        //myLinkedLS.forEach(System.out::println);
        myLinkedLS.stream().filter(line -> mylist.contains(line))
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
