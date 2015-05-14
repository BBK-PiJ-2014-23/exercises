public interface IntegerTreeNode {
    /**
     * 
     */
    int getValue();
    
    /**
     * 
     */
    IntegerTreeNode getLeft();
    
    /**
     * 
     */
    IntegerTreeNode getRight();
    
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
    int depth();
    
    /**
     * 
     */
    boolean remove(int number);
    
    /**
     * 
     */
    void rebalance();
    
    /**
     * 
     */
    int countNodes();
}
