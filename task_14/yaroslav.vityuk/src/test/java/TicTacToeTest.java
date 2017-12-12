import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TicTacToeTest {

  char[][] field = new char[3][3];

  @Test
  public void shouldDiagonalWin() {
    char[][] field = {
        {'O', 'X', 'O'},
        {'X', 'O', 'X'},
        {'X', 'O', 'O'}
    };
    boolean result = TicTacToe.oneWinner(field);
    assertThat(result, is(true));
  }

  @Test
  public void shouldDiagonalWin2() {
    char[][] field = {
        {'X', 'X', 'O'},
        {'X', 'O', 'X'},
        {'O', 'O', 'X'}
    };
    boolean result = TicTacToe.oneWinner(field);
    assertThat(result, is(true));
  }

  @Test
  public void shouldHorizontalWin() {
    char[][] field = {
        {'O', 'X', 'X'},
        {'X', 'O', 'X'},
        {'O', 'O', 'O'}
    };
    boolean result = TicTacToe.oneWinner(field);
    assertThat(result, is(true));
  }

  @Test
  public void shouldVerticalWin() {
    char[][] field = {
        {'O', 'O', 'X'},
        {'X', 'O', 'O'},
        {'X', 'O', 'X'}
    };
    boolean result = TicTacToe.oneWinner(field);
    assertThat(result, is(true));
  }

  @Test
  public void shouldFillField() {
    char[][] result = {
        {'*', '*', '*'},
        {'*', '*', '*'},
        {'*', '*', '*'}
    };
    TicTacToe.fillBoard(field);
    assertThat(field, is(result));
  }

  @Test
  public void shouldErrorInputCoordinates() {
    char[][] field = {
        {'X', '*', '*'},
        {'*', 'X', '*'},
        {'*', '*', 'O'}
    };
    boolean result = TicTacToe.validateCoordinates("00", field);
    assertThat(result, is(false));
  }


}
