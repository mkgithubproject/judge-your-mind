/*
Write a method deleteBack that deletes the last value (the value at the back of the list) and returns the deleted value. If the list is empty, your method should throw a NoSuchElementException.

Assume that you are adding this method to the LinkedIntList class as defined below:

public class LinkedIntList {
    private ListNode front;   // null for an empty list
    ...
}*/



public int deleteBack(){
    int arr[]=new int[1];
    arr[0]=-1;
//    if(front==null){
//        throw new NoSuchElementException();
//    }
//    if(front.next==null){
//        int data=front.data;
//        front=null;
//        return data;
//    }
    ListNode current=front;
    ListNode deletedNode=deleteBack(current,arr);
    if(deletedNode==null && arr[0]==-1){
        front=null;
    throw new NoSuchElementException();
    }else{
        front=deletedNode;
        return arr[0];
    }

}

private ListNode deleteBack(ListNode front,int[]arr){
    // base case 1
    if(front==null){
       return null;
    }
    // base case 2
    // list has only one node
    if(front.next==null){
        arr[0]=front.data;
        front=null;
        return null;
    }
    // list is not empty , list has more than 1 nodes
    front.next= deleteBack(front.next,arr);// recursive call, assume recurson will delete last node and It will return newlist
    return front;
}
