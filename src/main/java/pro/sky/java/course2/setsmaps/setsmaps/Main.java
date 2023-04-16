package pro.sky.java.course2.setsmaps.setsmaps;

import java.util.*;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        Set<Integer> uniqueEvenNums1 = new TreeSet<>();

        for (Integer num : nums1) {
            if (num % 2 == 0) {
                uniqueEvenNums1.add(num);
            }
        }

        for (Integer evenNum : uniqueEvenNums1) {
            System.out.println(evenNum);
        }

        List<String> words = new ArrayList<>(List.of("apple", "orange", "banana", "orange", "apple", "grape", "banana"));

        Set<String> uniqueWords = new HashSet<>(words);

        for (String word : uniqueWords) {
            System.out.println(word);
        }
        List<String> words1 = new ArrayList<>(List.of("apple", "orange", "banana", "orange", "apple", "grape", "banana"));

        Set<String> uniqueWords1 = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String word : words1) {
            if (!uniqueWords1.add(word)) {
                duplicates.add(word);
            }
        }

        System.out.println("Количество дублей: " + duplicates.size());
    }
}


