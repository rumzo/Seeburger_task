
public class Magazine  {

    private String name;
    private String issueDate;
    boolean isAvailable = true;

    public Magazine(String name, String issueDate) {
        this.name = name;
        this.issueDate = issueDate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name:'" + name + '\'' +
                ", issueDate:'" + issueDate + '\'' +
                ", isAvailable:" + isAvailable +
                '}';
    }
}
