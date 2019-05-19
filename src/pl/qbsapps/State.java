package pl.qbsapps;

public enum State {
    Q0("q0", false, 0),
    Q1("q1", false, 1),
    Q2("q2", false, 2),
    Q3("q3", false, 3),
    Q4("q4", false, 4),
    Q5("q5 - Herbata", true, 5),
    Q6("q6 - Herbata, 1zł reszty", true, 6),
    Q7("q7 - Kawa", true, 7),
    Q8("q8 - Kawa, 1zł reszty", true, 8),
    Q9("q9 - Kawa, 2zł reszty", true, 9);

    State(String text, boolean ending, int value){
        this.text = text;
        this.ending = ending;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public boolean isEnding() {
        return ending;
    }

    public int getValue() {
        return value;
    }

    private String text;
    private boolean ending;
    private int value;
}
