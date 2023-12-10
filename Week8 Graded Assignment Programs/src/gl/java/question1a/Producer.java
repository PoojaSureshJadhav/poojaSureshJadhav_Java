package gl.java.question1a;

public class Producer extends Thread {
    private Thread1 t;

    public Producer(Thread1 t) {
        this.t = t;
    }

    public void run() {
        t.serialize();
    }
}
