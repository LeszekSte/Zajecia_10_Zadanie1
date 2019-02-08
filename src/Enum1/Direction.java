package Enum1;

public enum Direction {
    TURN_LEFT("Lewo"),
    TURN_RIGHT("Prowo"),
    GO_FORWARD("Naprzód"),
    GO_BACK("Do tyłu");
    private final String description;

    Direction(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
