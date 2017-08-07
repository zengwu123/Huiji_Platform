package cn.itcast.shop.cart.vo;

import java.io.Serializable;
import cn.itcast.shop.product.vo.Product;

public class CartItem implements Serializable {
     private Product product;
     private int count;
     private double subtotal;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	
     
}
