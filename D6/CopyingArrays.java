public class CopyingArrays {
	public static void main(String[] args) {
		ArrayCopier arrayCopier = new ArrayCopier();
		
		int[] array1 = {1, 2, 3};
		int[] array2 = new int[3];
		arrayCopier.copy(array1, array2);
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		System.out.println();
		
		int[] array3 = new int [2];
		arrayCopier.copy(array1, array3);
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}
		System.out.println();
		
		int[] array4 = new int[5];
		arrayCopier.copy(array1, array4);
		for (int i = 0; i < array4.length; i++) {
			System.out.println(array4[i]);
		}
		System.out.println();
	}
}