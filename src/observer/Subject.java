package observer;

/**
 * 主题接口
 */
public interface Subject {
    /**
     * 注册观察者
     * @param observer
     */
    public void registerObServer(Observer observer);


    /**
     * 移除观察者
     * @param observer
     */
    public void removeObServer(Observer observer);

    /**
     * 通知所有观察者
     * @param observer
     */
    public void notifyObservers();
}
