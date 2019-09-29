package interface_by_default;

public interface Formula {
    double calculate(int a);

    public default double sqrt(int a) {
        return Math.sqrt(a);
    }
}