import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class QuizApp {
    private JFrame frame;
    private JLabel questionLabel, scoreLabel, timerLabel;
    private JRadioButton[] options;
    private ButtonGroup group;
    private JButton nextButton, submitButton, quitButton;
    private int currentQuestion = 0, score = 0;
    private Timer timer;
    private int timeLeft = 10;

    private final String[][] questions = {
        {"What is the capital of France?", "A. Paris", "B. London", "C. Berlin", "D. Rome", "A"},
        {"Which planet is known as the Red Planet?", "A. Earth", "B. Mars", "C. Jupiter", "D. Venus", "B"},
        {"What is 5 + 3?", "A. 5", "B. 6", "C. 8", "D. 10", "C"},
        {"Who wrote 'Hamlet'?", "A. Dickens", "B. Shakespeare", "C. Austen", "D. Hemingway", "B"}
    };

    // Use java.util.List instead of java.awt.List
    private java.util.List<Integer> questionOrder;

    public QuizApp() {
        frame = new JFrame("Quiz Application");
        frame.setLayout(new BorderLayout());
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        questionOrder = new ArrayList<>();
        for (int i = 0; i < questions.length; i++) {
            questionOrder.add(i);
        }
        Collections.shuffle(questionOrder);

        JPanel topPanel = new JPanel(new FlowLayout());
        scoreLabel = new JLabel("Score: 0");
        timerLabel = new JLabel("Time: 10");
        timerLabel.setFont(new Font("Arial", Font.BOLD, 16));
        timerLabel.setForeground(Color.RED);
        topPanel.add(scoreLabel);
        topPanel.add(timerLabel);

        questionLabel = new JLabel("Loading question...", JLabel.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JPanel northPanel = new JPanel(new BorderLayout());
        northPanel.add(topPanel, BorderLayout.NORTH);  
        northPanel.add(questionLabel, BorderLayout.CENTER);  

        frame.add(northPanel, BorderLayout.NORTH); 

        JPanel optionsPanel = new JPanel(new GridLayout(4, 1));
        options = new JRadioButton[4];
        group = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            options[i] = new JRadioButton();
            group.add(options[i]);
            optionsPanel.add(options[i]);
        }
        frame.add(optionsPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        nextButton = new JButton("Next");
        submitButton = new JButton("Submit");
        quitButton = new JButton("Quit");

        nextButton.addActionListener(e -> nextQuestion());
        submitButton.addActionListener(e -> showResults());
        quitButton.addActionListener(e -> System.exit(0));

        buttonPanel.add(nextButton);
        buttonPanel.add(submitButton);
        buttonPanel.add(quitButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        timer = new Timer(1000, e -> {
            timeLeft--;

            SwingUtilities.invokeLater(() -> {
                timerLabel.setText("Time: " + timeLeft);
            });

            if (timeLeft == 0) {
                nextQuestion();
            }
        });

        frame.setVisible(true); 
        loadQuestion();
        timer.start();
    }

    private void loadQuestion() {

        if (currentQuestion < questions.length) {
            int index = questionOrder.get(currentQuestion);
            String questionText = questions[index][0];
            questionLabel.setText(questionText);

            for (int i = 0; i < 4; i++) {
                options[i].setText(questions[index][i + 1]);
            }

            group.clearSelection();

            timeLeft = 10;
            SwingUtilities.invokeLater(() -> {
                timerLabel.setText("Time: " + timeLeft);
                questionLabel.revalidate(); 
                questionLabel.repaint();
            });

            timer.restart();
        } else {
            showResults();
        }
    }

    private void nextQuestion() {
        if (currentQuestion < questions.length) {
            int index = questionOrder.get(currentQuestion);
            String correctAnswer = questions[index][5];

            for (int i = 0; i < 4; i++) {
                if (options[i].isSelected()) {
                    if (options[i].getText().substring(0, 1).equals(correctAnswer)) { // Compare the option letter
                        score++;
                    }
                }
            }

            currentQuestion++;
            scoreLabel.setText("Score: " + score);

            if (currentQuestion < questions.length) {
                loadQuestion();
            } else {
                showResults();
            }
        }
    }

    private void showResults() {
        timer.stop();
        JOptionPane.showMessageDialog(frame, "Quiz Over! Final Score: " + score + "/" + questions.length);
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(QuizApp::new);
    }
}
