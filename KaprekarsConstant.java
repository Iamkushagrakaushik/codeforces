public class KaprekarsConstant {

    public static void main(String[] args) {
        int number = 9990;  
        int result = findKaprekarConstant(number);
        
      
        if (result != -1) {
            System.out.println("Kaprekar's constant result: " + result);
        }
    }
    
   
    public static int findKaprekarConstant(int num) {
        if (num < 1000 || num > 9999 || isSameDigits(num)) {
            System.out.println("Please enter a valid four-digit number where not all digits are the same.");
            return -1;
        }

        int count = 0;
        while (num != 6174) {
            num = kaprekarStep(num);
            count++;
            if (num == 6174) {
                System.out.println("Kaprekar's constant reached after " + count + " iterations.");
                break;
            }
        }
        return num;
    }

    public static int kaprekarStep(int num) {
        int descending = 0, ascending = 0;
        
       
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = num % 10; 
            num /= 10;              
        }

       
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (digits[i] < digits[j]) {
                    
                    int temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }
            }
        }
       
        for (int i = 0; i < 4; i++) {
            descending = descending * 10 + digits[i];
        }

        
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (digits[i] > digits[j]) {
               
                    int temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }
            }
        }

       
        for (int i = 0; i < 4; i++) {
            ascending = ascending * 10 + digits[i];
        }

    
        return descending - ascending;
    }

    // Method to check if all digits in the number are the same
    public static boolean isSameDigits(int num) {
        int digit = num % 10; // Get the last digit
        num /= 10;            // Remove the last digit
        while (num > 0) {
            if (num % 10 != digit) {
                return false;  // If a digit is different, return false
            }
            num /= 10;         // Remove the last digit
        }
        return true;          // All digits are the same
    }
}