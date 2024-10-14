package qlcb;

/**
 *
 * @author Admin
 */
public class CanBo {
    private int SoTK, Luong;
    private char Hoten;
    private char GT;
    private char Diachi;
    
    public CanBo() {}

    public CanBo(int SoTK, int Luong, char Hoten, char GT, char Diachi) {
        this.SoTK = SoTK;
        this.Luong = Luong;
        this.Hoten = Hoten;
        this.GT = GT;
        this.Diachi = Diachi;
    }
    
    public int getSoTK() {
        return SoTK;
    }
    
    public void setSoTK(int SoTK) {
        this.SoTK = SoTK;
    }
    
    public int getLuong() {
        return Luong;
    }
    
    public void setLuong(int Luong) {
        this.Luong = Luong;
    }
    
    public char getHoten() {
        return Hoten;
    }
    
    public void setHoten(char Hoten) {
        this.Hoten = Hoten;
    }
    
    public char getGT() {
        return GT;
    }
    
    public void setGT(char GT) {
        this.GT = GT;
    }
    
    public char getDiachi() {
        return Diachi;
    }
    
    public void setDiachi(char Diachi) {
        this.Diachi = Diachi;
    }
}
