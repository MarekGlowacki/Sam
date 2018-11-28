package Testy_jednostkowe;


import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class BasketTest {

    private Basket basket;

    @Before
    public void setUp() {
        basket = new Basket();
    }

    @Test
    public void shouldAllowToAddItemToBasket() {
        basket.addItem("Book", 3, 4.58);


        Map<String, List<Double>> expected = createOrder("Book", 3, 4.58);
        assertEquals(expected, basket.getOrderedItems());
    }

//    @After
//    public void clearMap(){
//        basket.removeMap();
//    }

    @Test
    public void shouldAllowToAddTwiceSameItem(){
        basket.addItem("Book", 4, 2.39);
        basket.addItem("Book", 2, 2.93);

        Map<String, List<Double>> expected = createOrder("Book", 6, 2.93);

        assertEquals(expected, basket.getOrderedItems());

    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToAddEmptyItem(){
        basket.addItem("Book", 0, 4.58);
    }


    private static Map<String, List<Double>> createOrder(String name, double quantity, double price) {
        Map<String, List<Double>> result = new HashMap<>();

        List<Double> list = new LinkedList<>();

        list.add(quantity);
        list.add(price);

        result.put(name, list);

        return result;
    }

}