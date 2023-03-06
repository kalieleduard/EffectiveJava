package singletonPattern;

public enum SingletonPattern {
    KALIEL,
    INSTANCE;

    private String description;

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
