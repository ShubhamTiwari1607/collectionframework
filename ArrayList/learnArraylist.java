import java.util.ArrayList;
import java.util.List;
class learnArraylist{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        System.out.println(list);

        List<String> sublist = new ArrayList<String>() ;
        sublist.add("Hello");
        sublist.add("Java");
        System.out.println(sublist);

        list.addAll(sublist);  // Adds all elements of sublist to list
        System.out.println(list);
        sublist.add(2, "Programming"); // Inserts "Programming" at index 2
        System.out.println(sublist);
        System.out.println(sublist.get(1));

        System.out.println(list.contains("World")); // Checks if "World" is in the list
        System.out.println(list.indexOf("Java")); // Returns the index of the first occurrence of "Java"
        System.out.println(list.lastIndexOf("Java")); // Returns the index of the last occurrence of "Java"
        System.out.println(list.isEmpty()); // Checks if the list is empty
        System.out.println(list.size()); // Returns the number of elements in the list
        System.out.println(list.remove("Hello")); // Removes the first occurrence of "Hello" from the list
        System.out.println(list);
        System.out.println(list.remove(0)); // Removes the element at index 0 and returns it
        System.out.println(list);
    }
}