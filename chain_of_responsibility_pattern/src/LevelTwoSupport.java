class LevelTwoSupport implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void setNext(SupportHandler next) {
        this.nextHandler = next;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("Intermediate Issue")) {
            System.out.println("Level Two Support: Intermediate issue resolved.");
        } else {
            System.out.println("Level Two Support: Passing to next level.");
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }
}