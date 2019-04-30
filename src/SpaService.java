public class SpaService
{
    private String serviceDescription;
    private double price;

    public void setServiceDescription(String service){
        service = service;
    }
    public  SpaService(){
        serviceDescription = "XXX";
        price = 0;
    }
    public void setPrice(double pr){
        price = pr;
}
    public String getServiceDescription(){
        return serviceDescription;
    }
    public double getPrice(){
        return price;
    }

}
