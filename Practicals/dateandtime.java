import java.text.SimpleDateFormat;
import java.util.Date;

public class dateandtime{
	public static void main(String arg[]){
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String str = sdf.format(d);
		System.out.println(str);
		
		sdf = new SimpleDateFormat("dd-MMMM-yyyy");
		str = sdf.format(d);
		System.out.println(str);

		sdf = new SimpleDateFormat("");
		str = sdf.format(d);
		System.out.println(str);

	}
}
