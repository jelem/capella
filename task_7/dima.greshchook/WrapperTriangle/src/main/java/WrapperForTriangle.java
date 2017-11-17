public class WrapperForTriangle {
  public int triangleCalculation(int side, String formula){
    int rezult = 0;
    if (formula.equals("perimeter")){
      rezult = 4 * side;
    }else if (formula.equals("square")){
      rezult = side * side;
    }
    return rezult;
  }
}
