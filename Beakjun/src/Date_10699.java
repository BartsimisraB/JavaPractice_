import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date_10699 {
	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate Seoul = LocalDate.now(ZoneId.of("Asia/Seoul"));
		
		String formatedNow = Seoul.format(formatter);
		System.out.println(formatedNow);
	}
}
