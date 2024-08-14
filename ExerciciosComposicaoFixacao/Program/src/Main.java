import Entities.*;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dtfNascimento = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter Client Data: \n");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Date of Birth: ");
        Date birthDate = dtfNascimento.parse(sc.next());

        System.out.print("Enter Order Data: \n Status: ");
        String lixo = sc.nextLine();
        String orderStatus = sc.nextLine();
        System.out.print("How Many items to this order? : ");

        Client client = new Client(name, email, birthDate);
        Order pedido = new Order(OrderStatus.valueOf(orderStatus), client);

        int n = sc.nextInt();



        for(int i=0;i<n;i++){
            System.out.printf("Enter #%d item data:\n", i+1);
            String nameProduct = sc.nextLine();
            System.out.print("Product: ");
            String lixo2 = sc.nextLine();
            System.out.print("Product Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(nameProduct, price);
            OrderItem orderItem = new OrderItem(quantity, price, product);

            pedido.addItem(orderItem);
        }

        System.out.print(pedido.toString());


    }
}