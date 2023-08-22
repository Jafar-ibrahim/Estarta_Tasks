package QuizApp;

public class Answer {
    private String id;
    private String answerString;
    private String SubmittedBy;

    public Answer() {
    }

    public Answer(String id, String answerString, String submittedBy) {
        this.id = id;
        this.answerString = answerString;
        SubmittedBy = submittedBy;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAnswerString(String answerString) {
        this.answerString = answerString;
    }

    public void setSubmittedBy(String submittedBy) {
        SubmittedBy = submittedBy;
    }

    @Override
    public String toString() {
        return "    Answer "+ id +
                ": "+ answerString +
                " (by " + SubmittedBy + ")";
    }
}
