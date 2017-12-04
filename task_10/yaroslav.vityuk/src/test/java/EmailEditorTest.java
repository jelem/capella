import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import com.hillel.EmailEditor;
import org.junit.Test;

public class EmailEditorTest {

  @Test
  public void shouldReplaceAt() {
    String str = "asd@gmail.com";
    String result = EmailEditor.editEmail(str);

    String str1 = "rambler@rambler.ru";
    String result1 = EmailEditor.editEmail(str1);

    assertThat(result, is("asd[ at ]gmail[ dot ]com"));
    assertThat(result1, is("rambler[ at ]rambler[ dot ]ru"));
  }

}
