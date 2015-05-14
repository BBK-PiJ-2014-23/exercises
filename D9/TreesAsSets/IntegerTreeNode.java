public interface IntegerTreeNode {
    /**
     * 
     */
    void add(int newNumber);
    
    /**
     * 
     */
    boolean contains(int n);
    
    /**
     * 
     */
    boolean containsVerbose(int n);
    
    /**
     * 
     */
    int getMax();
    
    /**
     * 
     */
    int getMin();
    
    /**
     * 
     */
    String toString();
    
    /**
     * 
     */
    String toStringSimple();
    
    /**
     * 
     */
    String toStringComma();
    
    /**
     * 
     */
    int depth();
}