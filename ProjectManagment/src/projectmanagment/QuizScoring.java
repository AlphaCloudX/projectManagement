/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagment;

import java.util.ArrayList;

/**
 *
 * @author miczo4487
 */
public class QuizScoring {
    
    /**
     * Takes in the input from the form and compiles an output
     * @param data all the questions
     * @param radioButtons radio buttons selected
     * @param scoreTexArrayList all the scores
     */
    public static void scoreTest(ArrayList<Question> data, ArrayList<ArrayList<javax.swing.JRadioButton>> radioButtons, ArrayList<javax.swing.JLabel> scoreTexArrayList){
        for(int i = 0; i < data.size(); i++){
            String answer = data.get(i).getTrueAns();
            
            boolean gotCorrect = false;
            for(int j = 0; j < radioButtons.get(i).size(); j++){
                if(radioButtons.get(i).get(j).isSelected()){
                    if(radioButtons.get(i).get(j).getText().equals(answer)){
                        gotCorrect = true;
                    }
                }
            }
            if(gotCorrect == false){
                showNotes(data.get(i), scoreTexArrayList);
            }
        }
    }
    
    public static void showNotes(Question q, ArrayList<javax.swing.JLabel> scoreTexArrayList){
        
    }
    
}
