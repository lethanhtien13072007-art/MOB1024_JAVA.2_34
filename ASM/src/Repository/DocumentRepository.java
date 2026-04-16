package Repository;

import Model.Document;
import connect.Dbconnect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DocumentRepository {

	    public void insert(Document doc) throws Exception {
	        Connection conn = Dbconnect.getConnection();

	        String sql = "INSERT INTO DOCUMENT VALUES (?, ?, ?, ?)";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setString(1, doc.getId());
	        ps.setString(2, doc.getTitle());
	        ps.setString(3, doc.getAuthor());
	        ps.setString(4, doc.getCategory());

	        ps.executeUpdate();
	        conn.close();
	    }

	    public List<Document> getAll() throws Exception {
	        List<Document> list = new ArrayList<>();
	        Connection conn = Dbconnect.getConnection();

	        String sql = "SELECT * FROM DOCUMENT";
	        Statement st = conn.createStatement();
	        ResultSet rs = st.executeQuery(sql);

	        while (rs.next()) {
	            list.add(new Document(
	                    rs.getString("id"),
	                    rs.getString("title"),
	                    rs.getString("author"),
	                    rs.getString("category")
	            ));
	        }

	        conn.close();
	        return list;
	    }
	}


