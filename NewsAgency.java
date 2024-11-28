import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject{
    private List<Subscriber> subscribers = new ArrayList<>();
    private String news;


    public void setNews(String news){
        this.news = news;
    }

    public String getNews(){
        return news;
    }

    @Override
    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    @Override
    public void unSubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(){
        for(Subscriber subscriber: subscribers){
            System.out.println(subscriber.getName() +", here are mind boogling news happening right now!");
            subscriber.update(news);
        }
    }

}
