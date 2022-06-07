import javax.persistence.Embeddable;

@Embeddable
public class Certificate {

    private String course;
    private String duration;
    private String teacher;

    public Certificate() {
        super();
    }


    public Certificate(String course, String duration, String teacher) {
        this.course = course;
        this.duration = duration;
        this.teacher = teacher;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
