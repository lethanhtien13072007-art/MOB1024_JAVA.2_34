package slide1;

public class xe {
	 private String hangXe;
	    private int Namsanxuat;

	    public String getHangXe() {
	        return hangXe;
	    }

	    public int getNamsanxuat() {
	        return Namsanxuat;
	    }

	    public void sethangXe(String hangXe) {
	        this.hangXe = hangXe;
	    }

	    public void setNamsanxuat(int Namsanxuat) {
	        this.Namsanxuat = Namsanxuat;
	    }
	    
	    public void xuat(){
	        System.out.println("Hãng Xe Là:" +this.hangXe+"|"+"Năm Sản Xuất Lá:"+this.Namsanxuat );
	    }
}
