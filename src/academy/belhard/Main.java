package academy.belhard;

import academy.belhard.util.CollectionCheckerUtil;
import academy.belhard.util.RandomNumberUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        while (CollectionCheckerUtil.check(numbers)) {
            int randomNumber = RandomNumberUtil.get();
            numbers.add(randomNumber);
        }

        System.out.println(numbers);
    }
}
