public class Component {
    private String manufactuer;
    private String Description;
    private int price;
    private String productID;
    private String interFace;


    public void GenerateProdID(String catalogNum){
        // Appends X's in the case of manufacture name being too short
        productID = manufactuer;
        if(productID.length() < 4){
            while (productID.length() < 4){
                productID = productID + "X";
           }
        }

            productID = productID + catalogNum;
            productID.toUpperCase();

    }
}
