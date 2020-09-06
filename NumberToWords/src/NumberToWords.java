public class NumberToWords {
    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }
        else  if(number ==0){
            System.out.println("Zero");
        }
        else {
            int reversedNumber = reverse(number);
            int originalCount = getDigitCount(number);
            int reversedCount = getDigitCount(reversedNumber);
            while (reversedNumber > 0){
                int lastDigit = reversedNumber % 10;
                switch (lastDigit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversedNumber /= 10;

            }
            if (originalCount != reversedCount) {
                int diff = originalCount - reversedCount;
                for (int i = 0; i < diff; i++) {
                    System.out.println("Zero");
                }
            }
        }
    }
    public static int reverse(int number){
        int reversedNumber = 0;
        int toPositive = number;
        int flag =0;
        if(toPositive < 0){
            toPositive = (-1 )*toPositive;
            flag = 1;
        }
        while (toPositive > 0){
            reversedNumber = (reversedNumber*10) + toPositive%10;
            toPositive /= 10;
        }
        if (flag == 1){
            reversedNumber = (-1) * reversedNumber;
        }
        return reversedNumber;
    }
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        int count = 0;
        if (number == 0){
            return 1;
        }
        while (number > 0){
            number /= 10;
            count++;
        }
        return count;
    }
}
