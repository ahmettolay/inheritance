public class Main {

    public static void main(String[] args) {
        IdividualCustomer engin = new IdividualCustomer();
        engin.setCustomerNumber("12345000");
        engin.getId();


        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.setCustomerNumber("678901");
        engin.getId();

        VakifCustomer vefa = new VakifCustomer();
        vefa.setCustomerNumber("9999900000");
        vefa.getId();

        CustomerManager customerManager = new CustomerManager();

        customerManager.add(vefa);
        customerManager.add(hepsiBurada);
        customerManager.add(engin);


        System.out.println("----------------------------------------------------------");

        Customer[] customers = {engin, vefa, hepsiBurada};
        customerManager.addMultiple(customers);


    }
}
