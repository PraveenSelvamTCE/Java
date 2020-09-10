public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if(bigCount<0 || smallCount<0 || goal<0){
            return false;
        }else if(smallCount>=goal){
            return true;
        }

        int b = bigCount*5;
        int a = b + smallCount;


        if(a >= goal){
            if(b<=goal) {
                return true;
            }else{
                return (smallCount>=(goal%5));
            }
        }else{
            return false;
        }

    }
}