package ru.mirea.lab7.task4;

public class MathFunc implements IMathCalculable{
    @Override
    public ComplexNumber complexPower(ComplexNumber num, int exponent) { // используем Формулу Муавра
        double r = complexModulus(num.getReal(), num.getImaginary());
        double theta = Math.atan2(num.getImaginary(), num.getReal());
        double newR = Math.pow(r, exponent);
        double newTheta = theta * exponent;
        double newReal = newR * Math.cos(newTheta);
        double newImaginary = newR * Math.sin(newTheta);

        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public double complexModulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double circleCircumference(double radius) {
        return 2 * PI * radius;
    }
}
