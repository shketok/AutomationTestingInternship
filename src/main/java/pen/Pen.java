package pen;

public class Pen {
    private String color = "BLUE";
    private int inkCounter = 100;
    private double sizeLetter = 1.0;

    public Pen() {}

    public Pen(String color) {
        this.color = color;
    }

    public Pen(String color, int inkCounter) {
        this(color);
        this.inkCounter = inkCounter;
    }

    public String write(String wordToWrite) {
        if (wordToWrite.equals("Putin")) {
            throw new RuntimeException("Illegal word to write");
        }
        return wordToWrite;
    }

    public String isNumberGreaterThan(int numberToCheck, int numberToCompare) {
        if (numberToCheck > numberToCompare) {
            return "true";
        } else if (numberToCheck == numberToCompare) {
            return "equal";
        } else {
            return "false";
        }
    }

    public String getColor() {
        return color;
    }

}
