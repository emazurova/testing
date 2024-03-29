package math;

public class TrigonometricExpression extends AbstractMath {
    private TrigonometricFunctions func;

    public TrigonometricExpression(TrigonometricFunctions func) {
        this.func = func;
    }

    public TrigonometricExpression() {
        this.func = new TrigonometricFunctions();
    }

    public double calculate(double x, double precision) {
        if (x % (Math.PI / 2) == 0) {
            return Double.NaN;
        }
        return (((Math.pow(func.cot(x, precision) + func.cos(x, precision), 2)) +
                func.csc(x, precision) * func.cot(x, precision)) +
                (func.tan(x, precision) - func.sin(x, precision))) -
                func.tan(x, precision) * (func.sec(x, precision) / func.cos(x, precision) -
                        (func.sin(x, precision) + (func.sec(x, precision) - func.cot(x, precision))));
    }
}
