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
    
  public static void main(String[] args){
    System.out.println(sqrt(-1, 0.001));
  }
}
