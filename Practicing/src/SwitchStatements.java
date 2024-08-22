public class SwitchStatements {
    int month = 6;
    String monthName;

    public void findMonth() {
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "Feb";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5: case 6 : case 7:
                System.out.println("Was 5, 6 or 7");
                System.out.println("it was actually:" + month);
            default:
                monthName = "Not in the data";
                break;
        }

    }

    public static void main(String[] args) {
        SwitchStatements switchstatements = new SwitchStatements();
        switchstatements.findMonth();
        System.out.println("The month is: " + switchstatements.monthName);
    }
}
