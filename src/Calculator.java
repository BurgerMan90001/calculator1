import java.util.ArrayList;


import java.lang.Math;

public class Calculator {
    // firstNum is dividend
    // secondNum is divisor
    private double firstNum;
    private double secondNum;

    // pi constant
    private final double pi = 3.14159265358979323846;
    private double sum = 0;
    public Calculator(double y, double x) {
        firstNum = y;
        secondNum = x;
    }
    public double getSum() {
        return sum;
    }
    public void setSum(double newSum) {
        sum = newSum;
    }
    public double addition() {
        return firstNum + secondNum;
    }
    public double subtraction() {
        return firstNum - secondNum;
    }
    public double division() {
        return firstNum / secondNum;
    }
    public double multiplication() {
        return firstNum / secondNum;
    }
    public int search_list(ArrayList<Double> list, double item,int start,int end) {
        int mid = (start+end)/2;
        if (start > end) {
            return -1;
        } else if (list.get(mid) == item) {
            return mid;
        }
        if (item > list.get(mid)) {
            return search_list(list,item, mid +1, end);
            //  start = mid + 1;
        } else if (item < list.get(mid)) {
            return search_list(list, item, start, mid-1);
        }

        return -1;
    }
    public double absolute(double number) {
        if (number < 0) {
            return number * -1;
        } else {
            return number;
        }
    }

    // dun
    // case for positive exponent
    public double power(double base, double exponent) {

        if (exponent <= 1) {
            return base;
        }
        return base*power(base,exponent-1);
    }
    // dun
    // case for negative exponent
    public double negative_power(double base, double exponent) {

        if (exponent >= 1) {
            return base;
        }
        return negative_power(base,exponent+1)/base;

    }
    public double square(double base) {

        return Math.sqrt(base);
    }
    public void graphing_calculations() {

    }
    public void significant_figures_rounding(int amountOfDigits) {

    }



}
