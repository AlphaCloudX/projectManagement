/*
 * 2022/12/2
 * This is question class
 */
package projectmanagment;

public class Question {

    //encapsualted attributes
    private String question;//the question part
    private String possibleAns1;//three of possible answers
    private String possibleAns2;
    private String possibleAns3;
    private String trueAns;//the true answer in the array
    private String feedback;//the feedback for this question
    private int score;//how many marks it worth for this question
    private String userAns;//the number in the array of possible answer

    /**
     * Primary constructor, creates a default student with a blank name and zero
     * on all three tests
     */
    public Question() {
        this.question = "";
        this.possibleAns1 = "";
        this.possibleAns2 = "";
        this.possibleAns3 = "";
        this.trueAns = "";
        this.score = 0;
    }

    /**
     * Secondary constructor, makes a new DVD which is an actual movie (i.e.not
     * blank)
     *
     * @param q - question
     */
    public Question(String q) {
        this(); //invoke primary constructor (a.k.a constructor chaining)
        this.question = q;
    }

    /**
     * Tertiary constructor, makes a new DVD which is an actual movie (i.e.not
     * blank) and which may already loaned out
     *
     * @param q - the question itself
     * @param pA1
     * @param pA2
     * @param pA3
     * @param trueA - the true answer
     */
    public Question(String q, String pA1, String pA2, String pA3, String trueA) {
        this(q); //constructor chaining
        this.question = q;
        this.possibleAns1 = pA1;
        this.possibleAns2 = pA2;
        this.possibleAns3 = pA3;
        this.trueAns = trueA;
    }

    //getters and setters for all attributes
    /**
     * Accessor for title attribute
     *
     * @return the feedback for this question
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * Mutator for the DVD's title attribute
     *
     * @param f - the new feedback for this question
     */
    public void setFeedback(String f) {
        this.feedback = f;
    }

    /**
     * Accessor for title attribute
     *
     * @return the score worth in this question
     */
    public int getScore() {
        return score;
    }

    /**
     * Mutator for the DVD's title attribute
     *
     * @param s - the new score for this question
     */
    public void setScore(int s) {
        this.score = s;
    }

    /**
     * Accessor for title attribute
     *
     * @return the feedback for this question
     */
    public String getUserAns() {
        return userAns;
    }

    /**
     * 
     * 
     * Mutator for the DVD's title attribute
     *
     * @param a - the user's answer in this possible answer of array list
     */
    public void setUserAns(int a) {
        String ans;
        if (a == 1){//if input number "1" as user answer
            ans = possibleAns1;//equals the first possible answer
        }else if (a == 2){//"2" is the user answer
            ans = possibleAns2;//equals the second possible answer
        }else{//"3" is the user answer
            ans = possibleAns3;//equals the third possible ans
        }
        this.userAns = ans;
    }
    
    
    /**
     * see if the user got correct on this question
     *
     * @param trueAns - the correct answer for this question <-- can get from the .getTrueAns() method as the answer is saved inside the object? -Michael
     * @param userAns - user's answer
     * @param score - how many score it worth for this question
     * @return scores the user should get
     */
    public int scoreCount(String trueAns, String userAns, int score) {
        //use if statement to check if user chooses the right ans, if so give full mark, if not give 0
        if (trueAns.equals(userAns)) {
            return score;
        } else {
            return 0;
        }
    }
    
    /**
     * Get the question text
     *
     * @return String of the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Set the question to a given text
     *
     * @param question String for question
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * Get the String for the possible answer
     *
     * @return String for what one possible answer is
     */
    public String getPossibleAns1() {
        return possibleAns1;
    }

    /**
     * Set the String for the possible answer
     *
     * @param possibleAns1 new String for possible answer
     */
    public void setPossibleAns1(String possibleAns1) {
        this.possibleAns1 = possibleAns1;
    }

    /**
     * Get the String for the possible answer
     *
     * @return String for what one possible answer is
     */
    public String getPossibleAns2() {
        return possibleAns2;
    }

    /**
     * Set the String for the possible answer
     *
     * @param possibleAns2 new String for possible answer
     */
    public void setPossibleAns2(String possibleAns2) {
        this.possibleAns2 = possibleAns2;
    }

    /**
     * Get the String for the possible answer
     *
     * @return String for what one possible answer is
     */
    public String getPossibleAns3() {
        return possibleAns3;
    }

    /**
     * Set the String for the possible answer
     *
     * @param possibleAns3 new String for possible answer
     */
    public void setPossibleAns3(String possibleAns3) {
        this.possibleAns3 = possibleAns3;
    }

    /**
     * Get the true answer
     *
     * @return String of the true answer
     */
    public String getTrueAns() {
        return trueAns;
    }

    /**
     * Set the true answer
     *
     * @param trueAns String of the true answer
     */
    public void setTrueAns(String trueAns) {
        this.trueAns = trueAns;
    }

}
