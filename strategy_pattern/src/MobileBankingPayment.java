class MobileBankingPayment implements PaymentStrategy {
    private String phoneNumber;

    public MobileBankingPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " টাকা মোবাইল ব্যাংকিংয়ের মাধ্যমে পরিশোধ করা হয়েছে।");
    }
}