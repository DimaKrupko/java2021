package lab0;

import java.util.List;
import java.util.Objects;

public class Variant7 {


    /**
     *
     * @param a is integer
     *
     * @return
     */

    public int integerNumbersTask(int a) {
        int frst = a / 10;
        int sec = a % 10;
        int suma = frst + sec;
        int dob = frst * sec;
        System.out.println("Sum = " + suma);
        System.out.println("Product= " + dob);
        return suma;
    }

    /**
     *
     * @param b is more than a
     * @param c is more than b
     * @return true
     */
    public boolean booleanTask(int a, int b,int c) {
        return (b > a && b < c);
    }


//    public static class SignedNumber{
//        private int positive;
//        private int negative;
//
//        public void setPositive(int positive){
//            this.positive = positive;
//        }
//
//        public int getPositive(){
//            return positive;
//        }
//
//        public void setNegative(int negative){
//            this.negative = negative;
//        }
//
//        public int getNegative() {
//            return negative;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            SignedNumber that = (SignedNumber) o;
//            return positive == that.positive &&
//                    negative == that.negative;
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(positive, negative);
//        }
//    }

    /**
     *
     * @param a is integer number
     * @param b is integer number
     * @return transformed number
     */
    public int ifTask(int a, int b) {
        if(a<b)return 1;
        else return 2;
    }


    enum OPERATION
    {

        Kilogram(1),
        Milligram(2),
        Gram(3),
        Ton(4),
        Quintal(5);

        public int number;

        OPERATION(int number){
            this.number = number;
        }

    }


    /**
     *
     * @param a is integer
     * @param operation is Operation
     * @return day of week day represented number1
     */
    public double caseTask(double a,int operation) {
        assert a!=0 && operation>0 && operation<=5 : "'a' cannot be 0. Range of operations [1, 5]";

        switch (operation){
            case 1: return a;
            case 2: return a/1000000;
            case 3: return a/100;
            case 4: return a*1000;
            case 5: return a*100;
            default:
                System.out.println("There is not operation");
                return 0;
        }

    }


    /**
     * @param b
     * @param a <b
     * @return suma int number from a to b
     */
    public int forTask(int a,int b) {
        int suma=0;

        for(; a<b+1; a++){
            suma +=a;
        }

        return suma;
    }


    /**
     *
     * @param n is int number
     * @return k;
     */
    public int whileTask(int n) {

        assert n>0: "'n' need to be > 0";

        int k = 1;
        while (k*k <= n) {
            ++k;
        }
        return k;
    }


    /**
     *
     * @param n is int number
     * @param numbers is massive number
     * @return pos maxnum;
     */
    public  int minMaxTask(int n,int[] numbers) {
        assert n > 2 : "N has to be more than 2";
        int i, minnum=0, maxnum=0, min, max;
        min = max = numbers[0];
        for (i = 0; i <n; i++) {

            if ((i == 1) || (numbers[i] <= min)) {
                min = numbers[i];
                minnum = i+1;
            }
            if ((i == 1) || (numbers[i] > max)) {
                max = numbers[i];
                maxnum = i+1;
            }

        }
        return maxnum;
    }


    /**
     *
     * @param n is integer number
     * @param mass is massive
     * @return reverse massive;
     */
    public int[] arrayTask(int n,int[] mass){

        assert n>2: "N has to be more than 2";
        int t=0;
        int []reverse = new int [n];
        for (int i=n-1; i>=0; --i){
            reverse[t]=mass[i];
            t++;
        }



        return reverse;
    }

    /**
     *
     * @param m is number of rows
     * @param n is number of columns
     * @param k is integer number
     * @param matrix is the numbers matrix
     * @return k's row;
     */
    public int[] matrixTask(int m, int n,int k, int[][] matrix){

        assert m>0 && n>0 : "M and N have to be more than 0";
        int[] row = new int[m];

        for (int i = 0; i < n; ++i){
            row[i] = matrix[k-1][i];
        }

        return row;
    }





}