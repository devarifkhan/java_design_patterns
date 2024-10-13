//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SupportHandler levelOne = new LevelOneSupport();
        SupportHandler levelTwo = new LevelTwoSupport();
        SupportHandler levelThree = new LevelThreeSupport();

        levelOne.setNext(levelTwo);
        levelTwo.setNext(levelThree);

        String[] requests = {"Simple Issue", "Intermediate Issue", "Complex Issue"};

        for (String request : requests) {
            levelOne.handleRequest(request);
        }
    }
}