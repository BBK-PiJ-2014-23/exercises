public interface IntegerListNode {
    /**
     * 
     */
    void add(int newNumber);
    
    /**
     * 
     */
    int getValue();
    
    /**
     * 
     */
    void setNext(IntegerListNode next);
    
    /**
     * 
     */
    IntegerListNode getNext();
    
    /**
     * 
     */
    void addSorted(int newNumber);
    
    /**
     * 
     */
    boolean contains(int number);
    
    /**
     * 
     */
    boolean containsVerbose(int number);
    
    /**
     * 
     */
    String toString();
}