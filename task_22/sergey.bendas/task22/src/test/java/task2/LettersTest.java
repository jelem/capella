package task2;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import com.hillel.task2.Letters;

import org.junit.Test;

public class LettersTest {


  @Test
  public void shouldRepeat() {
    String string = "Hello World!";
    boolean result = Letters.isRepeat(string);
    assertThat(result, is(true));
  }

  @Test
  public void shouldRepeat2() {
    String string = "Hel1o W0rId!";
    boolean result = Letters.isRepeat(string);
    assertThat(result, is(false));
  }
}
