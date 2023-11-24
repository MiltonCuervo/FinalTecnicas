/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;
import persistence.exceptions.NonexistentEntityException;

/**
 *
 * @author Usuario
 */
public class ControlPersistence {
    ProductJpaController prodJpa = new ProductJpaController();
    
    public void addProduct(Product prod){
        prodJpa.create(prod);
    }
    
    public void deleteProduct(int id_eliminar){
        try {
            prodJpa.destroy(id_eliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControlPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Product getProduct(int id_editar){
        return prodJpa.findProduct(id_editar);
    }
    
    public void editProduct(Product prod){
        try {
            prodJpa.edit(prod);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Product> getAllProduct() {
    return prodJpa.findProductEntities();
    }
}
