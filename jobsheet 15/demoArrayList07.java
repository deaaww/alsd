import java.util.ArrayList;

public class demoArrayList07 {
    public static void main(String[] args) {

        ArrayList<customer07> customers = new ArrayList<>(2);

        customer07 customer1 = new customer07(1, "Zakia");
        customer07 customer2 = new customer07(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new customer07(4, "Cica")); //langkah 4

        customers.add(new customer07(100, "Rosa")); //langkah 6, penghapusan angka 2 di langkah 10

        System.out.println(customers.indexOf(customer2)); //langkah 8

        customer07 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo"; //Langkah 9

        ArrayList<customer07> newCustomers = new ArrayList<>();
        newCustomers.add(new customer07(201, "Della"));
        newCustomers.add(new customer07(202, "Victor"));
        newCustomers.add(new customer07(203, "Sarah")); //langkah 11

        customers.addAll(newCustomers);//langkah 11

        for (customer07 cust : customers) {
            System.out.println(cust.toString());
        }

        /*langkah 12 pengecekan data proses debugging lebih sederhana dari System.out.println(cust.toString()); adalah 
        System.out.println(customers);*/
    }
}