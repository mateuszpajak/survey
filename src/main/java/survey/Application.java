package survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import survey.entity.Survey;
import survey.repository.SurveyRepository;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner{

    @Autowired
    SurveyRepository surveyRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        surveyRepository.deleteAll();

        surveyRepository.save(new Survey("2", "test2"));
        surveyRepository.save(new Survey("3", "test2"));


        System.out.println("--------------------------------");

        List<Survey> surveyList = surveyRepository.findAll();
        for (Survey survey : surveyRepository.findAll()) {
            System.out.println(survey);
        }
        System.out.println("--------------------------------");
        System.out.println(surveyRepository.findBySurveyLink("2"));

    }
}