package utils;

public class Utils {


    public static void sleepMilliSeconds(int seconds) throws InterruptedException {
        try{
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
