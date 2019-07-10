package JavaSrc.观察者模式.程序员订阅Android博客周刊;

/**
 * @Auther: lingkai
 * @Date: 2019/7/10 16:36
 * @Description: 文章类
 */
public class Page {
    private String date;
    private String author;
    private String content;

    public Page(String date, String author, String content) {
        this.date = date;
        this.author = author;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Page{" +
                "date='" + date + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
