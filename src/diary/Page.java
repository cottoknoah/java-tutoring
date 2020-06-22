package diary;

public class Page {
    private String date;
    private String content;

    Page(String fileIoString){
        this.date = fileIoString.substring(0, 10);
        this.content = fileIoString.substring(10);
    }

    Page(String date, String content){
        this.date = date;
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}