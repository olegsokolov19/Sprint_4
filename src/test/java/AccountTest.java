import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void checkNameToEmbossWithCorrectName() {
        String name = "Тимоти Шаламе";

        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();

        assertTrue(actual);
    }

    @Test
    public void checkNameToEmbossWithoutSpace() {
        String name = "ТимотиШаламе";

        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();

        assertFalse(actual);
    }

    @Test
    public void checkNameToEmbossWithSmallLength() {
        String name = "Тш";

        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();

        assertFalse(actual);
    }

    @Test
    public void checkNameToEmbossWithLongLength() {
        String name = "Тимоти ШаламеТимотиШ";

        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();

        assertFalse(actual);
    }

}