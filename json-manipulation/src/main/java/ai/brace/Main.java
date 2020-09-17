package ai.brace;

import ai.brace.pojo.Book;
import ai.brace.pojo.BookMerge;
import ai.brace.pojo.TextArray;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        /*
        Task 1
         */
        Book a1 = BookLoader.load("a1.json");
        List<TextArray> textArrayList = new ArrayList<>(List.of(a1.getTextArray())); // Lisr.of is unmodifiable, add to new list
        Collections.sort(textArrayList, Comparator.comparingInt(TextArray::getId));

        for(TextArray textArray : textArrayList)
            System.out.println(textArray.getTextdata());

        /*
        Task 2
         */
        Book a2 = BookLoader.load("a2.json");
        textArrayList.addAll(List.of(a2.getTextArray()));
        Collections.sort(textArrayList, Comparator.comparingInt(TextArray::getId));

        for(TextArray textArray : textArrayList)
            System.out.println(textArray.getTextdata());

        /*
        Task 3
         */
        WordCounter wc = new WordCounter();
        for (TextArray textArray : textArrayList) {
            String[] wordArray = textArray.getTextdata().split(" ");
            for (String word : wordArray) {
                wc.add(word);
            }
        }
        for(String entry : wc.getEntries())
            System.out.println(entry);

        /*
        Task 4
         */
        BookWriter.write("actualOutput.json", BookMerge.merge(a1, a2));
    }
}
