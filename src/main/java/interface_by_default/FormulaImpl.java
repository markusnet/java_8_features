package interface_by_default;

public class FormulaImpl implements Formula {
    @Override
    public double calculate(int a) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        double aDouble = formula.calculate(100);     // 100.0
        formula.sqrt(16);           // 4.0
        return aDouble;
    }

    public static void main(String[] args) {
        Formula formula = new FormulaImpl();
        System.out.println(formula.calculate(100));
    }
}
