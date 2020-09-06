public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){
        if (year <=0 || year > 9999){
            return false;
        }
        else{
            if (year%100 == 0){
                if (year%400 == 0){
                    return true;
                }
                else {
                    return false;
                }
            }
            else if(year%4 == 0){
                return true;
            }
            else
                return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        int mon = 0;
        if (year <=0  || year >9999){
            return -1;
        }
        switch (month){
            case 1:
                mon = 31;
                break;
            case 2:
                if (isLeapYear(year)){
                    mon = 29;
                }
                else {
                    mon = 28;
                }
                break;
            case 3:
                mon = 31;
                break;
            case 4:
                mon = 30;
                break;
            case 5:
                mon = 31;
                break;
            case 6:
                mon = 30;
                break;
            case 7:
                mon = 31;
                break;
            case 8:
                mon = 31;
                break;
            case 9:
                mon = 30;
                break;
            case 10:
                mon = 31;
                break;
            case 11:
                mon = 30;
                break;
            case 12:
                mon = 31;
                break;
            default:
                mon = -1;
                break;
        }
        return mon;
    }
}
