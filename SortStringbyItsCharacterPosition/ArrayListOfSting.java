import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfSting {
    public ArrayList<String> addStrings() {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> addStrings = new ArrayList<String>();
        System.out.println("Add strings, if the string contains the letter P (ignore case) the word will be added to the array list. " +
                "\nIf not, the string will be ignored. Type STOP to exit the program and print the array list");
        while (true){
            String userInput=sc.nextLine();
            if(userInput.equalsIgnoreCase("stop")){
                // if userInput is stop break the loop
                break;
            }
            // elseif check given inpt has 'p' then add it into arraylist
            else if(userInput.contains("p") || userInput.contains("P")){
                addStrings.add(userInput);
            }
            // else display given input doesn't contains 'p'
            else {
                System.out.println("The string does not contain a P (ignore case) please enter another string");
            }
            }
        System.out.println("The arraylist is: ");
        for (String str:addStrings) {
            System.out.print(str+" ");
        }
        return addStrings; //Return the ArrayList as well as printing it.
    }
    public ArrayList<String> sortP(ArrayList<String> arrList) {
        // using bubble sort , sort the string by its p character position/
        for(int i=0;i<arrList.size()-1;i++){
            for(int j=0;j< arrList.size()-i-1;j++){
                if(arrList.get(j).toLowerCase().indexOf('p')>arrList.get(j+1).toLowerCase().indexOf('p')){
                     // at index j string, p character position > at index j+1 string, p character swap them
                    String temp=arrList.get(j);
                    arrList.set(j, arrList.get(j+1));
                    arrList.set(j+1,temp);
                }
            }
        }
        System.out.println("\nAfter sorting arrayList is...");
        for(String str:arrList){
            System.out.print(str+" ");
        }
        return arrList;
    }
    public static void main(String[] args) {
        ArrayListOfSting obj=new ArrayListOfSting();
       ArrayList<String>list= obj.addStrings();
       ArrayList<String>sortedList=obj.sortP(list);

    }
}
