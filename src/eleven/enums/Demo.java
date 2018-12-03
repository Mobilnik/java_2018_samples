package eleven.enums;

public class Demo {


    public static void main(String[] args) {
        //Проблема
        Date dateWithConst1 = new Date(Date.MonthConstants.FEBRUARY, 2018);
        Date dateWithConst2 = new Date(100, 2018);
        System.out.println(dateWithConst1.toString());
        System.out.println(dateWithConst2.toString());


        //Окей
        Date dateWithEnum = new Date(Month.DECEMBER, 2018);

        Month month = dateWithEnum.getMonth();
        System.out.println(month.ordinal());
        System.out.println(month.toString());

        System.out.println(dateWithEnum.toString());

        //А что будет, если не передать значение enum'а?

    }
}
