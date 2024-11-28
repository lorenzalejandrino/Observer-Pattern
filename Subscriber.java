public class Subscriber implements SubscriberObserver {
    private String name;

    public Subscriber(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    @Override
    public void update(String news){
        System.out.println("news update: " + news);
    }

}
