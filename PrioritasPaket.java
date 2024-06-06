import java.util.*;

public class PrioritasPaket {
    private PriorityQueue<Paket> PaketQueue;

    public PrioritasPaket() {
        this.PaketQueue = new PriorityQueue<>();
    }

    public void terimaPaket(int id, String nama, int tanggal, String tipe, String alamat) {
        this.PaketQueue.add(new Paket(id, nama, tanggal, tipe, alamat));
    }

    public Paket getNextPaket() {
        return this.PaketQueue.poll();
    }

    public void listJadwal() {
        List<Paket> Pakets = new ArrayList<>();

        while (!this.PaketQueue.isEmpty()) {
            Pakets.add(this.PaketQueue.poll());
        }

        for (Paket Paket : Pakets) {
            System.out.println(Paket);
        }
    }
}
