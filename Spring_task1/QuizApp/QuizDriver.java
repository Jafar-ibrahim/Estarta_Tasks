package QuizApp;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuizDriver {
    public static void main(String[] args) {

        // xml file is found in the resources directory
        BeanFactory ctx = new
                ClassPathXmlApplicationContext("springConfig.xml");
        Quiz quiz = (Quiz)ctx.getBean("quiz");
        quiz.view();




    }
}
