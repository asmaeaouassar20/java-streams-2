package transformDataUsingStreams.learn;

import static transformDataUsingStreams.learn.Service.toNames;
import static transformDataUsingStreams.learn.Service.toCities;

public class Main {
    public static void main(String[] args) {
        toNames();
        System.out.println("\n");
        toCities();
    }
}
