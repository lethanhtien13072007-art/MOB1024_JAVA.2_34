package Main;

import Model.*;
import Service.DocumentService;
import UTIL.FileUtil;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DocumentService service = new DocumentService();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm tài liệu");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Xóa tài liệu");
            System.out.println("4. Thêm bản sao");
            System.out.println("5. Sửa trạng thái bản sao");
            System.out.println("6. Xóa bản sao");
            System.out.println("7. Tìm theo tiêu đề");
            System.out.println("8. Lưu file");
            System.out.println("9. Load file");
            System.out.println("0. Thoát");

            int choice = Integer.parseInt(sc.nextLine());

            try {
                switch (choice) {
                    case 1 -> addDocument(service);
                    case 2 -> show(service);
                    case 3 -> deleteDocument(service);
                    case 4 -> addCopy(service);
                    case 5 -> updateCopy(service);
                    case 6 -> deleteCopy(service);
                    case 7 -> search(service);
                    case 8 -> save(service);
                    case 9 -> load(service);
                    case 0 -> System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
    }

    // ===== FUNCTIONS =====

    static void addDocument(DocumentService s) throws Exception {
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();
        System.out.print("Category: ");
        String category = sc.nextLine();

        s.addDocument(new Document(id, title, author, category));
    }

    static void show(DocumentService s) {
        s.getAll().forEach(System.out::println);
    }

    static void deleteDocument(DocumentService s) {
        System.out.print("ID: ");
        s.removeDocument(sc.nextLine());
    }

    static void addCopy(DocumentService s) {
        System.out.print("Document ID: ");
        String docId = sc.nextLine();
        System.out.print("Copy ID: ");
        String copyId = sc.nextLine();

        s.addCopy(docId, new DocumentCopy(copyId, CopyStatus.AVAILABLE));
    }

    static void updateCopy(DocumentService s) {
        System.out.print("Document ID: ");
        String docId = sc.nextLine();
        System.out.print("Copy ID: ");
        String copyId = sc.nextLine();

        System.out.println("1. AVAILABLE  2. DAMAGED  3. LOST");
        int c = Integer.parseInt(sc.nextLine());

        CopyStatus status = switch (c) {
            case 1 -> CopyStatus.AVAILABLE;
            case 2 -> CopyStatus.DAMAGED;
            default -> CopyStatus.LOST;
        };

        s.updateCopyStatus(docId, copyId, status);
    }

    static void deleteCopy(DocumentService s) {
        System.out.print("Document ID: ");
        String docId = sc.nextLine();
        System.out.print("Copy ID: ");
        String copyId = sc.nextLine();

        s.removeCopy(docId, copyId);
    }

    static void search(DocumentService s) {
        System.out.print("Keyword: ");
        s.searchByTitle(sc.nextLine()).forEach(System.out::println);
    }

    static void save(DocumentService s) throws Exception {
        FileUtil.save(s.getMap(), "data.dat");
        System.out.println("Đã lưu!");
    }

    static void load(DocumentService s) throws Exception {
        Map<String, Document> data =
                (Map<String, Document>) FileUtil.load("data.dat");
        s.setData(data);
        System.out.println("Đã load!");
    }
}