abstract class ServiceDecorator implements WebService {
    protected WebService webService;

    public ServiceDecorator(WebService webService) {
        this.webService = webService;
    }

    public String getDescription() {
        return webService.getDescription();
    }

    public double getCost() {
        return webService.getCost();
    }
}

class AdFreeDecorator extends ServiceDecorator {
    public AdFreeDecorator(WebService webService) {
        super(webService);
    }

    public String getDescription() {
        return webService.getDescription() + ", Ad-free browsing";
    }

    public double getCost() {
        return webService.getCost() + 3.0;
    }
}
