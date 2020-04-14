import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainApp {

    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        task5();
    }

    static void task1() {
        List<String> names = Arrays.asList("Ivan", "Olena", "Peter", "Olga", "Mike", "Iryna", "Kirill", "Maya", "Alex");
        String result1 = retrieveItemsWithOddIndicesAsOneString(names);
        System.out.println(result1);
    }

    static String retrieveItemsWithOddIndicesAsOneString(List<String> names) {
        return IntStream
                .rangeClosed(1, names.size())
                .filter(i -> i % 2 != 0)
                .boxed()
                .map(i -> "" + i + "." + names.get(i - 1))
                .reduce((a, b) -> a + "," + b)
                .orElse("");
    }


    static void task2() {
        List<String> names = Arrays.asList("Максим", "Elena", "Peter", "Olga", "Mike 56", "Ірина", "Євген", "Maya", "Alex", "Анна");
        List<String> result2 = toUppercasePlusSortDesc(names);
        result2.forEach(System.out::println);
    }

    static List<String> toUppercasePlusSortDesc(List<String> input) {
        Collator uaCollator = Collator.getInstance(new Locale("uk", "UA"));

        return input.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.comparing(String::toString, uaCollator).reversed())
                //.sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }


    static void task3() {
        String result3 = convertListIntoStringSeparatedByCommas(Arrays.asList(1, 2, 0), Arrays.asList(4, 5), Arrays.asList(7, 10, 15));
        System.out.println(result3);
    }

    @SafeVarargs
    static String convertListIntoStringSeparatedByCommas(List<Object>... lists) {
        //for visual output
        Arrays.stream(lists)
                .forEach(System.out::print);
        System.out.println();

        Arrays.stream(lists)
                .flatMap(Collection::stream)
                .forEach(a -> System.out.print(a + " "));
        System.out.println();
        //for visual output

        return Arrays.stream(lists)
                .flatMap(Collection::stream)
                .map(Object::toString)
                .reduce((a, b) -> a + "," + b)
                .orElse("");
    }


    static void task4() {
        long a = 25214903917L, c = 11, m = 2L << 47;
        Stream<Long> result4 = generateInfiniteStreamOfRandomNumbers(a, c, m, 1);
        result4.limit(100).forEach(System.out::println);
    }

    static Stream<Long> generateInfiniteStreamOfRandomNumbers(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }


    static void task5() {
        Stream<Integer> result5 = zip(Stream.of(1, 2, 0), Stream.of(4, 5, 9, 11, 106, 17));
        result5.forEach(System.out::println);

        Stream<String> result5s = zip(Stream.of("Максим", "Elena", "Peter", "Olga"), Stream.of("Максим", "Elena"));
        result5s.forEach(System.out::println);
    }

    static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIter = first.iterator();

        return second.filter(s -> firstIter.hasNext())
                .map(s -> Arrays.asList(firstIter.next(), s))
                .flatMap(Collection::stream);
    }

    static <T> Stream<T> zip2(Stream<T> first, Stream<T> second) {

        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondList = second.collect(Collectors.toList());
        int size = Math.min(firstList.size(), secondList.size());

        return IntStream.range(0, size)
                .boxed()
                .map(i -> Arrays.asList(firstList.get(i), secondList.get(i)))
                .flatMap(Collection::stream);
    }
}
