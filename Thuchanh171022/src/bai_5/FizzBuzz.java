package bai_5;

public class FizzBuzz {
    public static int soHangChuc;
    public static int soDonVi;
    public static void checkNum(int number){
        soHangChuc = number / 10;
        soDonVi = number % 10;
    }

    public static String docSo(int number){
        checkNum(number);
        String text = "";
        switch(soHangChuc){
            case 1: text = "Một";
                break;
            case 2:text = "Hai";
                break;
            case 3:text = "Ba";
                break;
            case 4:text = "Bốn";
                break;
            case 5:text = "Năm";
                break;
            case 6:text = "Sáu";
                break;
            case 7:text = "Bảy";
                break;
            case 8:text = "Tám";
                break;
            case 9:text = "Chín";
                break;
            case 0:text = "";
                break;
        }
        switch(soDonVi){
            case 1: text += " Một";
                break;
            case 2:text += " Hai";
                break;
            case 3:text += " Ba";
                break;
            case 4:text += " Bốn";
                break;
            case 5:text += " Năm";
                break;
            case 6:text += " Sáu";
                break;
            case 7:text += " Bảy";
                break;
            case 8:text += " Tám";
                break;
            case 9:text += " Chín";
                break;
            case 0:text += " Mươi";
                break;
        }
        return text;
    }
    public static boolean isNumDivisibleThree(int num) {
        return (num % 3 == 0);
    }
    public static boolean isNumDivisibleFive(int num) {
        return (num % 5 == 0);
    }
    public static boolean numContainThree(int num) {
        checkNum(num);
        if(soDonVi == 3 || soHangChuc == 3){
            return true;
        }
        return false;
    }
    public static boolean numContainFive(int num) {
        checkNum(num);
        if(soDonVi == 5 || soHangChuc == 5){
            return true;
        }
        return false;
    }
    public static String check(int num) {
        String display = "";
        if (isNumDivisibleThree(num) || numContainThree(num)) {
            display += " Fizz";
        }
        if (isNumDivisibleFive(num) || numContainFive(num)) {
            display += "Buzz";
        }
        return display + " : " +num+" : "+docSo(num);
    }
}
