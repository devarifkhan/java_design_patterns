class TechnicalBlogPost extends BlogPost {
    @Override
    protected void writeContent() {
        System.out.println("টেকনিক্যাল ব্লগ পোস্টের কনটেন্ট লেখা হয়েছে।");
    }

    @Override
    protected void formatPost() {
        System.out.println("সোর্স কোড হাইলাইট করে ব্লগ পোস্ট ফরম্যাট করা হয়েছে।");
    }
}
