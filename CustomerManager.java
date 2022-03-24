public class CustomerManager {

    public void add(Customer customer) {

        System.out.println("CostomerNumber : " + customer.getCustomerNumber());
        System.out.println("Id : "+customer.getId());


    }

    public void addMultiple(Customer[] customers) {

       for (Customer customer : customers) {
            add(customer);
        }
    }
}

