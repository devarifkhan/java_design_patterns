interface WebService {
    String getDescription();
    double getCost();
}

class BasicService implements WebService {
    public String getDescription() {
        return "Basic Web Service";
    }

    public double getCost() {
        return 5.0;
    }
}
