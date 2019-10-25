package u5a1_sortlinkedlist;
import java.util.Scanner;
import java.util.*;
public class U5A1_SortLinkedList {

    public static void main(String[] args) {
        //make a likedlist to store what will become the course codes
        LinkedList<String> courseList1 = new LinkedList<>();
        LinkedList<String> courseList2 = new LinkedList<>();
        LinkedList<String> courseList3 = new LinkedList<>();
        
        //User inputs course codes
        System.out.println("Please enter 3 collections of course codes one collection per line:");
        Scanner course = new Scanner(System.in);
        
        //input one line at a time for each set
        String set1 = course.nextLine();
        String set2 = course.nextLine();
        String set3 = course.nextLine();
        
        //split so codes can be read by the application
        String[] arrayList1 = set1.split(" ", -2);
        String[] arrayList2 = set2.split(" ", -2);
        String[] arrayList3 = set3.split(" ", -2);
        
        /* Enhanced for loop so the application goes through 
           each line and places the code in the proper list; afterwards
           it prints the size of the list and the codes in sorted order
        */
        for (String i: arrayList1)
            courseList1.add(i);
            Collections.sort(courseList1);
            System.out.print("SIZE: " + courseList1.size() + " SORTED: ");
            for (int i = 0; i < courseList1.size(); i++) {
            System.out.print(courseList1.get(i) + " ");
        }
        /* Enhanced for loop so the application goes through 
           each line and places the code in the proper list; afterwards
           it prints the size of the list and the codes in sorted order 
        */
        for (String i: arrayList2)
            courseList2.add(i);
            System.out.println();
            Collections.sort(courseList2);
            System.out.print("SIZE: " + courseList2.size() + " SORTED: ");
            for (int i = 0; i < courseList2.size(); i++) {
            System.out.print(courseList2.get(i) + " ");
        }
        /* Enhanced for loop so the application goes through 
           each line and places the code in the proper list; afterwards
           it prints the size of the list and the codes in sorted order 
        */
        for (String i: arrayList3)
            courseList3.add(i);
            System.out.println();
            Collections.sort(courseList3);
            System.out.print("SIZE: " + courseList3.size() + " SORTED: ");
            for (int i = 0; i < courseList3.size(); i++) {
            System.out.print(courseList3.get(i) + " ");
            System.out.println();
        }      
    }
    
}
