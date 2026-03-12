import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Func;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 
        String path = "C:\\Users\\CARLOS\\Downloads\\itens.csv";
        ArrayList<Func> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            String line = br.readLine();
            line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Func(fields));
                line = br.readLine();
            }

        } catch (IOException e) {
            
            e.printStackTrace();
        }

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        list.stream()
            .filter(x -> x.getSalary() > salary)
            .map(x -> x.getEmail())
            .forEach(System.out::println);
        
        sc.close();
    }
    
}
