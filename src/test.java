import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {

        // let's create a list first
        List<String> top5Books = new ArrayList<String>();
        top5Books.add("Clean Code");
        top5Books.add("Clean Coder");
        top5Books.add("Effective Java");
        top5Books.add("Head First Java");
        top5Books.add("Head First Design patterns");

        // now, suppose you want to replace "Clean Coder" with
        // "Introduction to Algorithms"
        System.out.println("ArrayList before replace: " + top5Books);

        top5Books.set(1, top5Books.get(2));
        top5Books.remove(top5Books.get(2));

        System.out.println("ArrayList after replace: " + top5Books);
    }
}
