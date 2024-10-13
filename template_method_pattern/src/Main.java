//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BlogPost generalPost = new GeneralBlogPost();
        BlogPost technicalPost = new TechnicalBlogPost();

        System.out.println("সাধারণ ব্লগ পোস্ট তৈরি করা হচ্ছে:");
        generalPost.writePost();

        System.out.println("\nটেকনিক্যাল ব্লগ পোস্ট তৈরি করা হচ্ছে:");
        technicalPost.writePost();
    }
}