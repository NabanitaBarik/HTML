package day_7;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber {
	public static void main(String[] args) {

		Random random = new Random();

		int i = random.nextInt();
		double j = random.nextDouble();
		String k = random.toString();
		
		System.out.println("Random Integer Number :"+i);
		System.out.println("Random Double Number :"+j);
		System.out.println("Random String Generate :"+k);
		
        // Generate random integers in range 0 to 999 
        int rand_int1 = ThreadLocalRandom.current().nextInt(); 
        int rand_int2 = ThreadLocalRandom.current().nextInt(); 
  
        // Print random integers 
        System.out.println("Random Integers: " + rand_int1); 
        System.out.println("Random Integers: " + rand_int2); 
	}

}
