import java.util.ArrayList;

public class test {

    public static void main(String[] arg){
        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(0);
        for(int i = 6;i != 0 ; i--){
            myArray.add(i);
        }
        System.out.println(myArray + " arraySize: " + myArray.size());
        System.out.println(myArray.get(1));
        int a = 4;
        System.out.println("LastIndex: " + a);
        System.out.println("lChild: " + ((2*a)-myArray.size()));
        System.out.println("rChild: " + (((2*a)+ 1)-myArray.size()));
        System.out.println(("parent: " + ((a/2)-1)));
    }

}
