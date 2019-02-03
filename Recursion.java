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
    int[] nums = new int[n + 1];
    for(int i = 0; i <= n; i++){
      nums[i] = i;}
    for(int i = 0; i < n * n; i++){
      if (groupSum(0, nums, i)){
        values.add(i);}}
    return values;}

  public static boolean groupSum(int start, int[] nums, int target){
    if(target == 0){
      return true;}
    if(start >= nums.length){
      return false;}
    return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target);}

  public static String printArray(ArrayList<Integer> values){
    String output = "[";
    for(int i = 0; i < values.size(); i++){
      output += (" " + values.get(i) + " ");}
    output += "]";
    return output;}

  public static void main(String[] args){
    System.out.println(makeAllSums(6));
  }
}
