public class Quiz {
    public static void main(String[] args) {
        QuestionService play = new QuestionService();
        play.playQuiz();
        play.showScore();
    }
}
