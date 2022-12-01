import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Type in your username:");
        String username = input.nextLine();
        System.out.println("Type in a word:");
        String textValue1 = input.nextLine();
        System.out.println("Type in another word:");
        String textValue2 = input.nextLine();

        if (textValue1.length() != textValue2.length()) {
            System.out.println("Text values must be of the same length!");
        } else if (textValue1.contains(" ") || textValue2.contains(" ")) {
            System.out.println("No space characters in the word!");
        } else if (!textValue1.matches("[a-zA-Z]+") || !textValue2.matches("[a-zA-Z]+") ){
            System.out.println("No numbers or special characters in the word!");
        }

        Object anagramResult = new Object(textValue1,textValue2,anagramChecker(textValue1,textValue2));

        //writes the results of anagram checker to text file
        BufferedWriter outStream= new BufferedWriter(new FileWriter("AnagramResults.txt", true));
        outStream.append("\n" + anagramResult.getResults());
        outStream.close();

        ArrayList<Object> anagramArray = new ArrayList<Object>();
        anagramArray.add(anagramResult);

    }

    public static boolean anagramChecker(String textValue1, String textValue2){

        char[] charArray1 = textValue1.toCharArray();
        char[] charArray2 = textValue2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1,charArray2)){
            System.out.println("true");
            return true;
        }
        return false;
    }

}
