package java8;

//Java program with Optional Class
import java.util.Optional;
public class OptionalDemo{
	public static void main(String[] args) {
		String[] words = new String[10];
		words[5]="ABC";
		Optional<String> checkNull =
					Optional.ofNullable(words[5]);
		if (checkNull.isPresent()) {
			String word = words[5].toLowerCase();
			System.out.print(word);
		} else
			System.out.println("word is null");
	}
}

//The ofNullable() method of java.util.Optional class in Java is used to get an instance of this Optional class with the specified value of the specified type. If the specified value is null, then this method returns an empty instance of the Optional class.
//The isPresent() function in Optional Class is used to evaluate whether the value if assigned to variable is present or not.