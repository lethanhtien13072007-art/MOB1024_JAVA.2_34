package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Document implements Serializable {
    private String id;
    private String title;
    private String author;
    private String category;
    private List<DocumentCopy> copies = new ArrayList<>();

    public Document(String id, String title, String author, String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void addCopy(DocumentCopy copy) {
        copies.add(copy);
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public List<DocumentCopy> getCopies() {
        return copies;
    }

    @Override
    public String toString() {
        return "Document{id='" + id + "', title='" + title + "', author='" + author + "', copies=" + copies + "}";
    }
}