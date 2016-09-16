import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class WordTest {

  @Test
  public void Word_instantiatestCorrectly_true() {
    Word myWord = new Word("extemporaneous");
    assertEquals(true, myWord instanceof Word);
  }

  @Test
  public void Word_returnsWordCorrectly_String() {
    Word myWord = new Word("extemporaneous");
    assertEquals("extemporaneous", myWord.getWord());
  }
}
