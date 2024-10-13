class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " টাকা ক্রেডিট কার্ডের মাধ্যমে পরিশোধ করা হয়েছে।");
    }
}