class NewsSubscriber implements Observer {
    private String subscriberName;

    public NewsSubscriber(String name) {
        this.subscriberName = name;
    }

    @Override
    public void update(String news) {
        System.out.println(subscriberName + " কে নতুন খবর পাওয়া গেছে: " + news);
    }
}
