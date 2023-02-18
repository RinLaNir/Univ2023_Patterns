package task_3_2.equations;

// class describe bi-quadratic equation ax^4 + bx^2 + c = 0
public class BiQuadraticEquation extends QuadraticEquation {

    public BiQuadraticEquation(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double[] solve() {
        double[] quadraticSolutions = super.solve();
        if (quadraticSolutions.length == 1) {
            return new double[] { Math.sqrt(quadraticSolutions[0]), -Math.sqrt(quadraticSolutions[0]) };
        }
        if (quadraticSolutions.length == 2) {
            if (quadraticSolutions[0] == quadraticSolutions[1]) {
                return new double[] { Math.sqrt(quadraticSolutions[0]), -Math.sqrt(quadraticSolutions[0]) };
            }
            if (quadraticSolutions[0] < 0 && quadraticSolutions[1] > 0) {
                return new double[] { Math.sqrt(quadraticSolutions[1]), -Math.sqrt(quadraticSolutions[1]) };
            }
            if (quadraticSolutions[0] > 0 && quadraticSolutions[1] < 0) {
                return new double[] { Math.sqrt(quadraticSolutions[0]), -Math.sqrt(quadraticSolutions[0]) };
            }
            if (quadraticSolutions[0] > 0 && quadraticSolutions[1] > 0) {
                return new double[] { Math.sqrt(quadraticSolutions[0]), -Math.sqrt(quadraticSolutions[0]),
                        Math.sqrt(quadraticSolutions[1]), -Math.sqrt(quadraticSolutions[1]) };
            }

            throw new ArithmeticException("equation has no solution");
        }
        throw new RuntimeException("unexpected behaviour");
    }
}
