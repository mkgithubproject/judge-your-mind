/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
    // first we will print uper part of diamond
    int totalRows=6;// uper part has 6 rows
    int row=1;
    while(row<=totalRows){
        //print left spaces
        int spaces=totalRows-row;
        while(spaces>=1){
            cout<<" ";
            spaces--;
        }
        // print left part digits
        int eachRowHasDigits=row;
        int startDigitNumber=1;
        while(eachRowHasDigits>=1){
            cout<<startDigitNumber;
            startDigitNumber++;
            eachRowHasDigits--;
        }
        // print right part digits;
        int eachRowHasDigitsAtRight=row-1;
        startDigitNumber=row-1;
        while(eachRowHasDigitsAtRight>=1){
            cout<<startDigitNumber;
            startDigitNumber--;
            eachRowHasDigitsAtRight--;
        }
        // change line after each row printing
        cout<<endl;
        row++;
    }
    
        // Nowwe will print lower part of diamond
        totalRows=5;
        row=1;
    
        while(row<=totalRows){
            // print spaces
            int spaces=row;
            while(spaces>=1){
                cout<<" ";
                spaces--;
            }
            // print digit left side
            int totalDigitCounts=totalRows-(row)+1;
            int startDigitNumber=1;
            while(totalDigitCounts>=1){
                cout<<startDigitNumber;
                startDigitNumber++;
                totalDigitCounts--;
            }
            // print right side digits
            int totalDigitCountsRightside=totalRows-row;
             startDigitNumber=totalRows-row;
            while(totalDigitCountsRightside>=1){
                cout<<startDigitNumber;
                startDigitNumber--;
                totalDigitCountsRightside--;
            }
            // change line
            cout<<endl;
            row++;
            
        }
        
    return 0;
}
