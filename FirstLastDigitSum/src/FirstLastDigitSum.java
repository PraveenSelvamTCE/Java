public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        if (number < 0){
            return -1;
        }
        else {
            sum = number % 10;
            while(number >= 10){
                number /= 10;
            }
            return sum += number;
        }

    }
}
