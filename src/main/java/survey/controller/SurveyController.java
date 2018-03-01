package survey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import survey.entity.Survey;
import survey.service.SurveyService;

@RestController
@RequestMapping("/rest/surveys")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @PostMapping
    public @ResponseBody Survey create(@RequestBody Survey survey){
        return surveyService.createSurvey(survey);
    }

    @GetMapping("/{surveyId}")
    public @ResponseBody Survey getSurveyById(@PathVariable(value = "surveyId") String surveyId){
        return surveyService.getSurveyById(surveyId);
    }

    @PutMapping("/update")
    public @ResponseBody Survey updateSurvey(@RequestBody Survey survey){
        return surveyService.updateSurvey(survey);
    }

    @DeleteMapping("/{surveyId}")
    public void deleteSurvey(@PathVariable(value = "surveyId") String surveyId){
        surveyService.deleteSurvey(surveyId);
    }
}
