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

    @Test
    public void replaceGeneral() {
        String generalString = "A general phrase";
        String outputExpected = "A%20general%20phrase";
        assertEquals(MyStringsUtils.replace(generalString), outputExpected);
        assertEquals(MyStringsUtils.replaceWell(generalString), outputExpected);
    }

    @Test
    public void replaceNull() {
        assertEquals(MyStringsUtils.replace(null),null);
        assertEquals(MyStringsUtils.replaceWell(null),null);
    }

    @Test
    public void replaceEmptyString() {
        assertEquals(MyStringsUtils.replace(""),"");
        assertEquals(MyStringsUtils.replaceWell(""),"");
    }

    @Test
    public void replaceStringWithManySpaces() {
        String inputString = "  so   many spaces";
        String outputExpected = "%20%20so%20%20%20many%20spaces";
        assertEquals(MyStringsUtils.replace(inputString), outputExpected);
        assertEquals(MyStringsUtils.replaceWell(inputString), outputExpected);
    }

    @Test
    public void rotateMatrix1() {
        int[][] inputmatrix = new int[1][1];
        inputmatrix[0][0] = 1;
        MyStringsUtils.rotate(inputmatrix);
        assertEquals(inputmatrix[0][0], 1);
    }

    @Test
    public void rotateMatrix2() {
        int[][] inputmatrix = new int[2][2];
        inputmatrix[0][0] = 1;
        inputmatrix[0][1] = 2;
        inputmatrix[1][0] = 4;
        inputmatrix[1][1] = 3;
        MyStringsUtils.rotate(inputmatrix);
        assertEquals(inputmatrix[0][0], 4);
        assertEquals(inputmatrix[0][1], 1);
        assertEquals(inputmatrix[1][0], 3);
        assertEquals(inputmatrix[1][1], 2);
    }

    @Test
    public void rotateMatrix3() {
        int[][] inputmatrix = new int[3][3];
        inputmatrix[0][0] = 1;
        inputmatrix[0][1] = 2;
        inputmatrix[0][2] = 3;

        inputmatrix[1][0] = 4;
        inputmatrix[1][1] = 5;
        inputmatrix[1][2] = 6;

        inputmatrix[2][0] = 7;
        inputmatrix[2][1] = 8;
        inputmatrix[2][2] = 9;

        MyStringsUtils.rotate(inputmatrix);
        assertEquals(inputmatrix[0][0], 7);
        assertEquals(inputmatrix[0][1], 4);
        assertEquals(inputmatrix[0][2], 1);
        assertEquals(inputmatrix[1][0], 8);
        assertEquals(inputmatrix[1][1], 5);
        assertEquals(inputmatrix[1][2], 2);
        assertEquals(inputmatrix[2][0], 9);
        assertEquals(inputmatrix[2][1], 6);
        assertEquals(inputmatrix[2][2], 3);
    }

    @Test
    public void rotateMatrix4() {
        int[][] inputmatrix = new int[4][4];
        inputmatrix[0][0] = 1;
        inputmatrix[0][1] = 2;
        inputmatrix[0][2] = 3;
        inputmatrix[0][3] = 4;
        inputmatrix[1][0] = 5;
        inputmatrix[1][1] = 6;
        inputmatrix[1][2] = 7;
        inputmatrix[1][3] = 8;
        inputmatrix[2][0] = 9;
        inputmatrix[2][1] = 10;
        inputmatrix[2][2] = 11;
        inputmatrix[2][3] = 12;
        inputmatrix[3][0] = 13;
        inputmatrix[3][1] = 14;
        inputmatrix[3][2] = 15;
        inputmatrix[3][3] = 16;
        MyStringsUtils.rotate(inputmatrix);
        assertEquals(inputmatrix[0][0],13);
        assertEquals(inputmatrix[0][1],9);
        assertEquals(inputmatrix[0][2],5);
        assertEquals(inputmatrix[0][3],1);
        assertEquals(inputmatrix[1][0],14);
        assertEquals(inputmatrix[1][1],10);
        assertEquals(inputmatrix[1][2],6);
        assertEquals(inputmatrix[1][3],2);
        assertEquals(inputmatrix[2][0],15);
        assertEquals(inputmatrix[2][1],11);
        assertEquals(inputmatrix[2][2],7);
        assertEquals(inputmatrix[2][3],3);
        assertEquals(inputmatrix[3][0],16);
        assertEquals(inputmatrix[3][1],12);
        assertEquals(inputmatrix[3][2],8);
        assertEquals(inputmatrix[3][3],4);
    }

    @Test
    public void rotateMatrix5() {
        int[][] inputmatrix = new int[5][5];
        inputmatrix[0][0] = 1;
        inputmatrix[0][1] = 2;
        inputmatrix[0][2] = 3;
        inputmatrix[0][3] = 4;
        inputmatrix[0][4] = 5;

        inputmatrix[1][0] = 6;
        inputmatrix[1][1] = 7;
        inputmatrix[1][2] = 8;
        inputmatrix[1][3] = 9;
        inputmatrix[1][4] = 10;

        inputmatrix[2][0] = 11;
        inputmatrix[2][1] = 12;
        inputmatrix[2][2] = 13;
        inputmatrix[2][3] = 14;
        inputmatrix[2][4] = 15;

        inputmatrix[3][0] = 16;
        inputmatrix[3][1] = 17;
        inputmatrix[3][2] = 18;
        inputmatrix[3][3] = 19;
        inputmatrix[3][4] = 20;

        inputmatrix[4][0] = 21;
        inputmatrix[4][1] = 22;
        inputmatrix[4][2] = 23;
        inputmatrix[4][3] = 24;
        inputmatrix[4][4] = 25;

        MyStringsUtils.rotate(inputmatrix);
        assertEquals(inputmatrix[0][0],21);
        assertEquals(inputmatrix[0][1],16);
        assertEquals(inputmatrix[0][2],11);
        assertEquals(inputmatrix[0][3],6);
        assertEquals(inputmatrix[0][4],1);
        assertEquals(inputmatrix[1][0],22);
        assertEquals(inputmatrix[1][1],17);
        assertEquals(inputmatrix[1][2],12);
        assertEquals(inputmatrix[1][3],7);
        assertEquals(inputmatrix[1][4],2);
        assertEquals(inputmatrix[2][0],23);
        assertEquals(inputmatrix[2][1],18);
        assertEquals(inputmatrix[2][2],13);
        assertEquals(inputmatrix[2][3],8);
        assertEquals(inputmatrix[2][4],3);
        assertEquals(inputmatrix[3][0],24);
        assertEquals(inputmatrix[3][1],19);
        assertEquals(inputmatrix[3][2],14);
        assertEquals(inputmatrix[3][3],9);
        assertEquals(inputmatrix[3][4],4);
        assertEquals(inputmatrix[4][0],25);
        assertEquals(inputmatrix[4][1],20);
        assertEquals(inputmatrix[4][2],15);
        assertEquals(inputmatrix[4][3],10);
        assertEquals(inputmatrix[4][4],5);
    }



}
