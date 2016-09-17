import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;


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

  @Test
  public void Word_addsDefinition_true() {
    Word myWord = new Word("extemporaneous");
    Definition myWordDefinition = new Definition("spoken or done without preparation.");
    myWord.defineWord(myWordDefinition);
    assertEquals(true, myWord.getDefinitions().contains(myWordDefinition));
  }

  @Test
  public void Word_addsMultipleDefinitions_true() {
    Word myWord = new Word("extemporaneous");
    Definition myWordDefinition = new Definition("spoken or done without preparation.");
    Definition myWordDefinition2 = new Definition("composed, performed, or uttered on the spur of the moment.");
    Definition myWordDefinition3 = new Definition("I'm just making this definition up because I want to make sure it can handle 3 definitions.");
    myWord.defineWord(myWordDefinition);
    myWord.defineWord(myWordDefinition2);
    myWord.defineWord(myWordDefinition3);
    assertEquals(true, myWord.getDefinitions().contains(myWordDefinition));
    assertEquals(true, myWord.getDefinitions().contains(myWordDefinition2));
    assertEquals(true, myWord.getDefinitions().contains(myWordDefinition3));
  }
}
