package Task1;

public enum Months {
    JANUARY(31, Seasons.WINTER),
    FEBRUARY(28, Seasons.WINTER),
    MARCH(31, Seasons.SPRING),
    APRIL(30, Seasons.SPRING),
    MAY(31, Seasons.SPRING),
    JUNE(30, Seasons.SUMMER),
    JULY(31, Seasons.SUMMER),
    AUGUST(31, Seasons.SUMMER),
    SEPTEMBER(30, Seasons.FALL),
    OCTOBER(31, Seasons.FALL),
    NOVEMBER(30, Seasons.FALL),
    DECEMBER(31, Seasons.WINTER);

    private Seasons season;
    private int days;

    Months(int days, Seasons season) {
        this.days = days;
        this.season = season;
    }


    public Seasons getSeason() {

        return season;
    }

    public int getDays() {

        return days;
    }


    public static String getMonth(String str) throws WrongInputConsoleParametersException {
        str = str.toUpperCase();
        for (Months month : Months.values()){
            if(month.toString().equals(str)){
                return str;
            }
        }
        throw new WrongInputConsoleParametersException("Incorrect month name entry");
    }

    public static void isValidNumberOfDays(int days) throws WrongInputConsoleParametersException {
        if (days < 28 || days > 31){
            throw new WrongInputConsoleParametersException("Incorrect number of days");
        }
    }
}
