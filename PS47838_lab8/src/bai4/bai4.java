package bai4;

public class bai4 {
    public static void main(String[] args) {

        String welcome = """
                Xin chào!
                Chào mừng bạn đến với chương trình quản lý sinh viên.
                Chúc bạn học tốt.
                """;

        System.out.println(welcome);

        String email = """
                Kính gửi %s,
                
                Bạn đã đăng ký học phần thành công.
                
                Trân trọng.
                """.formatted("Nguyễn Văn A");

        System.out.println(email);

        String html = """
                <html>
                    <body>
                        <h1>Thông tin sinh viên</h1>
                        <p>Tên: %s</p>
                        <p>GPA: %.2f</p>
                    </body>
                </html>
                """.formatted("An", 3.5);

        System.out.println(html);

        String sql = """
                SELECT *
                FROM Student
                WHERE gpa > 3.0
                """;

        System.out.println(sql);
    }
}