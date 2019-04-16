import java.util.UUID;

public class Tst1 {
	public static void main(String[] args) {

		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
		String uuid1 = UUID.randomUUID().toString().replace("-", "").toLowerCase();
		System.out.println(uuid1);
		String uuid2 = UUID.randomUUID().toString().replace("-", "").toUpperCase();
		System.out.println(uuid2);
	}

}
