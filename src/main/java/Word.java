import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Word {
  private String mWord;
  private List<Definition> mDefinitions;
  private int mID;
  private static List<Word> mFullDictionary = new ArrayList<Word>();

  public Word(String word) {
    mWord = word;
    mDefinitions = new ArrayList<Definition>();
    mFullDictionary.add(this);
    mID = mFullDictionary.size();

  }

  public static void clear() {
    mFullDictionary.clear();
  }

  public String getWord() {
    return mWord;
  }

  public int getID() {
    return mID;
  }

  public static List<Word> all() {
    return mFullDictionary;
  }

  public static Word find(int id) {
    return mFullDictionary.get(id - 1);
  }

  public List<Definition> getDefinitions() {
    return mDefinitions;
  }

  public void defineWord(Definition definition) {
    mDefinitions.add(definition);
  }
}
