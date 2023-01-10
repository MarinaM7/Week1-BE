
public class Prova {

	public static void main(String[] args) {
		
		// tipoVariabile nomeVar = value
		int x = 10;
		System.out.println(x);

		// boolean
		boolean v8 = true;
		boolean v9 = false;
		
		// Strings
		String firstName = "Mario";
		String lastName = "Rossi";
		
		String name = firstName + " " + lastName;
		
		System.out.println(name);
		System.out.println(name + " is long " + name.length() + " letters");
		System.out.println(firstName.charAt(0));
		System.out.println("Questo è un corso phyton".replace("phyton", "java"));
		
		// arrays
		int[] arr = new int[5];
		arr[0]= 45;
		arr[arr.length - 1] = 78;
		System.out.println(java.util.Arrays.toString(arr));
		
		String[] words = {"back-end", "front-end", "java", "database"};
		System.out.println(words[2]);
		
		String[][] colors = {
				{"black", "blue", "red"},
				{"white", "purple"},
				{"yellow", "green", "gray"}
		};
		System.out.println(colors);
		
		// operation
		int a = 10, b = 4;
		System.out.println(a++ + a - --b + b*2);
		
		
		}
		
	}
