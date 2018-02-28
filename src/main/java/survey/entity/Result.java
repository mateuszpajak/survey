package survey.entity;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Result {

    @Id
    private String id;

    private List<Integer> responds;
    private String ownAnswer;

    public Result() {
    }

    public Result(String id, List<Integer> responds, String ownAnswer) {
        this.id = id;
        this.responds = responds;
        this.ownAnswer = ownAnswer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Integer> getResponds() {
        return responds;
    }

    public void setResponds(List<Integer> responds) {
        this.responds = responds;
    }

    public String getOwnAnswer() {
        return ownAnswer;
    }

    public void setOwnAnswer(String ownAnswer) {
        this.ownAnswer = ownAnswer;
    }

    @Override
    public String toString() {
        return "Result{" +
                "id='" + id + '\'' +
                ", responds=" + responds +
                ", ownAnswer='" + ownAnswer + '\'' +
                '}';
    }
}
