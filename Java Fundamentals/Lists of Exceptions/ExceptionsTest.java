import java.util.ArrayList;
public class ExceptionsTest{
    public static void main(String[] args){
ArrayList<Object> myList = new ArrayList<Object>();
myList.add("13");
myList.add("hello world");
myList.add(48);
myList.add("Goodbye World");

try{

    Integer castedValue = (Integer) myList.get(i);

}
catch (Exceptions e){
            System.out.println("something error");
            // back-up plan here.
        }

}
}