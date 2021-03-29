
public class HexaObserver extends Observer {

    @Override
    public void update() {
        System.out.println("Hex string: " + Integer.toHexString(subject.getState()));
    }

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
}
