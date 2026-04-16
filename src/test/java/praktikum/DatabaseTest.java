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
    }

    @Test
    public void availableBunsShouldReturnBlackBunName() {
        List buns = database.availableBuns();
        Bun firstBun = (Bun) buns.get(0);

        assertEquals("black bun", firstBun.getName());
    }

    @Test
    public void availableBunsShouldReturnBlackBunPrice() {
        List buns = database.availableBuns();
        Bun firstBun = (Bun) buns.get(0);

        assertEquals(100F, firstBun.getPrice(), 0.0001F);
    }

    @Test
    public void availableBunsShouldReturnWhiteBunName() {
        List buns = database.availableBuns();
        Bun secondBun = (Bun) buns.get(1);

        assertEquals("white bun", secondBun.getName());
    }

    @Test
    public void availableBunsShouldReturnWhiteBunPrice() {
        List buns = database.availableBuns();
        Bun secondBun = (Bun) buns.get(1);

        assertEquals(200F, secondBun.getPrice(), 0.0001F);
    }

    @Test
    public void availableBunsShouldReturnRedBunName() {
        List buns = database.availableBuns();
        Bun thirdBun = (Bun) buns.get(2);

        assertEquals("red bun", thirdBun.getName());
    }

    @Test
    public void availableBunsShouldReturnRedBunPrice() {
        List buns = database.availableBuns();
        Bun thirdBun = (Bun) buns.get(2);

        assertEquals(300F, thirdBun.getPrice(), 0.0001F);
    }

    @Test
    public void availableIngredientsShouldReturnSixIngredients() {
        List ingredients = database.availableIngredients();

        assertEquals(6, ingredients.size());
    }

    @Test
    public void availableIngredientsShouldReturnFirstIngredientType() {
        List ingredients = database.availableIngredients();
        Ingredient firstIngredient = (Ingredient) ingredients.get(0);

        assertEquals(IngredientType.SAUCE, firstIngredient.getType());
    }

    @Test
    public void availableIngredientsShouldReturnFirstIngredientName() {
        List ingredients = database.availableIngredients();
        Ingredient firstIngredient = (Ingredient) ingredients.get(0);

        assertEquals("hot sauce", firstIngredient.getName());
    }

    @Test
    public void availableIngredientsShouldReturnFirstIngredientPrice() {
        List ingredients = database.availableIngredients();
        Ingredient firstIngredient = (Ingredient) ingredients.get(0);

        assertEquals(100F, firstIngredient.getPrice(), 0.0001F);
    }

    @Test
    public void availableIngredientsShouldReturnSecondIngredientType() {
        List ingredients = database.availableIngredients();
        Ingredient secondIngredient = (Ingredient) ingredients.get(1);

        assertEquals(IngredientType.SAUCE, secondIngredient.getType());
    }

    @Test
    public void availableIngredientsShouldReturnSecondIngredientName() {
        List ingredients = database.availableIngredients();
        Ingredient secondIngredient = (Ingredient) ingredients.get(1);

        assertEquals("sour cream", secondIngredient.getName());
    }

    @Test
    public void availableIngredientsShouldReturnSecondIngredientPrice() {
        List ingredients = database.availableIngredients();
        Ingredient secondIngredient = (Ingredient) ingredients.get(1);

        assertEquals(200F, secondIngredient.getPrice(), 0.0001F);
    }

    @Test
    public void availableIngredientsShouldReturnThirdIngredientType() {
        List ingredients = database.availableIngredients();
        Ingredient thirdIngredient = (Ingredient) ingredients.get(2);

        assertEquals(IngredientType.SAUCE, thirdIngredient.getType());
    }

    @Test
    public void availableIngredientsShouldReturnThirdIngredientName() {
        List ingredients = database.availableIngredients();
        Ingredient thirdIngredient = (Ingredient) ingredients.get(2);

        assertEquals("chili sauce", thirdIngredient.getName());
    }

    @Test
    public void availableIngredientsShouldReturnThirdIngredientPrice() {
        List ingredients = database.availableIngredients();
        Ingredient thirdIngredient = (Ingredient) ingredients.get(2);

        assertEquals(300F, thirdIngredient.getPrice(), 0.0001F);
    }

    @Test
    public void availableIngredientsShouldReturnFourthIngredientType() {
        List ingredients = database.availableIngredients();
        Ingredient fourthIngredient = (Ingredient) ingredients.get(3);

        assertEquals(IngredientType.FILLING, fourthIngredient.getType());
    }

    @Test
    public void availableIngredientsShouldReturnFourthIngredientName() {
        List ingredients = database.availableIngredients();
        Ingredient fourthIngredient = (Ingredient) ingredients.get(3);

        assertEquals("cutlet", fourthIngredient.getName());
    }

    @Test
    public void availableIngredientsShouldReturnFourthIngredientPrice() {
        List ingredients = database.availableIngredients();
        Ingredient fourthIngredient = (Ingredient) ingredients.get(3);

        assertEquals(100F, fourthIngredient.getPrice(), 0.0001F);
    }

    @Test
    public void availableIngredientsShouldReturnFifthIngredientType() {
        List ingredients = database.availableIngredients();
        Ingredient fifthIngredient = (Ingredient) ingredients.get(4);

        assertEquals(IngredientType.FILLING, fifthIngredient.getType());
    }

    @Test
    public void availableIngredientsShouldReturnFifthIngredientName() {
        List ingredients = database.availableIngredients();
        Ingredient fifthIngredient = (Ingredient) ingredients.get(4);

        assertEquals("dinosaur", fifthIngredient.getName());
    }

    @Test
    public void availableIngredientsShouldReturnFifthIngredientPrice() {
        List ingredients = database.availableIngredients();
        Ingredient fifthIngredient = (Ingredient) ingredients.get(4);

        assertEquals(200F, fifthIngredient.getPrice(), 0.0001F);
    }

    @Test
    public void availableIngredientsShouldReturnSixthIngredientType() {
        List ingredients = database.availableIngredients();
        Ingredient sixthIngredient = (Ingredient) ingredients.get(5);

        assertEquals(IngredientType.FILLING, sixthIngredient.getType());
    }

    @Test
    public void availableIngredientsShouldReturnSixthIngredientName() {
        List ingredients = database.availableIngredients();
        Ingredient sixthIngredient = (Ingredient) ingredients.get(5);

        assertEquals("sausage", sixthIngredient.getName());
    }

    @Test
    public void availableIngredientsShouldReturnSixthIngredientPrice() {
        List ingredients = database.availableIngredients();
        Ingredient sixthIngredient = (Ingredient) ingredients.get(5);

        assertEquals(300F, sixthIngredient.getPrice(), 0.0001F);
    }
}