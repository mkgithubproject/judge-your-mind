// has onle function assume this is the problem of online coding practice
public int countDuplicates(){
    ListNode current=front;
    return countDuplicates(current);

}
private int countDuplicates(ListNode root){
    // base case 
    if(root==null || root.next==null){
       return 0;
    }
    int countByRecursion=countDuplicates(root.next);// recursive call
    // small calculation ,recursive hypothesis
    if(root.data==root.next.data){
           return countByRecursion+1;
      }else{
    
         return countByRecursion;
    }
    
    

}
