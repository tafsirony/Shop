/**
 * Created by user on 04/04/17.
 */
public class Supplier{
    public String supplierName;
    //public String supplierID;

    public Supplier(String supplierName, String supplierID) {
        this.supplierName = supplierName;
        //this.supplierID = supplierID;
    }

    public String getSupplierName(){
        return supplierName;
    }
    public void setSupplierName(String supplierName){
        this.supplierName = supplierName;
    }


}
