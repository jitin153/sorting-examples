package com.jitin.sortingexample;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfStrings {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Vibhav", "Arihant", "Sooraj", "Dipak", "anuj", "Madhur", "chandan");
		
		System.out.println("--Names before sorting--");
		names.forEach(name->{System.out.print(name+" ");});
		
		System.out.println("\n\n--Names after sorting :: Name starts with lowercase will go at the bottom of the list--");
		names.sort(Comparator.naturalOrder());
		names.forEach(name->{System.out.print(name+" ");});
		
		System.out.println("\n\n--Names after sorting :: will ignore the case--");
		names.sort(String.CASE_INSENSITIVE_ORDER);
		names.forEach(name->{System.out.print(name+" ");});
		
		System.out.println("\n\n--Names after sorting :: sort names using java8 stream--");
		List<String> sortedNames=names.stream().sorted().collect(Collectors.toList());
		sortedNames.forEach(name->{System.out.print(name+" ");});
	}

}
