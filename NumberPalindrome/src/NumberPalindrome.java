public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        if (number == 0){
            return false;
        }
        int cpyNumber = number;
        int reversedNumber = 0;
        while(cpyNumber != 0){
            reversedNumber = (reversedNumber*10) + cpyNumber % 10;
            cpyNumber /= 10;
        }
        return (number == reversedNumber);
    }
}
