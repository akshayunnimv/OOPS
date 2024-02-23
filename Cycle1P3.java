import java.util.Scanner;

class ComplexNumber {
    double real;
    double imaginary;
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNumber add(ComplexNumber other) {
        double resultReal = this.real + other.real;
        double resultImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(resultReal, resultImaginary);
    }
    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}
public class Cycle1P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Akshay Unni M V\n23mca010\ndt:14/02/2024\nComplexADD");
        System.out.println("Enter the real part of the first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double imaginary1 = scanner.nextDouble();

        System.out.println("Enter the real part of the second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double imaginary2 = scanner.nextDouble();

        ComplexNumber complex1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber complex2 = new ComplexNumber(real2, imaginary2);

        ComplexNumber sum = complex1.add(complex2);

        System.out.println("Sum of the complex numbers:");
        sum.display();

        scanner.close();
    }
}
