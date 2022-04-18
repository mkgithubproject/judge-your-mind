import java.util.*;
public class Main
{    public static int[] sortAfterSquaring(int arr[]){
          int start=0;
          int end=arr.length-1;
          int result[] = new int[arr.length];
          for(int k=arr.length-1;k>=0;k--){
              if(Math.abs(arr[start])>arr[end]){
                  result[k]=arr[start]*arr[start];
                  start++;
              }else{
                  result[k]=arr[end]*arr[end];
                  end--;
              }
          }
          return result;
          
}
	public static void main(String[] args) {
		int nums[]={-4,-1,0,3,10};
		int result[]=sortAfterSquaring(nums);
		for(int ele:result){
		    System.out.print(ele+" ");
		}
	}
}
