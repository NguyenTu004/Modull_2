package BAI_3;

public class Day {
    public static int day(int day,int month) {
        if  (day == 31){
            return 1;
        }else if(day==30){
            switch(month) {
                case 4:
                case 6:
                case 9:
                case 11:
                return 1;
            }
        }else if  ( day == 28 && month == 2){
            return 1;
        }
        return (day+1);
    }
}
