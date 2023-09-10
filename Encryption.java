//importing libary functions
import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Encryption{
    //class to generate random alphanumeric password of a spcefic length
    public static String generateRandomPassword(int len){
        //the range of the alphanumeric values
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        //making a constructer
        SecureRandom random = new SecureRandom();

        //iterating through a loop and randomly picking a letter and adding it to the string build
        return IntStream.range(0,len)
            //finding the ith position of the string
            .map(i -> random.nextInt(chars.length()))
            //mapping the character value to that position
            .mapToObj(randomIndex -> String.valueOf(chars.charAt(randomIndex)))
            //joining the characters
            .collect(Collectors.joining());
    }
    public static void main(String[] args){
        int len = 10;
        System.out.println(generateRandomPassword(len));
    }
}