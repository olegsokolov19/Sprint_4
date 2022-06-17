import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    boolean validate;

    public AccountTest(String name, boolean validate) {
        this.name = name;
        this.validate = validate;
    }

    @Parameterized.Parameters(name = "{index}: {0}={1}")
    public static Object[][] getName() {
        return new Object[][]{
                {"Тимоти Шаламе", true},
                {"   Тимоти Шаламе   ", true},
                {"Тимоти Шаламе   ", true},
                {"   Тимоти Шаламе", true},
                {"Т Ш", true},
                {"Тимоти ШаламеТимоти", true},
                {"Тш", false},
                {"Тимоти ШаламеТимотиШ", false},
                {"ТимотиШаламе", false},
                {"Тимоти  Шаламе", false},
                {"", false},
                {"               ", false},
                {null, false}
        };
    }

    @Test
    public void checkNameToEmbossWithCorrectName() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();

        assertEquals(actual, validate);
    }

}