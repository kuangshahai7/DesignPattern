package observer;

public class ObServer1 implements Observer{
    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(String msg) {
        System.out.println("obServer1 订阅者收到msg:"+msg);
    }
}
