package observer;

public class ObServer2 implements Observer{
    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(String msg) {
        System.out.println("obServer2 订阅者收到msg:"+msg);
    }
}
