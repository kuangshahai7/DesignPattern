package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 双色球服务
 */
public class SubjectForSSQ implements Subject{

    /**
     * 内部维护一个集合,记录所有观察者
     */
    private List<Observer> observers = new ArrayList<>();

    private String msg;
    /**
     * 注册
     * @param observer
     */
    @Override
    public void registerObServer(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除
     * @param observer
     */
    @Override
    public void removeObServer(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>=0)observers.remove(observer);
    }

    /**
     * 通知
     * @param observer
     */
    @Override
    public void notifyObservers() {
        for(Observer ob : observers){
            ob.update(msg);
        }
    }

    public void setMsg(String msg){
        this.msg = msg;
        notifyObservers();
    }
}
