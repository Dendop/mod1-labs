package lab14;

import java.util.List;

public class Program {
    public static void main(String[] args){

        String myfile = "C:\\Users\\cooda\\IdeaProjects\\practice\\labs\\src\\lab14\\customers.json";

        try
        {
            //read
            List<Customer> customers = JSONReader.readCustomer(myfile);

            //target city
            String targetCity = "London";
            //created obj
            List<Customer> filteredCustomers = CustomerFilter.filterByCity(customers, targetCity);

            System.out.println("Customers in " + targetCity + ":");
            filteredCustomers.forEach(customer -> System.out.println(customer.getName() + " (ID: " + customer.getId() + ")"));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
