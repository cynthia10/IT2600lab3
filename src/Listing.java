public class Listing {
    private String name;
    private String address;
    private String number;
    public Listing()
    {
        name="";
        number="";
        address="";

    }
    public Listing (String n,String a, String num)
    {
        name=n;
        address=a;
        number=num;

    }
    public String toString()
    {
           return ("name is"+ " :"+ name + " ," + "addres is" + " :" + address +  " ,"+ "number is " +" :" + number );

    }
    public Listing deepCopy()
    {
        Listing clone = new Listing(name,address,number);
        return clone;
    }
}
