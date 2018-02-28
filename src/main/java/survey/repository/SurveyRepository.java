package survey.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import survey.entity.Survey;

public interface SurveyRepository extends MongoRepository<Survey, String>{

    public Survey findBySurveyLink(String SurveyLink);
    public Survey findByAuthor(String author);

}
