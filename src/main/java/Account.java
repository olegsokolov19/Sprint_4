public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        String trimName = name.trim();
        return trimName.length() >= 3 && trimName.length() <= 19 && trimName.matches(".+\\b\\s\\b.+");
    }

}