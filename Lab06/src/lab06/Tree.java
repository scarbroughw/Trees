/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;



/**
 *
 * @author Bill Scarbrough
 * @param <E>
 */
public class Tree<E extends Comparable<E>> {
    
    private BTNode<E> root;
    private int numElements;
    
    
    public Tree(){
        root = null;
        numElements = 0;
    }
    
    public void add(E element){
        
        numElements++;
        
        if(root == null)
            root = new BTNode<>(element,null,null);
        
        else{
            
            BTNode<E> cursor = root;
            
            cursor.setRight(new BTNode<>(element,null,null));
            boolean done = false;
        
            while(!done){
                // If the new element is less than or equal to data at cursor
                if(element.compareTo(cursor.getData())<=0){
                    // If left link is null
                    if(cursor.getLeft() == null){
                        cursor.setLeft(new BTNode<>(element,null,null));
                        done = true;
                    }
                    else
                        cursor = cursor.getLeft();
                    
                }
                else{
                    if(cursor.getRight() == null){
                        cursor.setRight(new BTNode<>(element,null,null));
                        done = true;
                    }
                    else
                        cursor = cursor.getRight();
                }
            }
        }
        
    }
    
    public int size(){
        return numElements;
    }
    
    public void inOrderPrint(){
        
        if(root != null){
            root.inOrderPrint();
        }
    }
}
