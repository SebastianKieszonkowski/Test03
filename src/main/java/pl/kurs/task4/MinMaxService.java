package pl.kurs.task4;

import pl.kurs.task4.models.MinMax;

import java.util.Collections;
import java.util.List;

public class MinMaxService {
    public static <T extends Comparable> MinMax<T> getMinAndMax(List<T> elements) {
        Collections.sort(elements);
        return new MinMax<T>(elements.get(elements.size()-1), elements.get(0));
    }
}
