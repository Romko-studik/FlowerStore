package flower.store;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    WHITE("#FFFFFF"),
    RED("#FF0000"),
    BLUE("#0000FF");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
