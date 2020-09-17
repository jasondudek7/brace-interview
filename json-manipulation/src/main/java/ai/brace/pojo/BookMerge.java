package ai.brace.pojo;

import java.util.*;

public class BookMerge {

    /*
    Finds the newer book and merges the other book into it.
     */
    public static Book merge(Book book1, Book book2) {
        Book newerBook = book1.getLastModified() > book2.getLastModified() ? book1 : book2;
        Book olderBook = book1.getLastModified() > book2.getLastModified() ? book2 : book1;

        // create a new uuid
        newerBook.setUuid(UUID.randomUUID().toString());

        // check for the release date field
        if(newerBook.getReleaseDate() == null)
            newerBook.setReleaseDate(olderBook.getReleaseDate());

        // merge all the texts
        List<TextArray> allText = new ArrayList<>();
        allText.addAll(List.of(newerBook.getTextArray()));
        allText.addAll(List.of(olderBook.getTextArray()));
        Collections.sort(allText, Comparator.comparingInt(TextArray::getId));

        newerBook.setTextArray(allText.toArray(new TextArray[0]));

        return newerBook;
    }
}
