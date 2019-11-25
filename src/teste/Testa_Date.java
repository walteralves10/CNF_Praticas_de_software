package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Testa_Date {

    public static void main(String[] args) {
        String data = "23/11/2015";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataa = LocalDate.parse(data, formato);
        System.out.println(dataa);
        System.out.println("Data Agora: " + dataa);
    }
}
