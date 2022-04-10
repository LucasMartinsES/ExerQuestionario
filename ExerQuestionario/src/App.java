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
        second.addChoice("canada", true);
        second.addChoice("Denmark", false);
        second.addChoice("United States", false);

        //2pts
        Question third = new Question();
        third.setText("Who was the inventor of Linux?");
        third.setAnswer("Linus Torvalds");

        //1,5pts
        ChoiceQuestion fourth = new ChoiceQuestion();
        fourth.setText("Which of these data types is most commonly used in Java?");
        fourth.addChoice("Double, toString, if/else", false);
        fourth.addChoice("Int, Float, Protected", false);
        fourth.addChoice("Char,Boolean, Void", false);
        fourth.addChoice("Double, Int, Boolean", true);

        //2pts  
        Question fifth = new Question();
        fifth.setText("What is the access modifier you should avoid using");
        fifth.setAnswer("Protected");

        //1pts
        Question sixth = new Question();
        fifth.setText("Which of these can generate a loop: 1.float 2.toString 3.Scanner 4.do-while 5.char");
        fifth.setAnswer("4");


        presentQuestion(first);
        presentQuestion(second);
        presentQuestion(third);
        presentQuestion(fourth);
        presentQuestion(fifth);
        presentQuestion(sixth);
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