package homework;

public enum MenuOption {
    ADD(1, "Add a note"),VIEW(2, "View all records"),
    DELETE(3, "Delete record (by number)"), EXIT(4, "Exit");

    private final int value;
    private final String description;

    MenuOption(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
