// made a enum class with the name of Day

public enum Day {
    // constants are in uppercase and the value associated with the constants are
    // given inside the parenthesis
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    // the variable assigned to each constant
    private final int dayNumber;

    // constructor is necessary
    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return this.dayNumber;
    }
}
