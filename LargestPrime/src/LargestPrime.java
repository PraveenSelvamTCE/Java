public class LargestPrime {
    public static int getLargestPrime(int number){
        if (number <= 1){
            return -1;
        }
        boolean flag = false;
        for (int j=number; j >= 2 ; j--){
            if (number%j == 0){
                for (int i = 2; i <= Math.sqrt(j); i++){
                    if (j % i == 0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag){
                    return j;
                }
                flag = false;
            }
        }
        return -1;

    }
}
