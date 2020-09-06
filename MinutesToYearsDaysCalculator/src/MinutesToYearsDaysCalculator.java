public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        else {
            long YY = minutes/(60*24*365);
            long ZZ = (minutes%(60*24*365))/(24*60);
            System.out.println(minutes + " min = "+ YY +" y and " + ZZ +" d");
        }
    }
}
