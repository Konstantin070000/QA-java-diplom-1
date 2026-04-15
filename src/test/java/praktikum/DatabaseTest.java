package praktikum;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DatabaseTest {

    private Database database;

    @Before
    public void setUp() {
        database = new Database();
    }

    @Test
    public void availableBunsShouldReturnThreeBuns() {
        List buns = database.availableBuns();

        assertEquals(3, buns.size());

        Bun firstBun = (Bun) buns.get(0);
        Bun secondBun = (Bun) buns.get(1);
        Bun thirdBun = (Bun) buns.get(2);

        assertEquals("black bun", firstBun.getName());
        assertEquals(100F, firstBun.getPrice(), 0.0001F);

        assertEquals("white bun", secondBun.getName());
        assertEquals(200F, secondBun.getPrice(), 0.0001F);

        assertEquals("red bun", thirdBun.getName());
        assertEquals(300F, thirdBun.getPrice(), 0.0001F);
    }

    @Test
    public void availableIngredientsShouldReturnSixIngredients() {
        List ingredients = database.availableIngredients();

        assertEquals(6, ingredients.size());

        Ingredient firstIngredient = (Ingredient) ingredients.get(0);
        Ingredient secondIngredient = (Ingredient) ingredients.get(1);
        Ingredient thirdIngredient = (Ingredient) ingredients.get(2);
        Ingredient fourthIngredient = (Ingredient) ingredients.get(3);
        Ingredient fifthIngredient = (Ingredient) ingredients.get(4);
        Ingredient sixthIngredient = (Ingredient) ingredients.get(5);

        assertEquals(IngredientType.SAUCE, firstIngredient.getType());
        assertEquals("hot sauce", firstIngredient.getName());
        assertEquals(100F, firstIngredient.getPrice(), 0.0001F);

        assertEquals(IngredientType.SAUCE, secondIngredient.getType());
        assertEquals("sour cream", secondIngredient.getName());
        assertEquals(200F, secondIngredient.getPrice(), 0.0001F);

        assertEquals(IngredientType.SAUCE, thirdIngredient.getType());
        assertEquals("chili sauce", thirdIngredient.getName());
        assertEquals(300F, thirdIngredient.getPrice(), 0.0001F);

        assertEquals(IngredientType.FILLING, fourthIngredient.getType());
        assertEquals("cutlet", fourthIngredient.getName());
        assertEquals(100F, fourthIngredient.getPrice(), 0.0001F);

        assertEquals(IngredientType.FILLING, fifthIngredient.getType());
        assertEquals("dinosaur", fifthIngredient.getName());
        assertEquals(200F, fifthIngredient.getPrice(), 0.0001F);

        assertEquals(IngredientType.FILLING, sixthIngredient.getType());
        assertEquals("sausage", sixthIngredient.getName());
        assertEquals(300F, sixthIngredient.getPrice(), 0.0001F);
    }
}