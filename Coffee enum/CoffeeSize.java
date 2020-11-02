/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coffee;

/**
 *
 * @author Kunal
 */
public enum CoffeeSize {
    SMALL(3),
    MEDIUM(5),
    LARGE(7);

    CoffeeSize(int price) {
        this.price = price;
    }

    private int price;

    public int getPrice() {
        return price;
    }
}
