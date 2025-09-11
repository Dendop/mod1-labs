package lab14;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class JSONReader {
    public static List<Customer> readCustomer(String filePath) throws IOException {
        Gson gson = new Gson();


        Type customerListType = new TypeToken<List<Customer>>(){}.getType();

        try(FileReader reader = new FileReader(filePath)){
            return gson.fromJson(reader, customerListType);
        }
    }
}
