//Remember, it's a lot like the hero squad app, but with words and definitions instead of squads and heroes. Write it sort of like that.
//SQUAD = WORD
//HERO = DEFINITION
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Word {
  private String mWord;
  // private int mID;
  private static ArrayList<Word> mWords = new ArrayList<Word>();

  public Word(String word) {
    mWord = word;
    // mID = words.size();
    mWords.add(this);
  }

  public String getWord() {
    return mWord;
  }
}
