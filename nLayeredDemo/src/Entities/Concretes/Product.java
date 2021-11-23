package Entities.Concretes;

import Entities.Abstracts.Entitiy;

public class Product implements Entitiy{

    
    private int id,cateegoryId,unitsInStock;
    private String name;
    private double unitPrice;

        
    public Product()
    {

    }


    public Product(int id, int cateegoryId, int unitsInStock, String name, double unitPrice) {
        this.id = id;
        this.cateegoryId = cateegoryId;
        this.unitsInStock = unitsInStock;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCateegoryId() {
        return this.cateegoryId;
    }

    public void setCateegoryId(int cateegoryId) {
        this.cateegoryId = cateegoryId;
    }

    public int getUnitsInStock() {
        return this.unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }




    
}