/*Write a method hasTwoConsecutive that returns whether or not a list of integers has two adjacent numbers that are consecutive integers (true if such a pair exists and false otherwise). For example, if a variable list stores the following sequence of values, then the call list.hasTwoConsecutive() should return true because the list contains the adjacent numbers (7, 8) which are a pair of consecutive numbers:

[1, 18, 2, 7, 8, 39, 18, 40]
If the list had stored the following sequence of values, then the method should return false:

[1, 18, 17, 2, 7, 39, 18, 40, 8]
This sequence contains some pairs of numbers that could represent consecutive integers (e.g., 1 and 2, 7 and 8, 39 and 40), but those pairs of numbers are not adjacent in the sequence. The list also has a pair of adjacent numbers (18, 17) that are not in the right order to be considered consecutive. You may not make any assumptions about how many elements are in the list.

Assume that you are adding this method to the LinkedIntList class as defined below:

public class LinkedIntList {
    private ListNode front;   // null for an empty list
    ...
}*/
public boolean hasTwoConsecutive(){
    ListNode current=front;
    return hasTwoConsecutive(current);

}
private boolean hasTwoConsecutive(ListNode root){
    // base case 
    if(root==null || root.next==null){
       return false;
    }
    // recursive hypothesis
    if(root.next.data==root.data+1){
            return true;
     }
    // recursive call
    return hasTwoConsecutive(root.next);
}
