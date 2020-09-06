public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }
        int gcd = 0;
        if (first < second){
            for (int i=first; i >= 2; i --){
                if (first%i == 0 && second%i ==0){
                    gcd = i;
                    break;
                }
            }
        }
        else {
            for (int i=first; i >= 2; i --){
                if (first%i == 0 && second%i ==0){
                    gcd = i;
                    break;
                }
            }
        }
        return gcd;
    }

}
