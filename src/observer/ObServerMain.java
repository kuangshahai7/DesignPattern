package observer;

public class ObServerMain {


    public static void main(String[] args) throws InterruptedException {
        SubjectForSSQ subject = new SubjectForSSQ();

        ObServer1 obServer1 = new ObServer1();

        ObServer2 obServer2 = new ObServer2();

        subject.registerObServer(obServer1);
        subject.registerObServer(obServer2);

        subject.setMsg("欢迎大家订阅 电影最TOP公众号");

        System.out.println("observer2 取消订阅");
        subject.removeObServer(obServer2);
        Thread.sleep(2000);



        subject.setMsg("第二期:杀死比尔");

    }
}
