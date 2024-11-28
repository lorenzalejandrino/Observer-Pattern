public interface NewsAgencySubject {
    public void unSubscribe(Subscriber subscriber);
    public void subscribe(Subscriber subscriber);
    public void notifySubscribers();

}
