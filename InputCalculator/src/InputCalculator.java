import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        long avg = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                int num = scanner.nextInt();
                sum += num;
                count ++;
                avg = (long)Math.round((double) sum / count);
            }
            else {
                System.out.println("SUM = "+ sum + " AVG = " + avg);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
