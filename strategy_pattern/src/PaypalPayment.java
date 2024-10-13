class PaypalPayment implements PaymentStrategy {
    private String email;

    public PaypalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " টাকা পেপালের মাধ্যমে পরিশোধ করা হয়েছে।");
    }
}