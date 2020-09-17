package ai.brace;

import java.util.*;

public class WordCounter {

    private Map<String, Integer> wordMap;

    public WordCounter() {
        wordMap = new HashMap<>();
    }

    public void add(String word) {
        word = cleanWord(word);
        if (wordMap.containsKey(word))
            wordMap.put(word, wordMap.get(word) + 1);
        else
            wordMap.put(word, 1);
    }

    public List<String> getEntries() {
        List<String> entries = new ArrayList<>();
        List<String> keyList = new ArrayList(wordMap.keySet());
        Collections.sort(keyList);
        for(String key : keyList)
            entries.add(key + " : " + wordMap.get(key));
        return entries;
    }

    /*
        Removes punction, spaces, and normalizes the word to lowercase
     */
    private String cleanWord(String word) {
        word = word.replaceAll(" ", "");
        word = word.replaceAll(",", "");
        word = word.replaceAll("\\.", "");
        word = word.toLowerCase();
        return word;
    }
}
