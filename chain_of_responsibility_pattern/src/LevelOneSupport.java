class LevelOneSupport implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void setNext(SupportHandler next) {
        this.nextHandler = next;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("Simple Issue")) {
            System.out.println("Level One Support: Simple issue resolved.");
        } else {
            System.out.println("Level One Support: Passing to next level.");
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }
}