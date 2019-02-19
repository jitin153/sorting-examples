package com.jitin.sortingexample;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListOfIntegers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(16, 12, 3, 7, 23, 17, 6, 10);
		System.out.println("--Numbers before sorting--");
		numbers.forEach(number->{System.out.print(number+" ");});
		numbers.sort(Comparator.naturalOrder());
		System.out.println("\n--Numbers after sorting--");
		numbers.forEach(number->{System.out.print(number+" ");});
	}
}
