
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        if( arr == null || arr.length == 0) {
            return null;
        }
        String longString = arr[0];
        int maxLength = arr[0].length();

        for (int i = 1; i < arr.length; i++) {
            if( arr[i].length() > maxLength) {
                longString = arr[i];
                maxLength = arr[i].length();
            }
        }
        return longString;
    }
}
