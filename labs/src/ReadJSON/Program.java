package ReadJSON;

import com.google.gson.Gson;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Program {
    public static void main(String[] args) throws Exception{

        Gson gson = new Gson();

        String fileName = "C:\\Users\\cooda\\IdeaProjects\\practice\\labs\\src\\resc\\customers.json";

        String content = new String(Files.readAllBytes(Paths.get(fileName)));

        Customer [] customers = gson.fromJson(content, Customer[].class);

        for(Customer cus : customers){
            System.out.println(cus.CustomerID + " " + cus.Country);

        }

    }
}
