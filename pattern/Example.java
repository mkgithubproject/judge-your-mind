public class Example{

    public static void main(String[] args) {
        int rows=8;
        int cols=rows-1;
        for(int row=0;row<rows;row++){
            // print left part
            int spaces=rows-row-1;
            // print spaces in a row
            while(spaces>0){
                System.out.print("  ");
                spaces--;
            }
            // print digit/number in a row
            int numberPrint=row+1;
            int numberStartFrom=0;
            while(numberPrint>0){
                System.out.print((int)Math.pow(2,numberStartFrom)+" ");
                numberStartFrom++;
                numberPrint--;
            }
            // print right part
            numberPrint=row;
            numberStartFrom=row-1;
            //print digits in a row
            while(numberPrint>0){
                System.out.print((int)Math.pow(2,numberStartFrom)+" ");
                numberStartFrom--;
                numberPrint--;
            }
            // print spaces in a row
            spaces=rows-row-1;
            while(spaces>0){
                System.out.print("  ");
                spaces--;
            }
            System.out.println();
        }
    }
}
