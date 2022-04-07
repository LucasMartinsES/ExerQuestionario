import java.util.Scanner;

/**
 This program shows a simple quiz with one question.
 */
public class App
{
    public static void main(String[] args)
    {
        //2pts
        Question first = new Question();
        first.setText("Who was the inventor of Java?");
        first.setAnswer("James Gosling");

        //1,5pts
        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born?");
        second.addChoice("Australia", false);
        second.addChoice("Canada", true);
        second.addChoice("Denmark", false);
        second.addChoice("United States", false);

        //2pts
        Question third = new Question();
        third.setText("Who was the inventor of Linux?");
        third.setAnswer("Linus Torvalds");

        //1,5pts
        ChoiceQuestion fourth = new ChoiceQuestion();
        fourth.setText("null");
        fourth.addChoice("null", false);
        fourth.addChoice("null", false);
        fourth.addChoice("null", false);
        fourth.addChoice("null", true);

        Question fifth = new Question();
        fifth.setText("null");
        fifth.setAnswer("null");

        presentQuestion(first);
        presentQuestion(second);
        presentQuestion(third);
        presentQuestion(fourth);
        presentQuestion(fifth);
    }

    /**
     Presents a question to the user and checks the response.
     @param q the question
     */
    public static void presentQuestion(Question q)
    {
        q.display();
        System.out.print("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}