package ua.pp.darknsoft;

public class ComplexNumber {

  private double realNumber;
  private double imaginaryNumber;

  public ComplexNumber(double realNumber, double imaginaryNumber) {
    this.realNumber = realNumber;
    this.imaginaryNumber = imaginaryNumber;
  }

  public ComplexNumber addition(ComplexNumber complexNumber) {
    ComplexNumber zed = new ComplexNumber(this.realNumber + complexNumber.realNumber,
        this.imaginaryNumber + complexNumber.imaginaryNumber);
    return zed;
  }

  public ComplexNumber subtraction(ComplexNumber complexNumber) {
    ComplexNumber zed = new ComplexNumber(this.realNumber - complexNumber.realNumber,
        this.imaginaryNumber - complexNumber.imaginaryNumber);
    return zed;
  }

  public ComplexNumber multiplication(ComplexNumber complexNumber) {
    double zedRealPart = (this.realNumber * complexNumber.realNumber) - (this.imaginaryNumber
        * complexNumber.imaginaryNumber);
    double zedImgPart =
        (this.realNumber * complexNumber.imaginaryNumber) + (complexNumber.realNumber
            * this.imaginaryNumber);
    ComplexNumber zed = new ComplexNumber(zedRealPart, zedImgPart);
    return zed;
  }

  public ComplexNumber division(ComplexNumber complexNumber) {
    double zedRealPart = (this.realNumber * complexNumber.realNumber
        + this.imaginaryNumber * complexNumber.imaginaryNumber)
        / (complexNumber.realNumber * complexNumber.realNumber
        + complexNumber.imaginaryNumber * complexNumber.imaginaryNumber);
    double zedImgPart = (complexNumber.realNumber * this.imaginaryNumber
        - this.realNumber * complexNumber.imaginaryNumber)
        / (complexNumber.realNumber * complexNumber.realNumber
        + complexNumber.imaginaryNumber * complexNumber.imaginaryNumber);
    ComplexNumber zed = new ComplexNumber(zedRealPart, zedImgPart);
    return zed;
  }

  public ComplexNumber[] extractionOfARoot(int power) {
    ComplexNumber[] complexNumbersArray = new ComplexNumber[(int) power];
    for (int k = 0; k <= complexNumbersArray.length - 1; k++) {
      //Math.exp(Math.log(absComplexNumber(this)) / power) == Math.pow(absComplexNumber(this),1.0/power)
      double zedRealPart = Math.exp(Math.log(absComplexNumber(this)) / power) * Math
          .cos((argComplexNumber(this) + 2 * Math.PI * k) / power);
      double zedImgPart = Math.exp(Math.log(absComplexNumber(this)) / power) * Math
          .sin((argComplexNumber(this) + 2 * Math.PI * k) / power);
      complexNumbersArray[k] = new ComplexNumber(zedRealPart, zedImgPart);
    }
    return complexNumbersArray;
  }

  public double absComplexNumber(ComplexNumber complexNumber) {

    return Math.sqrt(complexNumber.realNumber * complexNumber.realNumber
        + complexNumber.imaginaryNumber * complexNumber.imaginaryNumber);
  }

  public double argComplexNumber(ComplexNumber complexNumber) {
    if (complexNumber.realNumber >= 0) {
      return Math.atan(complexNumber.imaginaryNumber / complexNumber.realNumber);
    } else {
      return Math.atan(complexNumber.imaginaryNumber / complexNumber.realNumber) + Math.PI;
    }

  }

  public static double round(double value, int scale) {
    return Math.round(value * Math.pow(10, scale)) / Math.pow(10, scale);
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
    if (round(this.realNumber, 14) != round(other.realNumber, 14)) {
      return false;
    }
    if (round(this.imaginaryNumber, 14) != round(other.imaginaryNumber, 14)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    temp = Double.doubleToLongBits(realNumber);
    result = (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(imaginaryNumber);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }
}
