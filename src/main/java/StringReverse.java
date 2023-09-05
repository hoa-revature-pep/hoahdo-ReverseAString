
public class StringReverse {
    /**
     * Task: return the reverse of a string.
     * There are multiple good ways to solve this problem.
     *
     * You could do some math to grab characters from the end of the String using a typical for loop.
     * For instance, you could use build a String by writing a for loop that decrements rather than increments, grabbing
     * characters from the String starting from the end.
     * You could also look into the methods provided by StringBuilder.
     *
     * @param str a String.
     * @return the reverse of str.
     */
    public String reverse(String str){
        /**
         * StringBuilder strBeforeReverse = new StringBuilder(str);
         * StringBuilder strAfterReverse =  strBeforeReverse.reverse();
         * return strAfterReverse.toString();
         */

        // convert String to char array
        char[] strArr = str.toCharArray();

        // create interator variables
        int a = 0;
        int z = strArr.length-1;
        
        while (a < z) {
            // create two pointers
            char leftPnter = strArr[a];
            char rightPnter = strArr[z];

            // assign variable to hold left pointer value
            char temp = leftPnter;
            
            strArr[a] = rightPnter;
            strArr[z] = temp;

            a++; // increment left side
            z--; // decrement right side
        }

        String reversedStr = new String(strArr);
        return reversedStr;
    }
}
