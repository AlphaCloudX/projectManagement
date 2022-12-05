/**
 * File that handles all data loading
 */
package projectmanagment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author miczo4487
 */
public class DataLoader {

    //File location, fixed file location
    private static final String PATH = "src/projectmanagment/questions.txt";

    //Requirements
    private final static int TOTALQUESTIONS = 10;
    private final static int WRONGANSWERSPERQUESTION = 3;
    private final static int CORRECTANSWERPERQUESTION = 1;
    private final static int NOTEPERQUESTION = 1;

    /**
     * Method to get what wrong answer slot is available
     *
     * @param q Question object
     * @return int of the available slot
     */
    private static Question findAvailableSlot(Question q, String line) {
        if (q.getPossibleAns1().isEmpty()) {
            q.setPossibleAns1(line);
            return q;

        } else if (q.getPossibleAns2().isEmpty()) {
            q.setPossibleAns2(line);
            return q;

        } else if (q.getPossibleAns3().isEmpty()) {
            q.setPossibleAns3(line);
            return q;
        } else {
            return null;
        }
    }

    /**
     * Method to read a file and use checking techniques to make sure the data
     * provided is accurate Will Stop the program and display an error if the
     * data is incompatible with the program requirements
     *
     * @return
     */
    public static ArrayList<Question> readQuestions() {
        //Arraylist to store the questions
        ArrayList<Question> data = new ArrayList<>();

        //Store the line being read
        String line;

        //keep track of the array index
        int arrayPosition = 0;

        // Store the variables for checking if the right amount of values are given
        int _totalQuestions = TOTALQUESTIONS;
        int _wrongAnswersPerQuestion = WRONGANSWERSPERQUESTION;
        int _correctAnswerPerQuestion = CORRECTANSWERPERQUESTION;
        int _notePerQuestion = NOTEPERQUESTION;

        File f = new File(PATH);
        try {
            //Create scanner object if file exists
            Scanner sc = new Scanner(f);

            //Go through each line to check if it meets the criteria
            while (sc.hasNextLine()) {
                //Check if the new line has a question, if it doesn't contain a question then do not continue
                line = sc.nextLine();

                if (line.contains("[Q]")) {
                    _totalQuestions--;

                    //Create new question object
                    data.add(new Question(line));

                    //Contains a question so check if it includes all elements
                    for (int i = 0; i < WRONGANSWERSPERQUESTION + CORRECTANSWERPERQUESTION + NOTEPERQUESTION; i++) {

                        line = sc.nextLine();

                        //Check if it contains 3 wrong answers
                        if (line.contains("[WA]")) {
                            _wrongAnswersPerQuestion--;

                            //Save the updated Question
                            Question updatedQuestion = findAvailableSlot(data.get(arrayPosition), line);

                            //Find an available slot to store the wrong answer
                            if (updatedQuestion == null) {

                                //Error
                                JOptionPane.showMessageDialog(null, "Too Many Wrong Answers, maximum is: " + WRONGANSWERSPERQUESTION);

                                //Exit the program
                                System.exit(0);

                                return null;
                            } else {
                                //Write the wrong spots to the Question
                                data.set(arrayPosition, updatedQuestion);
                            }

                            //Check if it contains 1 right answer
                        } else if (line.contains("[A]")) {
                            _correctAnswerPerQuestion--;
                            data.get(arrayPosition).setTrueAns(line);

                            //Check if it contains 1 note
                        } else if (line.contains("[N]")) {
                            _notePerQuestion--;
                            data.get(arrayPosition).setFeedback(line);
                        }
                    }

                    //Check if all elements are included
                    if (_wrongAnswersPerQuestion < 0 || _correctAnswerPerQuestion < 0 || _notePerQuestion < 0) {
                        //Error
                        JOptionPane.showMessageDialog(null, "Do Not Have All Required Elements. Require " + WRONGANSWERSPERQUESTION + " Wrong Answers Per Question, " + CORRECTANSWERPERQUESTION + " Right Answer Per Question, " + NOTEPERQUESTION + " Note Per Question");

                        //Exit the program
                        System.exit(0);
                        return null;

                        //All Elements are included so they are reset for the next check
                    } else {
                        _wrongAnswersPerQuestion = WRONGANSWERSPERQUESTION;
                        _correctAnswerPerQuestion = CORRECTANSWERPERQUESTION;
                        _notePerQuestion = NOTEPERQUESTION;
                    }

                    //Line is not a question
                } else {
                    //Error
                    JOptionPane.showMessageDialog(null, "\"" + line + "\" Is not marked as a question [Q]");

                    //Exit the program
                    System.exit(0);

                    return null;
                }

                //Move onto the next question
                arrayPosition++;

            }
            
            //Missing or too many questions, does not have 10
            if (_totalQuestions > 0 || _totalQuestions < 0) {
                //Error
                JOptionPane.showMessageDialog(null, "Insufficient Quantity of Questions, You Have: " + (TOTALQUESTIONS - _totalQuestions) + ", expected " + TOTALQUESTIONS);

                //Exit the program
                System.exit(0);

                return null;
            }

            //Check if the file is able to be opened
        } catch (FileNotFoundException ex) {

            //Error
            JOptionPane.showMessageDialog(null, PATH + " | not accessible");

            //Exit the program
            System.exit(0);

            return null;
        }

        //return all the questions
        return data;
    }

}
