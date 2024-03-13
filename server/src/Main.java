import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) + 1;

        String month_name = "";

        if(month == 1){
            System.out.println("1月");
        }else if(month == 2){
            System.out.println("2月");
        }else if(month == 3){
            System.out.println("3月");
        }else if(month == 4){
            System.out.println("4月");
        }else if(month == 5){
            System.out.println("5月");
        }else if(month == 6){
            System.out.println("6月");
        }else if(month == 7){
            System.out.println("7月");
        }else if(month == 8){
            System.out.println("8月");
        }else if(month == 9){
            System.out.println("9月");
        }else if(month == 10){
            System.out.println("10月");
        }else if(month == 11){
            System.out.println("11月");
        }else if(month == 12){
            System.out.println("12月");
        }

    }
}
