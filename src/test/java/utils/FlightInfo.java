package utils;

import java.security.SecureRandom;

public class FlightInfo {

    private static int numPassegers = 0;

    public FlightInfo(){

    }

    public static int getNumPassegers() {
        return numPassegers;
    }

    public static void setNumPassegers(int numPassegers) {
        FlightInfo.numPassegers = numPassegers;
    }

    public String createRandomName(){
        char[] ch = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();

        char[] c = new char[7];
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < 7; i++) {
            c[i] = ch[random.nextInt(ch.length)];
        }

        return new String(c);
    }

    public String createRandomNumber(int size) {
        char[] ch = "0123456789".toCharArray();
        char[] c = new char[size];
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < size; i++){
            c[i] = ch[random.nextInt(ch.length)];
        }

        return new String(c);
    }
}
