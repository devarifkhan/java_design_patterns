abstract class BlogPost {
    public final void writePost() {
        writeContent();
        formatPost();
        savePost();
        publishPost();
    }

    protected abstract void writeContent();
    protected abstract void formatPost();
    protected void savePost() {
        System.out.println("পোস্টটি ডাটাবেসে সংরক্ষণ করা হয়েছে।");
    }
    protected void publishPost() {
        System.out.println("পোস্টটি প্রকাশিত হয়েছে।");
    }
}
