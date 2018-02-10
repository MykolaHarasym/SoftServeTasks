package EnumTask;

public enum Color {
    RED (3), GREEN (4), BLUE(7);
    private int bright;

    Color(int bright) {
        this.bright = bright;
    }

    public int getBright() {
        return bright;
    }
}
