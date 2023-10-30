package ro.ctrln.singleton;

public class Loneliness {

    public static void main(String[] args) {

        Lonely lonelyOne = Lonely.getInstance();
        //Lonely lonelyTwo = new Lonely();
        Lonely lonelyTwo = Lonely.getInstance();

        System.out.println(lonelyOne == lonelyTwo);
    }
}
