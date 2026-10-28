public class NumbersLoops{
    public NumbersLoops(){
      int index = 0;
      while(index<11){
        System.out.println(index);
        index ++;
      }
      System.out.println("What is index now: " + index);

      int index2 = 0;
      for(;index2<11; index2 ++){
        System.out.println(index2);
      }
      System.out.println("what is index now: " + index2);
    }
  
    public int digitSum(int num){
      int sum = 0;
      for(int x = 0; x <= num; x++){
        sum = sum + x++;
      }
      return sum;
    }
  
    public int reverseNum(int num){
      //123 mod 10 =====> 3
      //123/10 ====> 12
      int newNum = 1;
      while(num != 0){
        //use mod
        //use integer division
        //mathy mment to build newNum
        newNum = ... + (num % 10);
        num /= 10;
      }
      return 0;
    }
  
    public int palindromeCount(int num){
      return 0;
    }
  
  
  }