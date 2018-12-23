package SamouczekPTesty;

import static org.junit.Assert.assertEquals;

import Testy_jednostkowe.Basket;
import org.junit.Before;
import org.junit.Test;

import java.util.*;


public class BasketTest {

    private static final double PRICE_DELTA = 0.001;

    private Basket basket;

    @Before
    public void setUp() {
        basket = new Basket();
    }

    @Test
    public void shouldAllowToAddOneItemToBasket() {
        basket.addItem("Book", 1, 4.58);


        Map<String, List<Double>> expected = createOrder("Book", 1, 4.58);
        assertEquals(expected, basket.getOrderedItems());
    }

    @Test
    public void shouldAllowToAddManyItemsToBasket(){
        basket.addItem("Book", 24, 4.59);

        Map<String, List<Double>> expected = createOrder("Book", 24, 4.59);
        assertEquals(expected, basket.getOrderedItems());
    }

    @Test
    public void shouldAllowToAddTwiceSameItem(){
        basket.addItem("Book", 4, 2.39);
        basket.addItem("Book", 2, 2.93);

        Map<String, List<Double>> expected = createOrder("Book", 6, 2.93);

        assertEquals(expected, basket.getOrderedItems());

    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToAddEmptyItem() {
        basket.addItem("Book", 0, 4.58);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToAddItemWithMinusAmount(){
        basket.addItem("Book", -1, 4.58);
    }

    @Test
    public void shouldAllowToAddOneItemWithZeroPrice(){
        basket.addItem("Book", 1, 0);

        Map<String, List<Double>> expected = createOrder("Book", 1, 0);
        assertEquals(expected, basket.getOrderedItems());
    }

    @Test
    public void shouldAllowToAddManyItemsWithZeroPrice(){
        basket.addItem("Book", 483, 0);

        Map<String, List<Double>> expected = createOrder("Book", 483, 0);
        assertEquals(expected, basket.getOrderedItems());
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToAddOneItemWithMinusLowPrice(){
        basket.addItem("Book", 1, -0.01);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToAddManyItemsWithMinusLowPrice(){
        basket.addItem("Book", 59, -0.01);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToAddManyItemsWithMinusHighPrice(){
        basket.addItem("Book", 59, -457);
    }

    @Test
    public void shouldAllowToDeleteOneItem(){
        basket.addItem("Book", 2, 1);
        basket.deleteItem("Book", 1);

        Map<String, List<Double>> expected = createOrder("Book", 1, 1);
        assertEquals(expected, basket.getOrderedItems());
    }

    @Test
    public void shouldAllowToDeleteManyItems(){
        basket.addItem("Book", 4, 1);
        basket.deleteItem("Book", 3);

        Map<String, List<Double>> expected = createOrder("Book", 1, 1);
        assertEquals(expected, basket.getOrderedItems());
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToDeleteZeroItems(){
        basket.addItem("Book", 1, 1);
        basket.deleteItem("Book", 0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToDeleteOneMinusItem(){
        basket.addItem("Book", 1, 1);
        basket.deleteItem("Book", -1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToDeleteManyMinusItem(){
        basket.addItem("Book", 1, 1);
        basket.deleteItem("Book", -23);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToDeleteOneItemIsNotExist(){
        basket.deleteItem("Hey", 1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToDeleteManyItemsIsNotExist(){
        basket.deleteItem("Hat", 34);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToDeleteZeroItemIsNotExist(){
        basket.deleteItem("Hat", 0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToDeleteMinusOneItemsIsNotExist(){
        basket.deleteItem("Hat", -1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToDeleteMinusManyItemsIsNotExist(){
        basket.deleteItem("Hat", -34);
    }

    @Test
    public void shouldRemoveAllItems(){
        basket.addItem("Book", 1, 1);
        basket.deleteItem("Book", 1);

        Map<String, List<Double>> expected = Collections.emptyMap();
        assertEquals(expected, basket.getOrderedItems());
    }

    @Test
    public void shouldRemoveAllItemIfWantRemoveOneMoreThenExist(){
        basket.addItem("Book", 1, 1);
        basket.deleteItem("Book", 2);

        Map<String, List<Double>> expected = Collections.emptyMap();
        assertEquals(expected, basket.getOrderedItems());
    }

    @Test
    public void shouldRemoveAllItemIfWantRemoveManyMoreThenExist(){
        basket.addItem("Book", 1, 1);
        basket.deleteItem("Book", 45);

        Map<String, List<Double>> expected = Collections.emptyMap();
        assertEquals(expected, basket.getOrderedItems());
    }

    @Test
    public void shouldComputeOneOrder(){
        basket.addItem("Book", 1, 34);

        double expexted = 34;
        assertEquals(expexted, basket.summaryBasket(), PRICE_DELTA);
    }

    @Test
    public void shouldComputeManyOrdersSameItem(){
        basket.addItem("Book", 23, 34.94);

        double expected = 803.62;
        assertEquals(expected,basket.summaryBasket(), PRICE_DELTA);
    }

    @Test
    public void shouldComputeManyOrdersManyItems(){
        basket.addItem("Book", 25, 95.38);
        basket.addItem("Bike", 25, 43.54);
        basket.addItem("Mobile", 95, 85.23);

        double expected = 11569.85;
        assertEquals(expected, basket.summaryBasket(), PRICE_DELTA);

    }

    @Test
    public void shouldAllowToPrintSummary(){
        basket.addItem("Book", 25, 95.38);

        StringBuilder expected = new StringBuilder();
        expected.append("Book (25,00x 95,38 = 2384,50)");
        expected.append(System.lineSeparator());
        expected.append("Summary order is: 2384,50 zł.");

        assertEquals(expected.toString(), basket.toString());
    }

//    @Test
//    public void shouldAllowToPrintSummaryManyItemsSameNameDiffrentPrice(){
//        basket.addItem("Book", 25, 95.38);
//        basket.addItem("Book", 43, 23.43);
//
//        StringBuilder expected = new StringBuilder();
//
//        expected.append("Book (25,00x 95,38 = 2384,50)");
//        expected.append(System.lineSeparator());
//        expected.append("Book (43,00x 23,43 = 1007,49)");
//        expected.append(System.lineSeparator());
//        expected.append(("Summary order is: 3391,99 zł."));
//
//        assertEquals(expected.toString(), basket.toString());
//    }

    private static Map<String, List<Double>> createOrder(String name, double quantity, double price) {
        Map<String, List<Double>> result = new HashMap<>();

        List<Double> list = new LinkedList<>();

        list.add(quantity);
        list.add(price);

        result.put(name, list);

        return result;
    }

}