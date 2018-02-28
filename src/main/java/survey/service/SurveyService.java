package survey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import survey.entity.Question;
import survey.entity.Survey;
import survey.repository.SurveyRepository;

@Service
public class SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    public Survey createSurvey(Survey survey){
        return surveyRepository.insert(survey);
    }

    public Survey getSurveyById(String id){
        return surveyRepository.findOne(id);
    }

    public Survey getSurveyByLink(String link){
        return surveyRepository.findBySurveyLink(link);
    }

    public Survey getSurveyByAuthor(String author){
        return surveyRepository.findByAuthor(author);
    }

    public Survey updateSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }


}
