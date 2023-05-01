package part1;

class Item{

    /*
    public String itemName;
    public double itemPrice;

     */

    private String itemName;
    private String itemPrice;

    public String getItemName(){
        if(itemName == null){
            throw new RuntimeException("Item name has not ben set");
        }
        return itemName;
    }

    public void setItemName(String itemName){
        if(itemName.isBlank() || itemName.isEmpty()){
            throw new RuntimeException("Item name can not be blank or empty");
        }
       this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }



}

public class EncapsulationPractice {

    public static void main(String[] args) {

        Item item1 = new Item();
        item1.setItemName("    ");
        System.out.println(item1.getItemName());

    }


}
