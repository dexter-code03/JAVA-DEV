import java.util.Objects;
import java.util.Scanner;

public class QuestionService {
    Question [] questions = new Question[5];
    String [] selection = new String [5];

    QuestionService()
    {
        questions[0] = new Question(1,"Size of int?",2,6,4,8,"4");
        questions[1] = new Question(2,"Size of double?",2,6,4,8,"8");
        questions[2] = new Question(3,"Size of char?",2,6,4,8,"2");
        questions[3] = new Question(4,"Size of long?",2,6,4,8,"8");
        questions[4] = new Question(5,"Size of boolean?",1,6,4,8,"1");
    }

    public void playQuiz()
    {
        int j = 0;
        for(Question i:questions)
        {
            System.out.println(i.getId()+": "+i.getQuestion());
            System.out.println(i.getOpt1());
            System.out.println(i.getOpt2());
            System.out.println(i.getOpt3());
            System.out.println(i.getOpt4());
            Scanner input = new Scanner(System.in);
            selection[j] = input.nextLine();
            j++;
        }
    }
    public void showScore()
    {
        int score=0;
        for(int i=0;i< questions.length;i++)
        {
            String ans = selection[i];
            String actAns = questions[i].getAnswer();
            if(Objects.equals(ans, actAns))
            {
                score++;
            }
        }
        System.out.println(score);
    }
}
