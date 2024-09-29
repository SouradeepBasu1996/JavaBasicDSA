package StreamsApiPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsGroupby {

	public static void main(String[] args) {
		StreamsGroupby streamsGroupby = new StreamsGroupby();
		streamsGroupby.mapOfStream();

	}
	
	public void mapOfStream() {
		
		List<Person> personList =  Arrays.asList(new Person(1, "bob", 45, "Amsterdam", "Germany"),
				                                 new Person(2, "bash", 32, "Kolkata", "India"),
				                                 new Person(5, "ali", 50, "Delhi", "India"),
				                                 new Person(4, "hans", 24, "Berlin", "Germany"),
				                                 new Person(3, "gaur", 22, "NY", "USA"));
		
		
		Map<String, List<Person>> countryGrouped = personList.stream().collect(Collectors.groupingBy(Person::getCountry));
		
		System.out.println(" Person Map : "+countryGrouped);
		
		Map<String, List<String>> countryGroupedToName = personList.stream().collect(Collectors.groupingBy(Person::getCountry,
				Collectors.mapping(Person::getName, Collectors.toList())));
		
		System.out.println(" Person Map Name: "+countryGroupedToName);
		
		
	}

}
