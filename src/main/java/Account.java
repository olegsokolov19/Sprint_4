import io.qameta.allure.Step;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    @Step("Проверка имени для эмбоссирования")
    public boolean checkNameToEmboss() {
        try {
            String trimName = name.trim();
            return trimName.length() >= 3 && trimName.length() <= 19 && trimName.matches(".+\\b\\s\\b.+");

        } catch (NullPointerException e) {
            return false;
        }
    }

}