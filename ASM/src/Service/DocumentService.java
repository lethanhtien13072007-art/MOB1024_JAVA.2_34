package Service;

import Model.*;
import java.util.*;

import Model.Document;

public class DocumentService {
    private Map<String, Document> documents = new HashMap<>();

    // ===== DOCUMENT =====
    public void addDocument(Document doc) throws Exception {
        if (documents.containsKey(doc.getId())) {
            throw new Exception("Trùng ID!");
        }
        documents.put(doc.getId(), doc);
    }

    public void updateDocument(String id, String title, String author, String category) {
        Document doc = documents.get(id);
        if (doc != null) {
            doc.setTitle(title);
            doc.setAuthor(author);
            doc.setCategory(category);
        }
    }

    public void removeDocument(String id) {
        documents.remove(id);
    }

    public Collection<Document> getAll() {
        return documents.values();
    }

    public Document findById(String id) {
        return documents.get(id);
    }

    // ===== COPY =====
    public void addCopy(String docId, DocumentCopy copy) {
        Document doc = documents.get(docId);
        if (doc != null) {
            doc.addCopy(copy);
        }
    }

    public void updateCopyStatus(String docId, String copyId, CopyStatus status) {
        Document doc = documents.get(docId);
        if (doc != null) {
            for (DocumentCopy c : doc.getCopies()) {
                if (c.getId().equals(copyId)) {
                    c.setStatus(status);
                }
            }
        }
    }

    public void removeCopy(String docId, String copyId) {
        Document doc = documents.get(docId);
        if (doc != null) {
            doc.getCopies().removeIf(c -> c.getId().equals(copyId));
        }
    }

    // ===== SEARCH =====
    public List<Document> searchByTitle(String keyword) {
        return documents.values().stream()
                .filter(d -> d.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
    }

    public List<Document> searchByAuthor(String keyword) {
        return documents.values().stream()
                .filter(d -> d.getAuthor().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
    }

    // ===== FILE =====
    public void setData(Map<String, Document> data) {
        this.documents = data;
    }

    public Map<String, Document> getMap() {
        return documents;
    }
}