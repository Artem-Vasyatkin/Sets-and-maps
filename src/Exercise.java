import java.util.*;

public class Exercise {
    public static Exercise OddNumbersPrinter;
    public static Exercise EvenNumbersPrinter;

    public static void printOddNumbers(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

    public static void printEvenNumbersSorted(List<Integer> numbers) {
        Set<Integer> evenNumbersSet = new HashSet<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
        List<Integer> evenNumbersList = new ArrayList<>(evenNumbersSet);
        Collections.sort(evenNumbersList);

        for (Integer evenNumber : evenNumbersList) {
            System.out.println(evenNumber);
        }
    }

    public static void printUniqueWords(List<String> words) {
        Set<String> uniqueWordsSet = new HashSet<>(words);

        for (String word : uniqueWordsSet) {
            System.out.println(word);
        }
    }

    public static void printWordCounts(List<String> words) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for (Integer count : wordCountMap.values()) {
            System.out.println(count);
        }
    }
}


