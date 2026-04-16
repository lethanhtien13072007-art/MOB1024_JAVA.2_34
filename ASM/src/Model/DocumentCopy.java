package Model;

import java.io.Serializable;

public class DocumentCopy implements Serializable {
    private String id;
    private CopyStatus status;

    public DocumentCopy(String id, CopyStatus status) {
        this.id = id;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public CopyStatus getStatus() {
        return status;
    }

    public void setStatus(CopyStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Copy{id='" + id + "', status=" + status + "}";
    }
}