public class Buku {
  private int id;
  private String judul;
  private String penulis;
  private int jumlahHalaman;
  private double harga;

  public Buku() {
    System.out.println("Object telah diciptakan, constructor berjalan");
  }

  public void naikkanHarga() {
    this.harga = this.harga + 1;
  }

  public void naikkanHarga(double kenaikan) {
    this.harga = this.harga + kenaikan;
  }

  public double getHarga() {
    return harga;
  }

  public int getId() {
    return id;
  }

  public String getJudul() {
    return judul;
  }

  public int getJumlahHalaman() {
    return jumlahHalaman;
  }

  public String getPenulis() {
    return penulis;
  }

  public void setHarga(double harga) {
    this.harga = harga;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setJudul(String judul) {
    this.judul = judul;
  }

  public void setJumlahHalaman(int jumlahHalaman) {
    this.jumlahHalaman = jumlahHalaman;
  }

  public void setPenulis(String penulis) {
    this.penulis = penulis;
  }
}
