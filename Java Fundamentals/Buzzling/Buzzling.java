import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Buzzling {
    // public static void main() {
        
        
    //     Collections.shuffle(numbers);
    //     System.out.println(numbers); // [1, 5, 2, 4, 3]
    //     Collections.sort(numbers);
    //     System.out.println(numbers); // [1, 2, 3, 4, 5]
                
    //     Random r = new Random();
    //     System.out.println(r.nextInt()); // without bounds
    //     System.out.println(r.nextInt(5)); // with bounds 0 to 5
    // }

    public static void biggerThanTen(){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(9);
        numbers.add(8);
        numbers.add(13);
        numbers.add(25);
        numbers.add(32);
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i =0 ; i<numbers.size() ; i++){
            if(numbers.get(i)>10){
                newArray.add(numbers.get(i));
            }
        }
        System.out.println(numbers);
        System.out.println(newArray);
    }

    public static ArrayList<String> shuffle(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");

        Collections.shuffle(names);
        System.out.println(names);
        ArrayList<String> names2 = new ArrayList<String>();
        for (String name : names){
            if (name.length()>5){
            names2.add(name);
            }
        }
        System.out.println(names2);
        return names ;
    }

    public static void alphabet(){
        ArrayList<Character> letters = new ArrayList<Character>();
            for (char i = 'a'; i<'z' ; i++){
                letters.add(i);
            }
            System.out.println(letters);

            Collections.shuffle(letters);
            System.out.println(letters);
            ArrayList<Character> vowels = new ArrayList<Character>();
            vowels.add('a');
            vowels.add('e');
            vowels.add('i');
            vowels.add('O');
            vowels.add('u');
                if(vowels.contains(letters.get(0))){
                    System.out.println("its a vowel");   
                }   
    }
    public static void random(){
        ArrayList<Integer> num = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0 ; i<10 ; i++){
            num.add((r.nextInt(100-55)+55));
        }
        System.out.println(num);
    }
    public static void randomSort(){
        ArrayList<Integer> num = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0 ; i<10 ; i++){
            num.add((r.nextInt(100-55)+55));
        }
        System.out.println(num);

        Collections.sort(num);
        System.out.println(num);
        System.out.println("min: " + num.get(0));
        System.out.println("max: " + num.get(num.size()-1));
    } 
    public static String randomString(){
        String a ="";
        Random r = new Random();
        for(int i =0 ;i<5 ; i++){
            a+= (char)(r.nextInt(26)+'a');
        }
        return a;
    }    
        public static ArrayList<String> randomArrayString(){
            ArrayList<String> words =new ArrayList<String>(); 
            
            for(int i =0 ; i<10 ; i++){
                words.add(randomString());
            }
    
        return words;
        
        }
}