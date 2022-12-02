/**
 * File that handles all data loading
 */
package projectmanagment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miczo4487
 */
public class DataLoader {

    //File location, fixed file location
    private static final String path = "src/projectmanagment/questions.txt";

    //Require 10 m
    private static int totalQuestions = 10;
    private static int wrongAnswersPerQuestion = 3;
    private static int correctAnswerPerQuestion = 1;
    private static int notePerQuestion = 1;

    /**
     * Private Method Used Inside This Class To Check If A File Is Able To Be
     * Read
     *
     * @return true or false if the file is valid
     */
    private static boolean checkFile() {
        File f = new File(path);
        try {
            //Create scanner object if file exists
            Scanner sc = new Scanner(f);

            //Go through each line to check if it meets the criteria
            while (sc.hasNextLine()) {

                //Check if the new line has a question, if it doesn't contain a question then do not continue
                if (sc.nextLine().contains("[Q]")) {
                    totalQuestions--;

                    //Contains a question so check if it includes all elements
                    for (int i = 0; i < 4; i++) {

                        //Check if it contains 3 wrong answers
                        if (sc.nextLine().contains("[WA]")) {
                            wrongAnswersPerQuestion--;

                            //Check if it contains 1 right answer
                        } else if (sc.nextLine().contains("[A]")) {
                            correctAnswerPerQuestion--;

                            //Check if it contains 1 note
                        } else if (sc.nextLine().contains("[N]")) {
                            notePerQuestion--;
                        }
                    }

                    //Check if all elements are included
                    if (wrongAnswersPerQuestion < 0 || correctAnswerPerQuestion < 0 || notePerQuestion < 0) {
                        return false;

                        //All Elements are included so they are reset for the next check
                    } else {
                        wrongAnswersPerQuestion = 4;
                        correctAnswerPerQuestion = 1;
                        notePerQuestion = 1;
                    }

                    //Missing An Element
                } else {
                    return false;
                }
                //Missing or too many questions, does not have 10
                if (totalQuestions > 0 || totalQuestions < 0) {
                    return false;
                }
            }

            //Check if the file is able to be opened
        } catch (FileNotFoundException ex) {
            return false;
        }
        return true;
    }

    public static ArrayList<Question> readQuestions() {
        //Arraylist to store the questions
        ArrayList<Question> data = new ArrayList<>();

        if (checkFile()) {
            
             File f = new File(path);
        try {
            //Create scanner object if file exists
            Scanner sc = new Scanner(f);

            //Go through each line to check if it meets the criteria
            while (sc.hasNextLine()) {
                data.add(new Question(sc.nextLine()));
                
            
            }

            //Check if the file is able to be opened
        } catch (FileNotFoundException ex) {
            return null;
        }
            
            
        } else {
            return null;
        }

    }

}
