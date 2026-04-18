package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunTest {

    private final String name;
    private final float price;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][]{
                {"black bun", 100F},
                {"white bun", 200F},
                {"red bun", 300F}
        });
    }

    @Test
    public void bunConstructorShouldSetNameCorrectly() {
        Bun bun = new Bun(name, price);

        assertEquals(name, bun.getName());
    }

    @Test
    public void bunConstructorShouldSetPriceCorrectly() {
        Bun bun = new Bun(name, price);

        assertEquals(price, bun.getPrice(), 0.0001F);
    }
}