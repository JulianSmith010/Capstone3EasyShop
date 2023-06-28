package org.yearup.data;

import org.yearup.models.ShoppingCart;

public interface ShoppingCartDao
{
    ShoppingCart getByUserId(int userId);

    int getIdByUsername(String username);

    void clearCart(int userId);

    void updateProductInCart(int userId, int productId, int quantity);

    void create(ShoppingCart shoppingCart);

    void update(ShoppingCart shoppingCart);

    void delete(int userId);

    void addProductToCart(int userId, int productId);
    // add additional method signatures here
}
