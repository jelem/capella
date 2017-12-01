import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import com.hillel.ShortWords;
import org.junit.Test;

public class ShortWordsTest {

  @Test
  public void shouldCutThisWorld() {

    String array = "internationalization localization cat elephant monitor";
    String array2 = "keyboard computer superdevice cat cat cat";
    String[] result = ShortWords.shortThisWords(array);
    String[] result2 = ShortWords.shortThisWords(array2);
    String[] check = {"i18n", "l10n", "cat", "e6t", "m5r"};
    String[] check2 = {"k6d", "c6r", "s9e", "cat", "cat", "cat"};

    assertThat(check, is(result));
    assertThat(check2, is(result2));

  }

}
