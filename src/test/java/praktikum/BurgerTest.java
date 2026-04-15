package praktikum;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BurgerTest {

    private Burger burger;
    private Bun bun;
    private Ingredient sauce;
    private Ingredient filling;

    @Before
    public void setUp() {
        burger = new Burger();

        bun = mock(Bun.class);
        when(bun.getName()).thenReturn("black bun");
        when(bun.getPrice()).thenReturn(100F);

        sauce = mock(Ingredient.class);
        when(sauce.getType()).thenReturn(IngredientType.SAUCE);
        when(sauce.getName()).thenReturn("hot sauce");
        when(sauce.getPrice()).thenReturn(50F);

        filling = mock(Ingredient.class);
        when(filling.getType()).thenReturn(IngredientType.FILLING);
        when(filling.getName()).thenReturn("cutlet");
        when(filling.getPrice()).thenReturn(70F);
    }

    @Test
    public void setBunsShouldSetBun() {
        burger.setBuns(bun);

        assertSame(bun, burger.bun);
    }

    @Test
    public void addIngredientShouldAddIngredientToList() {
        burger.addIngredient(sauce);

        assertEquals(1, burger.ingredients.size());
        assertSame(sauce, burger.ingredients.get(0));
    }

    @Test
    public void removeIngredientShouldRemoveIngredientFromList() {
        burger.addIngredient(sauce);
        burger.addIngredient(filling);

        burger.removeIngredient(0);

        assertEquals(1, burger.ingredients.size());
        assertSame(filling, burger.ingredients.get(0));
    }

    @Test
    public void moveIngredientShouldMoveIngredientToNewIndex() {
        Ingredient first = mock(Ingredient.class);
        Ingredient second = mock(Ingredient.class);
        Ingredient third = mock(Ingredient.class);

        burger.addIngredient(first);
        burger.addIngredient(second);
        burger.addIngredient(third);

        burger.moveIngredient(0, 2);

        List ingredients = burger.ingredients;
        assertSame(second, ingredients.get(0));
        assertSame(third, ingredients.get(1));
        assertSame(first, ingredients.get(2));
    }

    @Test
    public void getPriceShouldReturnCorrectPrice() {
        burger.setBuns(bun);
        burger.addIngredient(sauce);
        burger.addIngredient(filling);

        float actualPrice = burger.getPrice();

        assertEquals(320F, actualPrice, 0.0001F);
    }

    @Test
    public void getReceiptShouldReturnCorrectReceipt() {
        burger.setBuns(bun);
        burger.addIngredient(sauce);
        burger.addIngredient(filling);

        String actualReceipt = burger.getReceipt();

        String expectedReceipt = String.format(
                "(==== %s ====)%n" +
                        "= %s %s =%n" +
                        "= %s %s =%n" +
                        "(==== %s ====)%n" +
                        "%nPrice: %f%n",
                "black bun",
                "sauce", "hot sauce",
                "filling", "cutlet",
                "black bun",
                320F
        );

        assertEquals(expectedReceipt, actualReceipt);
    }
}