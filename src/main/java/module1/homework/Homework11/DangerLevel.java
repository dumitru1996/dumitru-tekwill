package module1.homework.Homework11;

public enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private final int levelCode;

    DangerLevel(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return levelCode;
    }
}
