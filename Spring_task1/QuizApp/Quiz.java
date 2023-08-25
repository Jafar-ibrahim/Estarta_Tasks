package QuizApp;

import java.util.Arrays;

public class Quiz {

    Private Question[] questionsList;

    public Quiz(Question[] questionsList) {
        this.questionsList = questionsList;
    }

    public void view(){
        for (Question q : questionsList)
            System.out.println(q);
    }
}
