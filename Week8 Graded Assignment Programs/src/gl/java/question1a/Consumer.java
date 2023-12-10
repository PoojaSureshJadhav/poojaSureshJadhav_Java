package gl.java.question1a;

public class Consumer extends Thread {
    private Thread1 t;

    public Consumer(Thread1 t) {
        this.t = t;
    }

    public void run() {
        t.deserialize();
    }
}
