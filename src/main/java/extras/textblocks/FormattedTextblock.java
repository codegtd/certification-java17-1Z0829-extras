package extras.textblocks;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class FormattedTextblock {
  public static void main(String[] args) {

    Locale locale = new Locale("fr", "FR");
    DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
    String date = dateFormat.format(new Date());

       String output = """
       Name: %s
      Phone: %s
     Date: %s
    """.formatted("name", "phone", date);

    System.out.println(output);

  }
}