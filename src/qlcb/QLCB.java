import java.sql.*;

public class QLCB {
    
    private static Connection cn;
    
    public static void getCon() {
        try {
            cn = DriverManager.getConnection("jdbc:sqlserver://DAT\\SQLSERVER;database=QLCB;user=sa;password=1;trustServerCertificate=true;");
            System.out.println("Connection successed");
        } catch (SQLException e) {
            System.out.println("Ko ket noi dc " + e.getMessage());
        }
    }
    
    public static ResultSet getAllData() {
        try {
            Statement st = cn.createStatement();
            return st.executeQuery("SELECT * FROM tbCanBo");
        } catch (SQLException e) {
            System.out.println("Lỗi: " + e.getMessage());
            return null;
        }
    }
    
    public static void insertCB(int SoTK, String Hoten, String GT, String Diachi, int Luong) {
        if (cn == null) {
            getCon(); 
        }
    
        String sql = "INSERT INTO tbCanBo (SoTK, Hoten, GT, Diachi, Luong) VALUES (?, ?, ?, ?, ?)";
    
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, SoTK);
            ps.setString(2, Hoten);
            ps.setString(3, GT);
            ps.setString(4, Diachi);
            ps.setInt(5, Luong);
            
            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Them data thanh cong");
            } else {
                System.out.println("Them that bai");
            }
            
        } catch (SQLException e) {
            System.out.println("Loi khi them can bo " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        getCon();
        insertCB(72, "tien dat", "nam", "nam dinh", 10000); 
        
        ResultSet rs = getAllData();
         
        try {
            while (rs != null && rs.next()) {
                int SoTK = rs.getInt("SoTK");
                String Hoten = rs.getString("Hoten");
                String GT = rs.getString("GT");
                String Diachi = rs.getString("Diachi");
                int Luong = rs.getInt("Luong");
                
                System.out.println("SoTK: " + SoTK + ", Hoten: " + Hoten + ", GT: " + GT + ", Diachi: " + Diachi + ", Luong: " + Luong);
            }
        } catch (SQLException e) {
            System.out.println("Loi " + e.getMessage());
        }
    }
}
