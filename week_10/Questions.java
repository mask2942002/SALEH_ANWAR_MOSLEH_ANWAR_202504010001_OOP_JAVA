/*
 * Week 10 - Java Academy Challenge
 * This class holds one quiz question, its two options and
 * the correct answer.
 */
public class Questions {

    private String question;
    private String option1;
    private String option2;
    private String answer;

    // constructor
    public Questions(String question, String option1, String option2, String answer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    // missing components
    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isCorrect(String choice) {
        return choice.equals(answer);
    }
}
