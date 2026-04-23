package connect;

import java.sql.*;
import java.util.*;
import Entity.Asset;

public class AssetService {
    List<Asset> list = new ArrayList<>();

    // Load DB
    public void loadData() {
        try (Connection conn = Dbconnect.getConnection()) {
            String sql = "SELECT * FROM Assets";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            list.clear();
            while (rs.next()) {
                Asset a = new Asset(
                        rs.getInt("id"),
                        rs.getString("assetName"),
                        rs.getString("specifications"),
                        rs.getDouble("purchasePrice"),
                        rs.getInt("maintenanceCycle"),
                        rs.getString("location"),
                        rs.getBoolean("isOperational")
                );
                list.add(a);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi load DB: " + e.getMessage());
        }
    }

    // Add
    public void addAsset(Asset a) {
        try (Connection conn = Dbconnect.getConnection()) {
            String sql = "INSERT INTO Assets(assetName, specifications, purchasePrice, maintenanceCycle, location, isOperational) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, a.getAssetName());
            ps.setString(2, a.getSpecifications());
            ps.setDouble(3, a.getPurchasePrice());
            ps.setInt(4, a.getMaintenanceCycle());
            ps.setString(5, a.getLocation());
            ps.setBoolean(6, a.isOperational());

            ps.executeUpdate();
            System.out.println("✔ Thêm thành công!");
        } catch (SQLException e) {
            System.out.println("Lỗi SQL: " + e.getMessage());
        }
    }

    // Display
    public void display() {
        loadData();
        System.out.println("===== DANH SÁCH =====");
        for (Asset a : list) {
            System.out.println(a.getId() + " | " + a.getAssetName()
                    + " | " + a.getPurchasePrice()
                    + " | " + a.getLocation()
                    + " | " + (a.isOperational() ? "Hoạt động" : "Bảo trì"));
        }
    }
    
 // Update
    public void updateMaintenance(int id, int cycle) {
        try (Connection conn = Dbconnect.getConnection()) {
            String sql = "UPDATE Assets SET maintenanceCycle=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cycle);
            ps.setInt(2, id);

            int row = ps.executeUpdate();
            System.out.println(row > 0 ? "✔ Cập nhật OK" : "❌ Không tìm thấy ID");
        } catch (SQLException e) {
            System.out.println("Lỗi SQL: " + e.getMessage());
        }
    }

    // Delete
    public void deleteAsset(int id) {
        try (Connection conn = Dbconnect.getConnection()) {
            String sql = "DELETE FROM Assets WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            int row = ps.executeUpdate();
            System.out.println(row > 0 ? "✔ Xóa OK" : "❌ Không tìm thấy ID");
        } catch (SQLException e) {
            System.out.println("Lỗi SQL: " + e.getMessage());
        }
    }

    // Filter
    public void filterHighValue() {
        loadData();
        list.stream()
            .filter(a -> a.isOperational() && a.getPurchasePrice() > 100_000_000)
            .forEach(a -> System.out.println(a.getAssetName() + " - " + a.getPurchasePrice()));
    }

    // Max
    public void maxPrice() {
        loadData();
        list.stream()
            .max(Comparator.comparingDouble(Asset::getPurchasePrice))
            .ifPresent(a -> System.out.println("Max: " + a.getAssetName() + " - " + a.getPurchasePrice()));
    }
}