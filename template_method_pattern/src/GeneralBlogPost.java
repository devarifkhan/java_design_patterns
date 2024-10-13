class GeneralBlogPost extends BlogPost {
    @Override
    protected void writeContent() {
        System.out.println("সাধারণ ব্লগ পোস্টের কনটেন্ট লেখা হয়েছে।");
    }

    @Override
    protected void formatPost() {
        System.out.println("সাধারণ ফরম্যাটে ব্লগ পোস্ট ফরম্যাট করা হয়েছে।");
    }
}
