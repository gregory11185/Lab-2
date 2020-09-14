/**
 * @author Gregory Eganovi
 * @since 09/13/2020
 * @version 1.0
 * 
 * Description: Program that reads a file called "input.txt" that has
 * a list of names and a position number on each
 * line that have been scrambled. The program reads the lines and sorts
 * them in a proper order by position number and
 * prints the sorted list to a file called output.txt.
 * 
 * Uses 2 methods. One called populateArray() which receives 2 arrays with
 * maximum of 100 slots each. Fills the arrays with proper values from
 * the file. First name and last name in one array. 
 * Position number in another. Returns number of items in the array. A second 
 * method called bubbleSort() also receives 2 arrays and the number of 
 * items and uses the position number to sort both arrays in proper 
 * order.  
 */

package sorting;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;

public class Sorting{
    
    public static void main(String[] args) throws Exception {
        final int MAXNUMBER = 100;
        String[] person = new String[MAXNUMBER];
        int[] position = new int[MAXNUMBER];
        int count;
        
        PrintStream ps = new PrintStream("output.txt");
        
        count = populateArray(person, position);
        bubbleSort(person, position, count);
        
        for(int i = 0; i < count; i++){
            ps.printf("%d\t %s\n", position[i], person[i]);
        }
    }   

    // Fills the arrays with values and
    // returns the number of items in the arrays.
    public static int populateArray(String[] person, int[] position) 
            throws Exception{
        Scanner sc = new Scanner(new File("input.txt"));
        int count = 0;
        String temp;
        
        while (sc.hasNext()){
            person[count] = sc.next();
            temp = sc.next();
            person[count] = person[count] + " " + temp;
            position[count] = sc.nextInt();

            count++;
        }
        return count;
    }
    
    // Sorts both of the arrays based on position number.
    public static void bubbleSort(String[] person, int[] position,
            int count){
        int i, j, hold;
        String temp;
        boolean switched = true;
        
        for(i = 0; i < count - 1 && switched; i++){
            switched = false;
            
            for(j = 0; j < count - i - 1; j++){
                if(position[j] > position[j+1]){
                    switched = true;
                    hold = position[j];
                    position[j] = position[j+1];
                    position[j + 1] = hold;
                    temp = person[j];
                    person[j] = person [j+1];
                    person[j+1] = temp;
                }
            } 
        }
    }
}