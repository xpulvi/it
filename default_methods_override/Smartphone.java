package it.default_methods_override;

import java.util.Objects;

public class Smartphone implements Cloneable {

    String brandName;
    String modelName;
    int batterymAh;
    SmartphonePrice producerPrice;
    SmartphonePrice retailPrice;

    @Override
    public String toString() {
        return "Smartphone{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", batterymAh=" + batterymAh +
                ", producerPrice=" + producerPrice +
                ", retailPrice=" + retailPrice +
                '}';
    }

    @Override
    // ma l'equals devo metere | perche nella lezione lo specalizava e non
    /*
    * */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batterymAh == that.batterymAh && Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    /*mattia: fai l'uni?
    *  ahhaha
    * */

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = this.producerPrice.clone();
        clonedSmartphone.retailPrice = this.retailPrice.clone();
        return clonedSmartphone;

    }


    public Smartphone(String brand,String model,int battery,SmartphonePrice prodP,SmartphonePrice retailP){
        brandName = brand;
        modelName = model;
        batterymAh = battery;
        producerPrice = prodP;
        retailPrice = retailP;
    }
}
