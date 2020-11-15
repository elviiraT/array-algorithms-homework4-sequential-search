package com.company;
import ibcsutils.ReadViaURL;

public class Main {

    public static void main(String[] args)
    {
        String addr = "http://www-personal.umich.edu/~jlawler/wordlist";
        String[] words = ReadViaURL.readWords (addr);
        String key = "abaddon";
        boolean found = false;
        for (int ind = 0; ind < words.length && !found; ind++)
            if ( words[ind].equals(key))
                found = true;
            System.out.println(found);
    }
}
