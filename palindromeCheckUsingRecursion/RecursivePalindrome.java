public class RecursivePalindrome {
    public static void main(String[] args) {
        //String z="Madam, I'm Adam";
        String z="maxcvcvxcvxfgsam";
        z=z.replaceAll("\\s","");
        z=z.replaceAll("[^a-zA-z]","");
        z=z.toLowerCase();
        System.out.println("Is "+z+" a Palindrom? "+isPalindrome(z));
    }

    public static boolean isPalindrome(String x) {
        return (isPalindromeWorker(x,0,x.length()-1));
    }

    private static boolean isPalindromeWorker(String s, int left, int right) {
        // base case
        if(left==right){
            return true;
        }
        // small calculation
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        // recursive call
        return isPalindromeWorker(s,left+1,right-1);
    }
}
