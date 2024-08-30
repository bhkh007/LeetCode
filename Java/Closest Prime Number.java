 class ClosestPrime {

    // Helper function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to find the closest prime(s)
    public static void findClosestPrime(int number) {
        if (number <= 1) {
            System.out.println("The closest prime number is 2.");
            return;
        }

        int lowerPrime = number;
        int upperPrime = number;

        // Find the closest lower prime
        while (lowerPrime >= 2 && !isPrime(lowerPrime)) {
            lowerPrime--;
        }

        // Find the closest upper prime
        while (!isPrime(upperPrime)) {
            upperPrime++;
        }

        // Determine the closest prime(s) to print
        if (number - lowerPrime == upperPrime - number) {
            // Equidistant case
            System.out.println("The closest prime numbers are: " + lowerPrime + " and " + upperPrime);
        } else if (number - lowerPrime < upperPrime - number) {
            // Lower prime is closer
            System.out.println("The closest prime number is: " + lowerPrime);
        } else {
            // Upper prime is closer
            System.out.println("The closest prime number is: " + upperPrime);
        }
    }

    public static void main(String[] args) {
        int inputNumber = 10;
        findClosestPrime(inputNumber); // Example input
    }
}



/* 
 A-I : Write a function that takes input as an integer number and prints the closest prime integer to that
number. The closest prime can be greater or smaller than the passed input integer. If there are
equi-distant prime-numbers, print both.
 */