public class Komik extends Buku {
  private int volume;

  @Override
  public void naikkanHarga() {
    super.naikkanHarga();
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }
}
