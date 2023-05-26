import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors


public class Component {
    private String manufactuer;
    private String Description;

    public String getManufactuer() {
        return manufactuer;
    }

    public void setManufactuer(String manufactuer) {
        this.manufactuer = manufactuer;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInterFace() {
        return interFace;
    }

    public void setInterFace(String interFace) {
        this.interFace = interFace;
    }

    private int price;
    private String productID;
    private String interFace;

    public Component(){

    }
    public void GenerateProdID(String catalogNum){
        // Appends X's in the case of manufacture name being too short
        productID = manufactuer;
        if(productID.length() < 4){
            while (productID.length() < 4){
                productID = productID + "X";
           }
        }

            productID = productID + catalogNum;
            productID = productID.toUpperCase();

    }
}
