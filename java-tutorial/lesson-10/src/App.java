
public class App {
public static void main(String[] args) {
	
	
	
	int[] values;
	
	values = new int[3];
	
	values[0] = 10;
	values[1] = 20;
	values[2] = 300000;
	
//	System.out.println(values[0]);
//	System.out.println(values[1]);
//	System.out.println(values[2]);
	
	for(int i = 0; i<values.length; i++) {
		System.out.println(values[i]);
	}

	int[] numbers = {5, 6, 7};
	for(int i = 0; i<numbers.length; i++) {
		System.out.println(numbers[i]);
}
	
	int[] numbers2;
	numbers2 = new int[3];
	numbers2[0] = 2000;
	numbers2[1] = 30000;
	numbers2[2] = 500000;
	
	for(int i = 0; i<numbers2.length; i++) {
		System.out.println(numbers2[i]);
}
}
}