package com.demotry;
// Java program to find first
// non-repeating character
public class Main {
    static final int NO_OF_CHARS = 256;
    static char count[] = new char[NO_OF_CHARS];
    // calculate count of characters in the passed string
    static void getCharCountArray(String Str){
        for (int i=-0; i<Str.length(); i++){
            count[Str.charAt(i)]++;
        }
    }
    /* The method returns index of first non-repeating
       character in a string. If all characters are repeating
       then returns -1 */
    static int firstNonRepeating(String Str){
        getCharCountArray(Str);
        int index =-1,i;
        for (i=0; i<Str.length(); i++){
            if (count[Str.charAt(i)]==1){
                index = i;
                break;
            }
        }
        return index;
    }
    // Driver Method
    public static void main(String[] args) {
	// write your code here
        String Str = "a green apple";
        int index = firstNonRepeating(Str);
        System.out.println(
                index == -1
                        ? "Either all characters are repeating or string "
                        + "is empty"
                        : "First non-repeating character is "
                        + Str.charAt(index)
        );
    }
}
