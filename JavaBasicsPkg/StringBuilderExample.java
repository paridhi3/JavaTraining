package JavaBasicsPkg;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Java");
        System.out.println(str);

        str.append("FSD Training");
        System.out.println(str);
        
        // Insert content at a specific location
        str.insert(8, "Day2 ");
        System.out.println(str);
        
        // Replace part of the string from index 8 to 11 with "Genpact"
        str.replace(8, 13, "Genpact"); 
        System.out.println(str);
        
        // Delete part of the string from index 4 to 7 (exclusive)
        str.delete(4, 7);
        System.out.println(str);
        
        // Reverse the entire string
        str.reverse();
        System.out.println(str);		
    }
}

