package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IngredientTypeTest {

    @Test
    public void ingredientTypeShouldContainTwoValues() {
        IngredientType[] values = IngredientType.values();

        assertEquals(2, values.length);
    }

    @Test
    public void ingredientTypeFirstValueShouldBeSauce() {
        IngredientType[] values = IngredientType.values();

        assertEquals(IngredientType.SAUCE, values[0]);
    }

    @Test
    public void ingredientTypeSecondValueShouldBeFilling() {
        IngredientType[] values = IngredientType.values();

        assertEquals(IngredientType.FILLING, values[1]);
    }
}