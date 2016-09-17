import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class WordTest {

  @After
  public void emptyWord() {
    Word.clear();
  }

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

  @Test
  public void Word_differentiatesBetweenEntryIDs_int() {
    Word myWord1 = new Word("extemporaneous");
    Word myWord2 = new Word("serendipitously");
    assertEquals(1, myWord1.getID());
    assertEquals(2, myWord2.getID());
  }

  @Test
  public void Word_clearsUsingAfterMethod_int() {
    assertEquals(Word.all().size(), 0);
  }

  @Test
  public void Word_getsWord_True() {
    Word myWord1 = new Word("extemporaneous");
    Word myWord2 = new Word("serendipitously");
    assertEquals(myWord2, Word.find(myWord2.getID()));
  }

}
