/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import persistence.ControlPersistence;

/**
 *
 * @author Usuario
 */
public class ControlProduct {
    ControlPersistence controlPersis = new ControlPersistence();
    
    public void addProduct(Product prod){
        controlPersis.addProduct(prod);
    }
    
    public void deleteProduct(int id_eliminar){
        controlPersis.deleteProduct(id_eliminar);
    }
    
    public Product getProduct(int id_editar){
        return controlPersis.getProduct(id_editar);
    }
    
    public void editProduct(Product prod){
        controlPersis.editProduct(prod);
    }
    
    public List<Product> getAllProduct() {
    return controlPersis.getAllProduct();
    }
}
