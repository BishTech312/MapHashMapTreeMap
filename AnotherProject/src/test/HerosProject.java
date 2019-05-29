package test;

import main.HerosProjectMain;

import org.junit.Assert;
import org.junit.Test;

public class HerosProject {

    /**
     * Static knowledge check
     */

    @Test
    public void getCounted() {
        Assert.assertEquals("Expected string wasn't returned", "T1e1c1h1t1o1r1i1a1l1", HerosProjectMain.letterOccurrence(name1));
    }

    @Test
    public void getCounted1() {
        Assert.assertEquals("Expected string wasn't returned", "112131", HerosProjectMain.letterOccurrence(name2));
    }

    @Test
    public void getCounted2() {
        Assert.assertEquals("Expected string wasn't returned", "a1b1c1d1e1f1g1h1i1j1k1l1m1n1o1p1q1r1s1t1u1v1w1x2y1A1B1C1D1E1F1G1H1I1J1K1L1M1N1O1P1Q1R1S1T1U1V1W1X1Y1Z1",
            HerosProjectMain.letterOccurrence(name5));
    }

    @Test
    public void getCounted3() {
        Assert.assertEquals("Expected string wasn't returned", "A16", HerosProjectMain.letterOccurrence(name4));
    }

    @Test
    public void getCounted4() {
        Assert.assertEquals("Expected string wasn't returned", "", HerosProjectMain.letterOccurrence(name3));
    }

    @Test
    public void fibonaciTest() {
        Assert.assertEquals("Expected int wasn't returned", fibNums5, HerosProjectMain.fibonaci(15));
    }

    @Test
    public void fibonaciTest1() {
        Assert.assertEquals("Expected int wasn't returned", fibNums, HerosProjectMain.fibonaci(8));
    }

    @Test
    public void fibonaciTest2() {
        Assert.assertEquals("Expected int wasn't returned", fibNums1, HerosProjectMain.fibonaci(10));
    }

    @Test
    public void getUniqueLetterTest() {

        Assert.assertEquals(unique, HerosProjectMain.getUnique(name4));
    }

    @Test
    public void getUniqueLetterTest1() {

        Assert.assertEquals(name1, HerosProjectMain.getUnique(name1));
    }

    @Test
    public void getUniqueLetterTest2() {

        Assert.assertEquals("wabcdefghijklpqrstuv", HerosProjectMain.getUnique(name6));
    }

    @Test
    public void getFactorialTest() {
        Assert.assertEquals(24, HerosProjectMain.factorial(4));
    }

    @Test
    public void getFactorialTest1() {
        Assert.assertEquals(2004189184, HerosProjectMain.factorial(16));
    }

    @Test
    public void getFactorialTest2() {
        Assert.assertEquals(1, HerosProjectMain.factorial(0));
    }

    public static void main(String[] args) {
        int n = 1;
        int res = 1, i;
        for (i = 2; i <= n; i++) {
            res *= i;
        }
        System.out.println(res);
    }

    private static String name1    = "Techtorial";
    private static String name2    = "123";
    private static String name3    = "";
    private static String name4    = "AAAAAAAAAAAAAAAA";
    private static String name5    = "abcdefghijklmnopqrstuvwxyxABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String name6    = "waaaaabcdefghijkbblpaaqrstuvwacccdde";

    private String        fibNums  = "0,1,1,2,3,5,8,13";
    private String        fibNums1 = "0,1,1,2,3,5,8,13,21,34";
    private String        fibNums5 = "0,1,1,2,3,5,8,13,21,3455,89,144,233,377";
    private String        unique   = "A";
}