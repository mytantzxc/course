package task2.complexNumbers;

public class ComplexNumber {
    private double real;
    private double image;

    public ComplexNumber(double real) {
        this.real = real;
        this.image = 0;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImage() {
        return image;
    }

    public void setImage(double image) {
        this.image = image;
    }

    public ComplexNumber(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.image + other.image);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.image - other.image);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double real = this.real * other.real - this.image * other.image;
        double image = this.real * other.image + this.image * other.real;
        return new ComplexNumber(real, image);
    }

    public double abs() {
        return Math.sqrt(this.real * this.real + this.image * this.image);
    }

    public String toString() {
        return this.real + " + " + this.image + "i";
    }
}
