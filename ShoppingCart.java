package shopping;

public class ShoppingCart {

	float Electronic(int f, int h) {

		float d = ((f + h) * 15 / 100);

		System.out.println("Gst of Electronic:" + d);
		return d;
	}

	float Clothing(int a) {

		float k = ((a * 8) / 100);

		System.out.println("Gst of Clothing:" + k);
		return k;
	}

	float Food(int s, int z) {

		float p = ((s + z) * 5 / 100);

		System.out.println("Gst  of  food :" + p);

		return p;

	}

	float finalprice(int f, int h, int a, int s, int z) {

		float elec = Electronic(f, h);
		float cloth = Clothing(a);
		float food = Food(s, z);
		float finalgst = (elec + cloth + food);
		float totalBaseprice = f + h + a + s + z;
		float finalprice = (totalBaseprice + finalgst);
		float w = finalprice * 25 / 100;
		System.out.println("final price = " + finalprice);
		System.out.println("with gst = " + w);
		return finalprice;
	}
}
