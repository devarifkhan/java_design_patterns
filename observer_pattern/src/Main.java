//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NewsChannel newsChannel = new NewsChannel();

        NewsSubscriber subscriber1 = new NewsSubscriber("সাবস্ক্রাইবার ১");
        NewsSubscriber subscriber2 = new NewsSubscriber("সাবস্ক্রাইবার ২");

        newsChannel.registerObserver(subscriber1);
        newsChannel.registerObserver(subscriber2);

        newsChannel.setLatestNews("আজকের খবরে বাজারে উত্থান ঘটেছে।");
        newsChannel.setLatestNews("এবং একটি নতুন ফিল্ম মুক্তি পেয়েছে।");
    }
}