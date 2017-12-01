import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import com.hillel.IdentifyPalindromes;
import org.junit.Test;

public class IdentifyPalindromesTest {

  @Test
  public void shouldFindPalindromes() {
    String words = "deleveled, evitative, cat, dog, deified";
    String words2 = "computer, keyboard, vaav, defefed, dog";
    int count = IdentifyPalindromes.findPalndromes(words);
    int count2 = IdentifyPalindromes.findPalndromes(words2);

    assertThat(count, is(3));
    assertThat(count2, is(2));

  }

}
