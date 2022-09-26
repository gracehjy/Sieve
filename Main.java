import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Find prime numbers up to what value? ");
    int max = in.nextInt();
    int[] nums = new int[max];

    //Create array lists to store primes and non-primes
    ArrayList <Integer> primes = new ArrayList <Integer>();
    ArrayList <Integer> nonPrimes = new ArrayList <Integer>();

    //Create values for array from one up to the user's inputted value
    for(int i = 0; i < nums.length; i++){
      nums[i] = i+1;
    }

    //Checks for prime or non-prime and then adds value to the correct array list
    for(int j = 0; j < nums.length; j++){
      if(nums[j] == 2 || nums[j] == 3 || nums[j] == 5 || nums[j] == 7){
        primes.add(nums[j]);
      }
      else if(nums[j] == 1 || nums[j] % 2 == 0 || nums[j] % 3 == 0 || nums[j] % 5 == 0 || nums[j] % 7 == 0){
        nonPrimes.add(nums[j]);
      }
      else{
        primes.add(nums[j]);
      }
    }

    System.out.println("Here are the prime values from 1 up to "+max+":");

    //Prints out prime values
    for(int k = 0; k < primes.size(); k++){
      System.out.println(primes.get(k));
    }
    
  }
}