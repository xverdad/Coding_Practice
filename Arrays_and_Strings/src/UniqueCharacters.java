/* By: Xavier Verdad
/  Last Modified: Oct. 8, 2018
*/


/* Problem 1.1:
/  Implement an algorithm to determine if a string has all unique characters.
/  What if you cannot use additional data structures?
*/

public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(isUniqueWithDS("Hello") + "");
        System.out.println(isUniqueWoutDS("Hello") + "");
    }

    /* This function scans through the input string to
    /  see if all characters in the string are unique. This
    /  function USES ADDITIONAL DATA STRUCTURES.
    / Input:   A string called 'input'
    / Output:  A boolean where if true then the input
    /          string contains all unique, and false if it doesn't.
    */
    public static boolean isUniqueWithDS(String input) {

        return true;
    }


    /* This function scans through the input string to
    /  see if all characters in the string are unique. This
    /  function DOESN'T USE ADDITIONAL DATA STRUCTURES.
    / Input:   A string called 'input'
    / Output:  A boolean where if true then the input
    /          string contains all unique, and false if it doesn't.
    */
    public static boolean isUniqueWoutDS(String input) {

        return true;
    }
}
