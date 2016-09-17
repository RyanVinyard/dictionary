import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class DefinitionTest {

  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition myDefinition = new Definition("Spoken or done without preparation.");
    assertEquals(true, myDefinition instanceof Definition);
  }

  @Test
  public void Definition_listsDefinitionCorreclty_String() {
    Definition myDefinition = new Definition("Spoken or done without preparation.");
    assertEquals("Spoken or done without preparation.", myDefinition.getDefinition());
  }
}
