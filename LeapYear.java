public class LeapYear {

    public int year;

    public boolean leapYearCheck(int year) {
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
}