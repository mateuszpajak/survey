package survey.data.serivce;

import org.springframework.data.mongodb.repository.MongoRepository;
import survey.data.entity.Survey;

import java.util.List;

public interface SurveyRepository extends MongoRepository<Survey, String>{

    public Survey findBySurveyLink(String SurveyLink);
    public Survey findByAuthor(String author);

}
