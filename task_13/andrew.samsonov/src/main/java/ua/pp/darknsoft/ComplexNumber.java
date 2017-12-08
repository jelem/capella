package ua.pp.darknsoft;

public class ComplexNumber {
    private double realNumber;
    private double imaginaryNumber;

    public ComplexNumber(double realNumber, double imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public ComplexNumber addition(ComplexNumber complexNumber) {
        ComplexNumber zed = new ComplexNumber(this.realNumber + complexNumber.realNumber, this.imaginaryNumber + complexNumber.imaginaryNumber);
        return zed;
    }

    public ComplexNumber subtraction(ComplexNumber complexNumber) {
        ComplexNumber zed = new ComplexNumber(this.realNumber - complexNumber.realNumber, this.imaginaryNumber - complexNumber.imaginaryNumber);
        return zed;
    }

    public ComplexNumber multiplication(ComplexNumber complexNumber) {
        double zedRealPart = (this.realNumber * complexNumber.realNumber) - (this.imaginaryNumber * complexNumber.imaginaryNumber);
        double zedImgPart = (this.realNumber * complexNumber.imaginaryNumber) + (complexNumber.realNumber * this.imaginaryNumber);
        ComplexNumber zed = new ComplexNumber(zedRealPart, zedImgPart);
        return zed;
    }

    public ComplexNumber division(ComplexNumber complexNumber) {
        double zedRealPart = (this.realNumber * complexNumber.realNumber + this.imaginaryNumber * complexNumber.imaginaryNumber)
                / (complexNumber.realNumber * complexNumber.realNumber + complexNumber.imaginaryNumber * complexNumber.imaginaryNumber);
        double zedImgPart = (complexNumber.realNumber * this.imaginaryNumber - this.realNumber * complexNumber.imaginaryNumber)
                / (complexNumber.realNumber * complexNumber.realNumber + complexNumber.imaginaryNumber * complexNumber.imaginaryNumber);
        ComplexNumber zed = new ComplexNumber(zedRealPart, zedImgPart);
        return zed;
    }

    public ComplexNumber[] extractionOfARoot(int power) {
        ComplexNumber[] complexNumbersArray = new ComplexNumber[power];
        for (int k = 0; k <= complexNumbersArray.length - 1; k++) {
            double zedRealPart = Math.pow(absComplexNumber(this),1.0/power) * (Math.cos((argComplexNumber(this) + 2 * power * k) / power));
            double zedImgPart = Math.pow(absComplexNumber(this),1.0/power) * (Math.sin((argComplexNumber(this) + 2 * power * k) / power));
            complexNumbersArray[k] = new ComplexNumber(zedRealPart, zedImgPart);
        }
        return complexNumbersArray;
    }

    public static double absComplexNumber(ComplexNumber complexNumber) {

        return Math.sqrt(complexNumber.realNumber * complexNumber.realNumber + complexNumber.imaginaryNumber * complexNumber.realNumber);
    }

    public static double argComplexNumber(ComplexNumber complexNumber) {
        if (complexNumber.realNumber >= 0) {
            return Math.atan(complexNumber.realNumber / complexNumber.imaginaryNumber);
        } else {
            return Math.atan(complexNumber.realNumber / complexNumber.imaginaryNumber) + Math.PI;
        }

    }

    @Override

    public String toString() {
        return realNumber + " + " + imaginaryNumber + "i";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        ComplexNumber other = (ComplexNumber) obj;
        if (this.realNumber != other.realNumber) {
            return false;
        }
        if (this.imaginaryNumber != other.imaginaryNumber) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ComplexNumber aComplex = new ComplexNumber(-2, 1);
        ComplexNumber bComplex = new ComplexNumber(1, -1);
        ComplexNumber actual = aComplex.division(bComplex);
        System.out.println(actual);
    }
}
