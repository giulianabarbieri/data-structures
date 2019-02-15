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


}
