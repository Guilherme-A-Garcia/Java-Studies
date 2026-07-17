// Simply replace "class" with "enum" to create an enum.
public enum Day {
    // Common convention for enum constants is to write them in uppercase
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private final int dayNum;

    Day(int dayNum){
        this.dayNum = dayNum;
    }

    public int getDayNumber(){
        return this.dayNum;
    }
}
