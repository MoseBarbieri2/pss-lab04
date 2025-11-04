package it.unibo.collections.sets;

import java.util.Collection;
import java.util.TreeSet;

/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */
        /*
         * 3) Prints its content
         */
        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */
        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
        final int NUM_STRINGS_TO_ADD = 20;
        StringBuilder singleOutput = new StringBuilder();
        TreeSet<String> stringTreeSet = new TreeSet<String>();
        for (int i = 1; i <= NUM_STRINGS_TO_ADD ; i++){
            stringTreeSet.add(Integer.toString(i));
            singleOutput.append("This is the string: ").append(Integer.toString(i)).append("\n");
        }
        System.out.println(singleOutput);
        singleOutput = new StringBuilder(); //this specific new instance is needed to empty the StrBuilder
        TreeSet<String> tempSet = new TreeSet<String>(); // can't remove things in a foreach
        for (String s : stringTreeSet){
            if (Integer.parseInt(s) % 3 != 0){
                tempSet.add(s);
            }
        }
        stringTreeSet = tempSet;
        for(String s : stringTreeSet){
            singleOutput.append("This is NOT a divisible number by 3 : ").append(s).append("\n");
        }
        System.out.println(singleOutput);
        singleOutput = new StringBuilder();
        for (String s : stringTreeSet){
            if(Integer.parseInt(s) % 2 == 0){
                singleOutput.append("this number is even: ").append(s).append("\n");
            }
        }
        System.out.println(singleOutput);


    }
}
