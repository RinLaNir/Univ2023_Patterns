package task_3_2.equations;

// class describe quadratic equation ax^2 + bx + c = 0
public class QuadraticEquation extends Equation {
    protected double a;

    public QuadraticEquation(double a, double b, double c) {
        super(b, c);
        this.a = a;
    }

    @Override
    public double[] solve() {
        if (a == 0) {
            return super.solve();
        }
        if (a == 0 && b == 0 && c != 0) {
            throw new ArithmeticException("equation has no solution");
        }
        if (a == 0 && b == 0 && c == 0) {
            throw new ArithmeticException("equation has infinite number of solutions");
        }

        double d = b * b - 4 * a * c;
        if (d < 0) {
            throw new ArithmeticException("equation has no solution");
        }
        if (d == 0) {
            return new double[] { -b / (2 * a) };
        }
        return new double[] { (-b + Math.sqrt(d)) / (2 * a), (-b - Math.sqrt(d)) / (2 * a) };
    }
}
