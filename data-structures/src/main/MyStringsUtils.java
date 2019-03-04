package main;

public class MyStringsUtils {

    public static boolean hasAllUniqueCharacters(String w) { //asumo que son ascii characters
        if (w.length() > 256) {
            return false;
        }
        char[] caracteres = w.toCharArray();
        for (int i = 0; i < caracteres.length - 1; i++) {
            for (int j = i + 1; j < caracteres.length; j++) {
                if (caracteres[i] == caracteres[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isAnagram(String first, String second) {

        if (first == null && second != null) {
            return false;
        } else if (first != null && second == null) {
            return false;
        } else if (first == null && second == null) {
            return true;
        } else if (first.length() != second.length()) {
            return false;
        }

        char[] firstCharArray = first.toCharArray();
        char[] secondCharArray = second.toCharArray();
        for (int i = 0; i < firstCharArray.length; i++) {
            if (amountOfRepetitions(firstCharArray[i], firstCharArray) != amountOfRepetitions(firstCharArray[i], secondCharArray)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagramFast(String first, String second) {
        if (first == null && second != null) {
            return false;
        } else if (first != null && second == null) {
            return false;
        } else if (first == null && second == null) {
            return true;
        } else if (first.length() != second.length()) {
            return false;
        }

        char[] firstCharArray = first.toCharArray();
        char[] secondCharArray = second.toCharArray();
        int[] buckets = new int[256];
        for (int i = 0; i < firstCharArray.length; i++) {
            buckets[firstCharArray[i]]++;
            buckets[secondCharArray[i]]--;
        }
        for (int j = 0; j < 256; j++) {
            if (buckets[j] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int amountOfRepetitions(char i, char[] charArray) {
        int count = 0;
        for (int j = 0; j < charArray.length; j++) {
            if (charArray[j] == i) {
                count++;
            }
        }
        return count;
    }

    public static String reverse(String world) {
        if (world == null) {
            return null;
        }
        if (world.length() == 0) {
            return "";
        }
        char[] worldArray = world.toCharArray();

        for (int i = 0; i < worldArray.length / 2; i++) {
            char aux = worldArray[i];
            worldArray[i] = worldArray[worldArray.length - i - 1];
            worldArray[worldArray.length - i - 1] = aux;
        }

        return new String(worldArray);
    }

    public static String replace(String string) { // Space complexity is O(n^2) ouch!! Time is O(n)
        if (string == null) {
            return null;
        }
        String resultString = "";
        char[] inputString = string.toCharArray();
        for (int i = 0; i < inputString.length; i++) {
            if (Character.toString(inputString[i]).equals(" ")) {
                resultString = resultString + "%20"; // copy the string
            } else {
                resultString = resultString + inputString[i]; // copy the string
            }
        }
        return resultString;
    }

    public static String replaceWell(String string) { //space complexity is O(n) time is O(n)
        if (string == null) {
            return null;
        }
        StringBuffer outputString = new StringBuffer();
        char[] inputString = string.toCharArray(); //O(n)
        for (int i = 0; i < inputString.length; i++) { //O(n)
            if (Character.toString(inputString[i]).equals(" ")) {
                outputString.append("%20");
            } else {
                outputString.append(inputString[i]); //just append not copy
            }
        }
        return String.valueOf(outputString); //O(n)
    }

    public static void rotate(int[][] matrix) {
        //lets suppose that for now we only want to rotate the first ring
        int length = matrix.length;
        for(int j=0 ; j < (length /2) ; j++) {

            for (int i = 0 + j; i < length - 1 - j; i++) {

                int aux1 = matrix[i][length - 1 - j];
                matrix[i][length - 1 - j] = matrix[j][i];

                int aux2 = matrix[length - 1 - j][length - 1 - i ];
                matrix[length - 1 - j][length - 1 - i] = aux1;

                int aux3 = matrix[length - 1 - i][j];
                matrix[length - 1 - i ][j] = aux2;

                matrix[j][i] = aux3;
            }
        }

    }


}
