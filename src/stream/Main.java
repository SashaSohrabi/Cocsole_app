package stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("John", 500));
        workers.add(new Worker("Tim", 450));
        workers.add(new Worker("Jack", 550));
        workers.add(new Worker("Sara", 700));
        workers.add(new Worker("Albert", 850));
        workers.add(new Worker("Nick", 450));
        workers.add(new Worker("Susan", 350));


        Set<Integer> numbers = IntStream.generate(
                () -> ThreadLocalRandom.current().nextInt(0, 7))
                .limit(3)
                .boxed()
                .collect(Collectors.toSet());

        List<String> pumaWorkers = numbers.stream()
                .map(num -> workers.get(num).getName())
                .collect(Collectors.toList());
//        numbers.stream().map(num -> workers.get(num).getName())
//                .peek(w -> System.out.print("," + w)).collect(Collectors.toList());
        System.out.println("Puma: " + pumaWorkers);



        Set<Integer> numbers2 = IntStream.generate(
                () -> ThreadLocalRandom.current().nextInt(0, 7))
                .limit(3)
                .boxed()
                .collect(Collectors.toSet());

        List<String> nikeWorkers = numbers2.stream()
                .map(num -> workers.get(num).getName())
                .collect(Collectors.toList());
        System.out.println("Nike: " + nikeWorkers);



        Set<Integer> numbers3 = IntStream.generate(
                () -> ThreadLocalRandom.current().nextInt(0, 7))
                .limit(3)
                .boxed()
                .collect(Collectors.toSet());

        List<String> adidasWorkers = numbers3.stream()
                .map(num -> workers.get(num).getName())
                .collect(Collectors.toList());
        System.out.println("Adidas: " + adidasWorkers);


        Shop puma = new Shop("Puma", "Kiev", pumaWorkers);
        Shop nike = new Shop("Nike", "Kiev", nikeWorkers);
        Shop adidas = new Shop("Adidas", "Kharkov", adidasWorkers);

        Collection<Shop> shops = new ArrayList<>();
        shops.add(puma);
        shops.add(nike);
        shops.add(adidas);

        List<Shop> shopWithTwoWorkers = shops.stream().filter((s) -> s.getWorkers().size() == 2).collect(Collectors.toList());
        System.out.println("Shops with two workers: " + shopWithTwoWorkers);

    }
}
