public class NewsStation {
    public static void main(String[] args){
        NewsAgency newsAgency = new NewsAgency();

        Subscriber edsheeran = new Subscriber("Ed Sheeran");
        Subscriber moist = new Subscriber("Moist Kritikal");
        Subscriber garen = new Subscriber("Garen Crownguard");

        newsAgency.subscribe(edsheeran);
        newsAgency.subscribe(moist);
        newsAgency.subscribe(garen);

        newsAgency.setNews("A kid has fell down to a Gorilla pit in Cincinnati Zoo and Botanical Garden!\n");
        newsAgency.notifySubscribers();

        newsAgency.setNews("Mr. President the second tower has been hit.\n");
        newsAgency.notifySubscribers();
        newsAgency.unSubscribe(edsheeran);

        newsAgency.setNews("Sara Duterte vs Ferdinand Romualdez Marcos Jr. : Civil War!\n");
        newsAgency.notifySubscribers();

    }
}
