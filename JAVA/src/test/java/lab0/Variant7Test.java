package lab0;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lab0.Variant7;


public class Variant7Test {


    @Test(dataProvider = "integerProvider")
    public void integerNumbersTask(int a, int expected){
        assertEquals(new Variant7().integerNumbersTask(a), expected);
    }


    @DataProvider
    public Object[][] integerProvider(){
        return new Object[][]{{15, 6},{12, 3}};
    }


    //////


    @Test(dataProvider = "booleanProvider")
    public void booleanTask(int a, int b,int c, boolean expected){
        assertEquals(new Variant7().booleanTask(a, b, c), expected);
    }


    @DataProvider
    public Object[][] booleanProvider(){
        return new Object[][] {{-12, -3,4, true},{-1, 4,6, true}};
    }


    //////


    @Test(dataProvider = "ifProvider")
    public void ifTask(int a, int b,  int expected){
        assertEquals(new Variant7().ifTask(a, b), expected);
    }


    @DataProvider
    public Object[][] ifProvider(){


        return new Object[][] {{1, -1, 2}};
    }


    @Test(dataProvider = "negativeIfProvider", expectedExceptions = AssertionError.class)
    public void negativeIfTask(int a, int b){
        new Variant7().ifTask(a, b);
    }


    @DataProvider
    public Object[][] negativeIfProvider(){
        return new Object[][] {{1, 1}, {0, 0}};
    }


    ////////


    @Test(dataProvider = "caseProvider")
    public void caseTask(double a,int operation, double expected){
        assertEquals(new Variant7().caseTask(a,operation), expected);
    }


    @DataProvider
    public Object[][] caseProvider(){
        return new Object[][] {{23, Variant7.OPERATION.Kilogram.number, 23},{1, Variant7.OPERATION.Ton.number, 1000}};
    }


    @Test(dataProvider = "negativeCaseProvider", expectedExceptions = AssertionError.class)
    public void negativeCaseTask(double a, int operation){
        new Variant7().caseTask(a, operation);
    }


    @DataProvider
    public Object[][] negativeCaseProvider(){
        return new Object[][] {{11.9,  Variant7.OPERATION.Milligram.number},{2.5,Variant7.OPERATION.Gram.number}};
    }


    /////////


    @Test(dataProvider = "forProvider")
    public void forTest(int a,int b, int expected){
        assertEquals(new Variant7().forTask(a,b), expected);
    }


    @DataProvider
    public Object[][] forProvider(){
        return new Object[][] {{10, 13, 46},{5, 7, 18}};
    }


    @Test(dataProvider = "negativeForProvider")
    public int negativeForTest(int a,int b){
        return  new Variant7().forTask(a,b);
    }


    @DataProvider
    public Object[][] negativeForProvider(){
        return new Object[][]  {{2,10}, {4,6}};
    }


    ////////


    @Test(dataProvider = "whileProvider")
    public void whileTest(int n, int expected){
        assertEquals(new Variant7().whileTask(n), expected);
    }


    @DataProvider
    public Object[][] whileProvider(){
        return new Object[][] {{10, 4}, {12, 4}};
    }


    @Test(dataProvider = "negativeWhileProvider", expectedExceptions = AssertionError.class)
    public void negativeWhileTest(int n){
        new Variant7().whileTask(n);
    }


    @DataProvider
    public Object[][] negativeWhileProvider(){
        return new Object[][] {{11}, {25}};
    }


    ////////////


    @Test(dataProvider = "minMaxProvider")
    public void minMaxTest(int n, int[] numbers, int expected){
        assertEquals(new Variant7().minMaxTask(n,numbers),expected);
    }
    @DataProvider
    public Object[][] minMaxProvider(){

        int[] numbers = new int[]{1, 3, 5, 7, 9};

        return new Object[][] {
                {numbers.length, numbers,5}
        };
    }



    @Test(dataProvider = "negativeMinMaxProvider", expectedExceptions = AssertionError.class)
    public void negativeMinMaxTest(int n,int []numbers){
       new Variant7().minMaxTask(n, numbers);
    }

    @DataProvider
    public Object[][] negativeMinMaxProvider(){

        int[] numbers = new int[]{1,2,5};

        return new Object[][] {
                {numbers.length, numbers}
        };
    }

    /////////////


    @Test(dataProvider = "arrayProvider")
    public void arrayTest(int n,int[]mass,int[] expected){
        assertEquals(new Variant7().arrayTask(n, mass), expected);
    }


    @DataProvider
    public Object[][] arrayProvider(){
        int[] mass = {1, 2, 3, 4, 5};
        int[] reverse = {5, 4, 3, 2, 1};
        return new Object[][] {{mass.length, mass,reverse}};
    }


    @Test(dataProvider = "negativeArrayProvider", expectedExceptions = AssertionError.class)
    public void negativeArrayTest(int n,int[] mass){
        new Variant7().arrayTask(n,mass);
    }

    @DataProvider
    public Object[][] negativeArrayProvider(){
        int[] mass = {1, 2, 3};
        return new Object[][] {{mass.length,mass}};
    }

    ///////////

    @Test(dataProvider = "matrixProvider")
    public void matrixTest(int m, int n,int k,int[][] matrix, int[] expected){
        assertEquals(new Variant7().matrixTask(m, n,k,matrix), expected);
    }

    @DataProvider
    public Object[][] matrixProvider(){

        int[] row = new int[]{5, 7, 1, 11, 13};

        int[][] matrix = new int[][]{
                {4, 12, 7, 7, 9},
                {31, 2, 9, 14, 12},
                {5, 7, 1, 11, 13},
                {5, 9, 11, 2, 4},
                {9, 3, 13, 3, 11}
        };

        return new Object[][] {
                {5, 5,3, matrix, row}
        };
    }


    @Test(dataProvider = "negativeMatrixProvider", expectedExceptions = AssertionError.class)
    public void negativeMatrixTest(int m, int n,int k,int[][] matrix){
        new Variant7().matrixTask(m, n, k, matrix);
    }

    @DataProvider
    public Object[][] negativeMatrixProvider(){

        int[] row = new int[]{5, 7, 1, 11, 13};

        int[][] matrix = new int[][]{
                {4, 12, 7, 7, 9},
                {31, 2, 9, 14, 12},
                {5, 7, 1, 11, 13},
                {5, 9, 11, 2, 4},
                {9, 3, 13, 3, 11}
        };

        return new Object[][] {
                {5, 5,3, matrix}
        };
    }


}