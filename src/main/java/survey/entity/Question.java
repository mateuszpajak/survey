package survey.entity;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Question {

    @Id
    private String id;
    private String content;
    private String description;
    private List<String> answers;
    private List<Result> results;
    private int availableAnswers;


    public Question() {
    }

    public Question(String content, String description, List<String> answers, List<Result> results, int availableAnswers) {
        this.content = content;
        this.description = description;
        this.answers = answers;
        this.results = results;
        this.availableAnswers = availableAnswers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public int getAvailableAnswers() {
        return availableAnswers;
    }

    public void setAvailableAnswers(int availableAnswers) {
        this.availableAnswers = availableAnswers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", description='" + description + '\'' +
                ", answers=" + answers +
                ", results=" + results +
                ", availableAnswers=" + availableAnswers +
                '}';
    }
}
