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
  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> values = new ArrayList<Integer>();
    return makeAllSumsH(n, 0, values, n);
  }
  public static ArrayList<Integer> makeAllSumsH(int n, int partialSum, ArrayList<Integer> values, int num){
    if(n < 0){
      return values;}
    values.add(partialSum);
    return makeAllSumsH(n - 1, (num * (num + 1)) / 2 - n, values, num);
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
