import java.util.ArrayList;

public class OddSum {
	
	public static void main(String[] args) {
		ArrayList<Integer> listInt = new ArrayList<>();
		int res;
		
		System.out.println("Liste des élements :");
		for (String v : args)
			System.out.print(" " + v);
		
		System.out.println();
		for (int i = 0; i < args.length; i++)
			listInt.add(Integer.parseInt(args[i]));
		
		res = sum(listInt);
		System.out.println("La somme des élements impaires est : " + res);
		System.out.println("FIN !!");
	}
	
    public static int sum(ArrayList<Integer> listInt) {
        int result = 0;
        for (int value : listInt) {
            if (value % 2 != 0) {
                result += value;
            }
        }
        return result;
    }
}
