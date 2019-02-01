import java.util.ArrayList;
public class Recursion{
  public static double sqrt(double num, double epsilon){
    return sqrtH(num, epsilon, num / 2);}

  public static double sqrtH(double num, double epsilon, double guess){
    if(num == 0.0){
      return 0.0;}
    if(num < 0){
      return num;}
    if(Math.abs(guess * guess - num) / num <= epsilon){
      return guess;}
    return sqrtH(num, epsilon, (num / guess + guess) / 2.0);}

  public static int fib(int n){
    return fibH(n, 1, 1);
  }
  public static int fibH(int n, int first, int second){
    if(n == 0){
      return n;}
    if(n <= 2){
      return second;
    }
    return fibH(n - 1, second, first + second);
  }
  public static String makeAllSums(int n){
    ArrayList<Integer> values = new ArrayList<Integer>();
    return makeAllSumsH(n, 0, n, (int) Math.pow(2, n), true);
  }
  public static String makeAllSumsH(int n, int partialSum, int num,int counter, boolean insert){
    if(n == 0){
      n = num;
      counter --;
      insert = ! insert;
      return "" + partialSum;
    }
    if(counter == 0){
      return "all sums";
    }
    else {
    return makeAllSumsH(n - 1, partialSum + n, num, counter, insert) +
    makeAllSumsH(n - 2, partialSum + n - 1, num, counter, insert);}
  }

  public static String printArray(ArrayList<Integer> values){
    String output = "[";
    for(int i = 0; i < values.size(); i++){
      output += (" " + values.get(i) + " ");}
    output += "]";
    return output;}

  public static void main(String[] args){
    System.out.println(makeAllSums(3));
  }
}
