import java.util.ArrayList;
import java.io.*;
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
  static ArrayList<String> words = new ArrayList<String>();
  static ArrayList<Integer> values = new ArrayList<Integer>();
  public static ArrayList<Integer> makeAllSums(int n){
    int[] nums = new int[n + 1];
    for(int i = 1; i < n + 1; i++){
      nums[i] = i;}
    makeAllSumsH(nums, 0, 0);
    ArrayList<Integer> output = new ArrayList<Integer>();
    for(int i = 0; i < values.size() / 2; i++){
      output.add(values.get(i));
    }
    return output;}
  public static void makeAllSumsH(int[] nums, int index, int partialSum){
    if(index == nums.length){
      values.add(partialSum);
      return;}
      makeAllSumsH(nums, index + 1, partialSum + nums[index]);
      makeAllSumsH(nums, index + 1, partialSum);
  }
}
