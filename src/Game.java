import java.util.ArrayList;

public class Game {
    TextUI ui = new TextUI();
    Unit friendlyUnit = new Unit("FriendlyUnit", 100, 10, 0);
    Unit enemyUnit = new Unit("enemyUnit", 60, 15, 0);

    private void printMainMenu() {
        ArrayList<String> menuList = new ArrayList<>();
        menuList.add("Start game");
        menuList.add("Options");
        menuList.add("Quit");
        ui.displayList(menuList, "=== AutoBattler main menu ===", true);
    }

    public void mainMenu() {
        while (true) {
            printMainMenu();
            int playerChoice = ui.promptNumeric("Choose an action from list above");
            switch (playerChoice) {
                case 1 -> startGame();
                case 2 -> printOptions();
                case 3 -> System.exit(0);
                default -> mainMenu();
            }
        }
    }

    public void startGame() {
        while (friendlyUnit.getHealthPoint() > 0 && enemyUnit.getHealthPoint() > 0) {
            friendlyUnit.attack(friendlyUnit, enemyUnit);
            enemyUnit.attack(enemyUnit, friendlyUnit);
        }
    }

    public void printOptions() {

    }
}