import javax.swing.*;
import java.awt.event.*;

/*
 * Week 10 - Java Academy Challenge
 * The window of the Programming Quiz Battle.
 */
public class QuizBattleGUI extends JFrame implements ActionListener {

    // to initialize the class, the class is Questions
    private Questions question;

    private JLabel lblQuestion;
    private JLabel lblResult;

    private JButton btn1;
    private JButton btn2;

    // the points of the player
    private int score = 0;

    public QuizBattleGUI() {

        // name appropriate title
        setTitle("Programming Quiz Battle");

        // set the size, find out the suitable size
        setSize(400, 250);

        setLayout(null);

        // by default set to close method
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // the question of this battle
        question = new Questions("Which keyword creates an object?", "new", "class", "new");

        lblQuestion = new JLabel(question.getQuestion());
        lblQuestion.setBounds(30, 20, 300, 30);

        btn1 = new JButton(question.getOption1());
        btn1.setBounds(50, 80, 120, 40);

        btn2 = new JButton(question.getOption2());
        btn2.setBounds(200, 80, 120, 40);

        lblResult = new JLabel("Answer the question!");
        lblResult.setBounds(30, 150, 300, 30);

        // the window listens to both buttons
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        add(lblQuestion);
        add(btn1);
        add(btn2);
        add(lblResult);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public int getScore() {
        return score;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();

        if (question.isCorrect(button.getText())) {

            // a correct answer defeats the Code Boss and earns a point
            score = score + 1;
            lblResult.setText("Correct! You defeated the Code Boss! Score: " + score);

            // the battle is won, the buttons are switched off
            btn1.setEnabled(false);
            btn2.setEnabled(false);

        } else {
            lblResult.setText("Wrong! Try Again!");
        }
    }

    // the main entry point to open the app
    public static void main(String[] args) {
        new QuizBattleGUI();   // to run the app
    }
}
