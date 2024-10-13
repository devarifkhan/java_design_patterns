class PremiumContentDecorator extends ServiceDecorator {
    public PremiumContentDecorator(WebService webService) {
        super(webService);
    }

    public String getDescription() {
        return webService.getDescription() + ", Premium content access";
    }

    public double getCost() {
        return webService.getCost() + 7.0;
    }
}
