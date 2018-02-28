package survey.entity;


import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;

public class Survey {

    @Id
    private String id;
    private String surveyLink;
    private String resultLink;
    private String title;
    private String description;
    private LocalDateTime createDate;
    private LocalDateTime expirationDate;
    private String author;
    private List<Question> questions;

    public Survey() {
    }

    public Survey(String surveyLink, String resultLink) {
        this.surveyLink = surveyLink;
        this.resultLink = resultLink;
    }

    public Survey(String surveyLink, String resultLink, String title, String description, LocalDateTime createDate, LocalDateTime expirationDate, String author, List<Question> questions) {
        this.surveyLink = surveyLink;
        this.resultLink = resultLink;
        this.title = title;
        this.description = description;
        this.createDate = createDate;
        this.expirationDate = expirationDate;
        this.author = author;
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "id='" + id + '\'' +
                ", surveyLink='" + surveyLink + '\'' +
                ", resultLink='" + resultLink + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createDate=" + createDate +
                ", expirationDate=" + expirationDate +
                ", author='" + author + '\'' +
                ", questions=" + questions +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurveyLink() {
        return surveyLink;
    }

    public void setSurveyLink(String surveyLink) {
        this.surveyLink = surveyLink;
    }

    public String getResultLink() {
        return resultLink;
    }

    public void setResultLink(String resultLink) {
        this.resultLink = resultLink;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
