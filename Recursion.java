import java.util.ArrayList;
public class recursion{
  public static double sqrt(double num, double epsilon){
    return sqrtH(num, epsilon, num / 2);}

  public static double sqrtH(double num, double epsilon, double guess){
    // avoid divsion by 0
    if(num == 0.0){
      return 0.0;}
      // if negative input
    if(num < 0){
      return num;}
    // desired accuracy
    if(Math.abs(guess * guess - num) / num <= epsilon){
      return guess;}
    // make guess better through Newtonian approximation
    return sqrtH(num, epsilon, (num / guess + guess) / 2.0);}

  public static int fib(int n){
    return fibH(n, 1, 1);
  }
  public static int fibH(int n, int first, int second){
    //if input is 0
    if(n == 0){
      return n;}
      // base case
    if(n <= 2){
      return second;}
    // tail recursive call updating current elements
    return fibH(n - 1, second, first + second);
  }
  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> values = new ArrayList<Integer>();
    // create output
    int[] nums = new int[n + 1];
    // create an array of 1-n
    for(int i = 0; i <= n; i++){
      nums[i] = i;}
    for(int i = 0; i < n * n; i++){
      // for each value in 0 - n^2
      // check if the the value can be made
      // if so add to values
      if (groupSum(0, nums, i)){
        values.add(i);}}
    return values;}

  public static boolean groupSum(int start, int[] nums, int target){
    if(target == 0){
      // if target is reached return true
      return true;}
    if(start >= nums.length){
      // if end of list exhausted all possible sums
      return false;}
      // breaks into two function calls joinded by or operator
      // either you take the current number or you don't
    return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target);}

  public static String printArray(ArrayList<Integer> values){
    String output = "[";
    for(int i = 0; i < values.size(); i++){
      output += (" " + values.get(i) + " ");}
    output += "]";
    return output;}
}
