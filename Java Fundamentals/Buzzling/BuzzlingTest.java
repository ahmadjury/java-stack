public class BuzzlingTest{

    public static void main(String[] args) {
        Buzzling iD = new Buzzling();
        iD.biggerThanTen();
    
        Buzzling iD2 = new Buzzling();
        iD2.shuffle();

        Buzzling iD3 = new Buzzling();
        iD3.alphabet();

        // iD3.random();
        Buzzling.random();  //you can call the function without object because its defined as static 

        Buzzling.randomSort();

        Buzzling.randomString();

        System.out.println(Buzzling.randomString());


        System.out.println(Buzzling.randomArrayString());

    }
}