package devtalles.patrones.creacionales.d.prototype.devtalles;

// aunque clone este en Object. es requisito implementar Cloneable
public class Document implements Cloneable {
    private String title;
    private String description;
    private String url;

    public Document() {
    }

    public Document(String title, String description, String url) {
        this.title = title;
        this.description = description;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // clone viene de Object
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Document{");
        sb.append("title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
