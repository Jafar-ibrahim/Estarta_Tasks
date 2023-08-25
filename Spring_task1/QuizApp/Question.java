package QuizApp;

import java.util.Arrays;

public class Question {
    Private int id;
    Private String questionString;
    Private Answer[] answersList;

    public Question() {
    }

    public Question(int id, String questionString, Answer[] answersList) {
        this.id = id;
        this.questionString = questionString;
        this.answersList = answersList;
    }

    public void setQuestionString(String questionString) {
        this.questionString = questionString;
    }

    public void setAnswersList(Answer[] answersList) {
        this.answersList = answersList;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question "+id+":"+questionString+"\n");
        if (answersList.length > 0)
            Arrays.stream(answersList)
                    .forEach(x-> sb.append(x.toString()+"\n"));
        return sb.toString();
    }
}
