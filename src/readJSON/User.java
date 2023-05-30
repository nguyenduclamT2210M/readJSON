package readJSON;

public class User {
    int userId;
    int id;
    String title;
    String body;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + this.userId +
                ", id=" + this.id +
                ", title='" + this.title + '\'' +
                ", body='" + this.body + '\'' +
                '}';
    }

    public User(){
        this.userId = 0;
        this.id = 0 ;
        this.title = "";
        this.body = "";
    }

    public User(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
