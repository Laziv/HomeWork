package Task1;

public enum Seasons {
    WINTER, SPRING, SUMMER, FALL;

    public static String getSeasons(String str) throws WrongInputConsoleParametersException {
        str = str.toUpperCase();
        for (Seasons season : Seasons.values()){
            if(season.toString().equals(str)){
                return str;
            }
        }
        throw new WrongInputConsoleParametersException("Incorrect season name entry");
    }
}
