import org.example.GroceryItem;
import org.example.GroceryList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;


import static org.hamcrest.CoreMatchers.nullValue;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.MatcherAssert.assertThat;
public class GroceryListTest {


    GroceryItem vitamins;
    GroceryItem milk;
    GroceryItem creamer;
    GroceryList underTest;

    @BeforeEach
    public void setUp(){
        underTest = new GroceryList();
        vitamins = new GroceryItem("Vitamins", "Pharmacy", 5);
        milk = new GroceryItem("Milk", "Dairy", 4);
        creamer = new GroceryItem("creamer", "Dairy", 2);

    }

    @Test
    public void shouldBeAbleToAddandFindGrapesinOurGroceryList(){
        underTest.addItem(vitamins);
        GroceryItem itemToFind = underTest.findItem("Vitamins");
        assertThat(itemToFind, is(vitamins))
;    }

    @Test
    public void shouldBeAbleToGetAllItemsOnTheList(){
        underTest.addItem(vitamins);
        underTest.addItem(milk);
        underTest.addItem(creamer);
        Collection<GroceryItem> allItems = underTest.getAllItems();
        assertThat(allItems, containsInAnyOrder(vitamins, milk, creamer));
    }
    @Test
    public void shouldBeAbleToRemoveAnItemFromTheList(){
        underTest.addItem(vitamins);
        underTest.addItem(milk);
        underTest.removeItem("milk");
        GroceryItem itemToFind = underTest.findItem("milk");
        assertThat(itemToFind, is(nullValue()));

    }

    @Test
    public void shouldBeAbleToPlaceABulkSaleOnItemsInTheListByDepeartment(){
        underTest.addItem(vitamins);
        underTest.addItem(milk);
        underTest.addItem(creamer);
        underTest.applySale("Dairy", .25);
        assertThat(milk.getPrice(), is(3.0));
        assertThat(creamer.getPrice(), is(1.5) );
    }
}
