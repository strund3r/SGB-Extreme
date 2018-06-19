package helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversorData {
    public static Date toDate(String dateText) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return new java.sql.Date(format.parse(dateText).getTime());
    }
    
    public static String formatDate(Date date) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");   
        return formato.format(date); 
    }
    
    public static Date toDateLer(String dateText) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return new java.sql.Date(format.parse(dateText).getTime());
    }
}