package com.hibernate.hibernatebiddingschemamapping;
// Generated Feb 1, 2018 1:11:28 PM by Hibernate Tools 4.3.1



/**
 * BuyerBuyProductId generated by hbm2java
 */
public class BuyerBuyProductId  implements java.io.Serializable {


     private int buyerId;
     private int productId;

    public BuyerBuyProductId() {
    }

    public BuyerBuyProductId(int buyerId, int productId) {
       this.buyerId = buyerId;
       this.productId = productId;
    }
   
    public int getBuyerId() {
        return this.buyerId;
    }
    
    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BuyerBuyProductId) ) return false;
		 BuyerBuyProductId castOther = ( BuyerBuyProductId ) other; 
         
		 return (this.getBuyerId()==castOther.getBuyerId())
 && (this.getProductId()==castOther.getProductId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getBuyerId();
         result = 37 * result + this.getProductId();
         return result;
   }   


}


