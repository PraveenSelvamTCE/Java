public class FactorPrinter {
    public static void printFactors(int numbers){
        if (numbers < 1){
            System.out.println("Invalid Value");
        }
        else {
            int i = 1;
            while (i <= numbers){
                if (numbers % i == 0){
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
