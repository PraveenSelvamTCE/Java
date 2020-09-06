public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        else{
            int evenSum = 0;
            int evenCheck = 0;
            evenCheck = number % 10;
            while (number > 0){
                if (evenCheck % 2 == 0){
                    evenSum += evenCheck;
                }
                number /= 10;
                evenCheck = number % 10;
            }
            return evenSum;
        }
    }
}
