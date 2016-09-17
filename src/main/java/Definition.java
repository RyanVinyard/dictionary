//Remember, it's a lot like the hero squad app, but with words and definitions instead of squads and heroes. Write it sort of like that.
//SQUAD = WORD
//HERO = DEFINITION

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
public class Definition {
  private String mWordDefinitions;


  public Definition (String wordDefinitions) {
    mWordDefinitions = wordDefinitions;
}

  public String getDefinition() {
    return mWordDefinitions;
  }
}
