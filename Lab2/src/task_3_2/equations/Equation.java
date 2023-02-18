package task_3_2.equations;

// class describe linear equation bx + c = 0
public class Equation implements IEquation {
    protected double b;
    protected double c;

    public Equation(double b, double c) {
        this.b = b;
        this.c = c;
    }

    @Override
    public double[] solve() {
        if (b == 0 && c!= 0) {
            throw new ArithmeticException("equation has no solution");
        }
        if (b == 0 && c == 0) {
            throw new ArithmeticException("equation has infinite number of solutions");
        }
        return new double[] { -c / b };
    }
}
