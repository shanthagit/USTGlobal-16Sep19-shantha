package com.ustglobal.productspringmvc.dao;


import java.util.List;

import com.ustglobal.productspringmvc.bean.OrderProduct;
import com.ustglobal.productspringmvc.bean.Product;
import com.ustglobal.productspringmvc.bean.User;

public interface Retailerdao {
	
	public User login(String email,String password);
	public boolean register(User user);
	public Product search(String pname);
	public boolean updatePassword(String email,String password);
	public List<OrderProduct> getProducts(String email);
	public boolean buyProduct(OrderProduct orderProduct);

}
