public class Main
{       public static int maxConsecutiveOnes(int arr[]){
    int max_consecutive_ones=0;
    int countOnes=0;
    for (int binary:arr){
        // if array element is 1 increment countOnes and continue
        if(binary==1){
            countOnes++;
            continue;
        }
        // if array element is zero check current countOnes to previous max_consecutive_ones
        // max_consecutive_ones is lesser than current countOnes update max_consecutive_ones by countOnes
        if(countOnes>max_consecutive_ones){
            max_consecutive_ones=countOnes;
        }
        // again initialize countOnes by zero
        countOnes=0;
    }
    /* it may be the chance of 1 present at the last index of array then loop will get terminate and internal condition will not check then we need to check again here */
    if(countOnes>max_consecutive_ones){
        max_consecutive_ones=countOnes;
        countOnes=0;
    }
    return max_consecutive_ones;

}
    public static void main(String[] args) {
       //int nums[]={1,1,0,1,1,1};
        int nums[]={1,0,1,1,0,1};
        System.out.println(maxConsecutiveOnes(nums));
    }
}
