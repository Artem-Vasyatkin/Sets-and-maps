import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("Нечетные числа:");
        Exercise.printOddNumbers(nums);

        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("Четные числа без повторений в порядке возрастания:");
        Exercise.printEvenNumbersSorted(nums1);

        List<String> words = new ArrayList<>(List.of("кот", "собака", "кот", "птица", "собака", "рыба"));
        System.out.println("Уникальные слова:");
        Exercise.printUniqueWords(words);

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        System.out.println("Количество дублей для каждого уникального слова:");
        Exercise.printWordCounts(strings);
    }
}





