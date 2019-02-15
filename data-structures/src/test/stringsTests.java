package test;

import main.MyStringsUtils;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class stringsTests {

    @Test
    public void hasAllUnique() {
        String uniques = "asdfghjklqwertyuiopzxcvbnm";
        assertEquals(MyStringsUtils.hasAllUniqueCharacters(uniques),true);
    }

    @Test
    public void hasAllUniqueFalse() {
        String nouniques = "asdfghjklfgh";
        assertEquals(MyStringsUtils.hasAllUniqueCharacters(nouniques),false);
    }

    @Test
    public void hasAllUniqueEmpty() {
        String empty = "";
        assertEquals(MyStringsUtils.hasAllUniqueCharacters(empty),true);
    }

    @Test
    public void isAnagramTrue() {
        String example = "tree";
        String examplesAnagram = "etre";
        assertEquals(MyStringsUtils.isAnagram(example, examplesAnagram), true);
    }

    @Test
    public void isAnagramNull() {
        String nullString = null;
        String nullString2 = null;
        assertEquals(MyStringsUtils.isAnagram(nullString, nullString2), true);
    }

    @Test
    public void isAnagramNullAndNotNull() {
        String nullString = null;
        String stringNotNull = "asd";
        assertEquals(MyStringsUtils.isAnagram(nullString, stringNotNull), false);
    }

    @Test
    public void isAnagramFalse() {
        String someString = "asdf";
        String otherString = "asdk";
        assertEquals(MyStringsUtils.isAnagram(someString, otherString), false);
    }

    @Test
    public void isAnagramFastTrue() {
        String someString = "asdfghjkl";
        String otherString = "lkjhgfdsa";
        assertEquals(MyStringsUtils.isAnagramFast(someString, otherString), true);
    }

    @Test
    public void isAnagramFastTrue2() {
        String someString = "aaaaaaaaaadddddhhhhh";
        String otherString = "ddddhhhhhaaaaaaaaaad";
        assertEquals(MyStringsUtils.isAnagramFast(someString, otherString), true);
    }

    @Test
    public void reverseNull() {
        String nullString = null;
        assertEquals(MyStringsUtils.reverse(nullString), null);
    }

    @Test
    public void reverseEmpty() {
        String empty = "";
        assertEquals(MyStringsUtils.reverse(empty), "");
    }

    @Test
    public void reverseOdd() {
        String phrase = "chimichurri";
        String reversePhrase = "irruhcimihc";
        assertEquals(MyStringsUtils.reverse(phrase), reversePhrase);
    }

    @Test
    public void reversePair() {
        String phrase = "meli";
        String reversePhrase = "ilem";
        assertEquals(MyStringsUtils.reverse(phrase), reversePhrase);
    }

}
