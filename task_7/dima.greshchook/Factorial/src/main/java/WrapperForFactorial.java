public class WrapperForFactorial {
  public long factorial(int num){
    long product = 1;
    while (num > 1){
      product *= num;
      num--;
    }
    return  product;
  }
}
