package validator;

public class Validation {

		    public static void main(String[] args) {
		        // Test cases
		        String name1 = "John Doe";
		        String name2 = "John123";
		        String name3 = "";
		        
		        int age1 = 25;
		        int age2 = -5;
		        int age3 = 151;
		        
		        System.out.println("Validating names:");
		        System.out.println(name1 + ": " + validateName(name1));
		        System.out.println(name2 + ": " + validateName(name2));
		        System.out.println(name3 + ": " + validateName(name3));
		        
		        System.out.println("\nValidating ages:");
		        System.out.println(age1 + ": " + validateAge(age1));
		        System.out.println(age2 + ": " + validateAge(age2));
		        System.out.println(age3 + ": " + validateAge(age3));
		    }
		    
		    public static boolean validateName(String name) {
		        // Check if the name is empty or null
		        if (name == null || name.trim().isEmpty()) {
		            return false;
		        }
		        
		        // Check if the name is too long
		        if (name.length() > 50) {
		            return false;
		        }
		        
		        // Check if the name contains only letters and spaces
		        for (char c : name.toCharArray()) {
		            if (!Character.isLetter(c) && c != ' ') {
		                return false;
		            }
		        }
		        
		        return true;
		    }
		    
		    public static boolean validateAge(int age) {
		        // Check if the age is between 0 and 150
		        return age >= 0 && age <= 150;
		    }

	}


