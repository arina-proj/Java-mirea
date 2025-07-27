package ru.mirea.lab7.task4;

public interface IMathCalculable {
    double PI = 3.141592653589793;
    ComplexNumber complexPower(ComplexNumber num, int exponent);
    double complexModulus(double real, double imaginary);
}
