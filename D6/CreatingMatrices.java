public class CreatingMatrices {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 2);
        matrix.prettyPrint();
        
        matrix.setElement(4, 1, 9);
        //matrix.prettyPrint();
        
        matrix.setElement(2, 4, 9);
        //matrix.prettyPrint();
        
        matrix.setElement(2, 1, 9);
        matrix.prettyPrint();
        
        matrix.setRow(4, "7,8");
        //matrix.prettyPrint();
        
        matrix.setRow(4, "7,8,9");
        //matrix.prettyPrint();
        
        matrix.setRow(1, "7,8");
        matrix.prettyPrint();
        
        matrix.setColumn(4, "4,5,6");
        //matrix.prettyPrint();
        
        matrix.setColumn(0, "4,5,6,7");
        //matrix.prettyPrint();
        
        matrix.setColumn(0, "4,5,6");
        matrix.prettyPrint();
        
        System.out.print(matrix.toString());
        System.out.println();
        
        Matrix matrix2 = new Matrix(3, 3);
        matrix2.setElement(1, 0, 9);
        matrix2.prettyPrint();
        System.out.println("This matrix is symmetrical? " + matrix2.isSymmetrical());
        System.out.println("This matrix is triangular? " + matrix2.isTriangular());
        System.out.println();
        
        matrix2.setElement(1, 0, 1);
        matrix2.prettyPrint();
        System.out.println("This matrix is symmetrical? " + matrix2.isSymmetrical());
        System.out.println("This matrix is triangular? " + matrix2.isTriangular());
        System.out.println();
        
        
        matrix2.setElement(0, 1, 0);
        matrix2.setElement(0, 2 , 0);
        matrix2.setElement(1, 2, 0);
        matrix2.prettyPrint();
        System.out.println("This matrix is symmetrical? " + matrix2.isSymmetrical());
        System.out.println("This matrix is triangular? " + matrix2.isTriangular());
        System.out.println();
        
        Matrix matrix3 = new Matrix(3, 3);
        matrix3.setMatrix("10,222,3;434,5,6;743,8,23");
        matrix3.prettyPrint();
        
        
        
        
    }
}