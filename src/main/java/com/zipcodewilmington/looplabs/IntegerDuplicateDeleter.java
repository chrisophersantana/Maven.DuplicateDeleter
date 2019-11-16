package com.zipcodewilmington.looplabs;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array).filter(s -> ocurrances(s) < maxNumberOfDuplications).toArray(Integer[]::new);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array).filter(s -> ocurrances(s) != exactNumberOfDuplications).toArray(Integer[]::new);
    }

    public long ocurrances (Integer c){
        return Arrays.stream(array).filter(z-> z==c).count();
    }
}
