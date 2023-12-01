package ru.anka.lesson3.cw;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {
    private Cart cart;
    private Product product1;
    private Product product2;

    @BeforeEach
    void setUp() {
        cart = new Cart();
        product1 = new Product("Apple", 999, 3);
        product2 = new Product("Banana", 999.55, 3);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addProduct() {
        cart.addProduct(product1);
        cart.addProduct(product2);
        assertEquals(2, cart.getProducts().size());
    }

    @Test
    void removeProduct() {
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.removeProduct(product1);
        cart.removeProduct(product2);
        assertEquals(0, cart.getProducts().size());
    }

    @Test
    void calculateTotalPrice() {
        cart.addProduct(product1);
        cart.addProduct(product2);
        double totalSum = cart.calculateTotalPrice();
        assertEquals(5995.65, totalSum, .01);
    }
}
