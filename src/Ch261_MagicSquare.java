/** DESCRIPTION
 * A 3x3 magic square is a 3x3 grid of the numbers 1-9 such that 
 * each row, column, and major diagonal adds up to 15. Here's an example:
 *          8 1 6
 *          3 5 7
 *          4 9 2
 * The major diagonals in this example are 8 + 5 + 2 and 6 + 5 + 4.
 * Write a function that, given a grid containing the numbers 1-9,
 * determines whether it's a magic square. 
 */

/** EXAMPLE INPUTS/OUTPUTS
 * [8, 1, 6, 3, 5, 7, 4, 9, 2] => true
 * [2, 7, 6, 9, 5, 1, 4, 3, 8] => true
 * [3, 5, 7, 8, 1, 6, 4, 9, 2] => false
 * [8, 1, 6, 7, 5, 3, 4, 9, 2] => false
 */

/** SOLUTION */

import java.util.Arrays;

public class Ch261_MagicSquare implements Solution {
    
    public static void main(String[] args) {
        System.out.println(new Ch261_MagicSquare().run());
    }

    @Override
    public String run() {
        int[] array1 = {8, 1, 6, 3, 5, 7, 4, 9, 2};
        int[] array2 = {2, 7, 6, 9, 5, 1, 4, 3, 8};
        int[] array3 = {3, 5, 7, 8, 1, 6, 4, 9, 2};
        int[] array4 = {8, 1, 6, 7, 5, 3, 4, 9, 2};
        
        System.out.println(Arrays.toString(array1) + " => " + checkSquare(array1));
        System.out.println(Arrays.toString(array2) + " => " + checkSquare(array2));
        System.out.println(Arrays.toString(array3) + " => " + checkSquare(array3));
        System.out.println(Arrays.toString(array4) + " => " + checkSquare(array4));
        System.out.println();
        
        System.out.println(Arrays.toString(array1) + " => " + _checkSquare(array1));
        System.out.println(Arrays.toString(array2) + " => " + _checkSquare(array2));
        System.out.println(Arrays.toString(array3) + " => " + _checkSquare(array3));
        System.out.println(Arrays.toString(array4) + " => " + _checkSquare(array4));
        return "";
    }

    public boolean checkSquare(int[] array){
        return checkRow(array) == true && checkCol(array) == true && checkDiag(array) == true;
    }
    
    /** Check each and all row - using magic numbers
     * @param array an array to be checked
     * @return true if each and all rows add up to 15
     */
    public boolean checkRow(int[] array){
        return array[0] + array[1] + array[2] == 15 && 
               array[3] + array[4] + array[5] == 15 &&
               array[6] + array[7] + array[8] == 15;
    }
    
    /** Check each and all column - using magic numbers
     * @param array an array to be checked
     * @return true if each and all column add up to 15
     */
    public boolean checkCol(int[] array){
        return array[0] + array[3] + array[6] == 15 && 
               array[1] + array[4] + array[7] == 15 &&
               array[2] + array[5] + array[8] == 15;
    }
    
    /** Check each and all diagonal - using magic numbers
     * @param array an array to be checked
     * @return true if each and all diagonal add up to 15
     */
    public boolean checkDiag(int[] array){
        return array[0] + array[4] + array[8] == 15 && 
               array[2] + array[4] + array[6] == 15;
    }
    
    public boolean _checkSquare(int[] array){
        return _checkRow(array) == true && _checkCol(array) == true && _checkDiag(array) == true;
    }
    
    
    public boolean _checkRow(int[] array){
        int length = (int) Math.sqrt(array.length);
        int row1 = 0;
        int row2 = 0;
        int row3 = 0;
        int firstIndex = 0;
        int secondIndex = length;
        int thirdIndex = array.length - length;
        
        for(int i = 0; i<length; i++){
            row1 += array[firstIndex];
            row2 += array[secondIndex];
            row3 += array[thirdIndex];
            
            firstIndex++;
            secondIndex++;
            thirdIndex++;
        }
        
        return row1 == 15 && row2 == 15 && row3 == 15;
    }
    
    
    public boolean _checkCol(int[] array){
        int length = (int) Math.sqrt(array.length);
        int col1 = 0;
        int col2 = 0;
        int col3 = 0;
        int firstIndex = 0;
        int secondIndex = 1;
        int thirdIndex = 2;
        
        for(int i = 0; i < length; i++){
            col1 += array[firstIndex];
            col2 += array[secondIndex];
            col3 += array[thirdIndex];
            
            firstIndex += length;
            secondIndex += length;
            thirdIndex += length;
        }
        
        return col1 == 15 && col2 == 15 && col3 == 15;
    }
    
    public boolean _checkDiag(int[] array){
        int length = (int) Math.sqrt(array.length);
        int topToBottom = 0;
        int bottomToTop = 0;
        int topIndex = 0;
        int bottomIndex = array.length - length;
        
        for(int i = 0; i < length; i++){
            topToBottom += array[topIndex];
            bottomToTop += array[bottomIndex];
            
            topIndex += (length+1);
            bottomIndex -= (length-1);
        }
        
        return topToBottom == 15 && bottomToTop == 15;
    }
    
}
