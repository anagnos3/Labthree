package com.company;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class Main {

    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    private static int wordCount(final String input) {

        String[] mezzaine = input.split(" ");
        return mezzaine.length;

//        int count = 0;
//
//        for (int i = 0; i < input.length()-1; i++) {
//            if (input.charAt(i) == ' ' && input.charAt(i+1) != ' ') {
//                count++;
//            }
//        }
//        return count;

//        "  Francisco, a soldier\n" +
//                "  Reynaldo, servant to Polonius.\n" +
//                "  Players.\n" +
//                "  Two Clowns, gravediggers.\n" +
//                "  Fortinbras, Prince of Norway.  \n" +
//                "  A Norwegian Captain.\n" +
//                "  English Ambassadors.\n" +
//                "\n" +
//                "  Getrude, Queen of Denmark, mother to Hamlet.\n" +
//                "  Ophelia, daughter to Polonius.\n" +
//                "\n" +
//                "  Ghost of Hamlet's Father.\n" +
//                "\n"

//        int lastPlace = 0,
//        count = 0;
//        //System.out.println("CHECK1");
//
//        while (lastPlace < input.length() && lastPlace != -1) {
//            lastPlace = input.indexOf(" ", lastPlace+1);
//            if (lastPlace != -1) {
//                count++;
//            }
//            //System.out.println("CHECKB" + lastPlace);
//        }
//        //System.out.println("CHECK2");
//
//        return count;

    }



    public static void main(String[] args) {
        //Scanner myScan = new Scanner(System.in);

        //System.out.println("GO");
        //System.out.println(wordCount("THIS IS A TEST"));
        System.out.println("WordCount: " + wordCount(urlToString(/*myScan.nextLine()*/"http://erdani.com/tdpl/hamlet.txt")));
    }
}
