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
public class BTNode<E> {

    /**
     * @param args the command line arguments
     */
    private final E data;
    private final BTNode<E> left;
    private final BTNode<E> right;
    
    public BTNode(E newData,BTNode<E> newLeft, BTNode<E> newRight){
        this.data = newData;
        this.left = newLeft;
        this.right = newRight;
    }
    
    public E getData(){
        return data;
    }
    
    public BTNode<E> getLeft(){
        return left;
    }
    
    public BTNode<E> getRight(){
        return right;
    }
    
    public void inOrderPrint(){
        if(left != null)
            left.inOrderPrint();
        System.out.println(data);
        if(right != null)
            right.inOrderPrint();
    }
    
    public void setData(E newData){
        newData = data;
    }
    
    public void setLeft(BTNode<E> newLeft){
        newLeft = left;
    }
    
    public void setRight(BTNode<E> newRight){
        newRight = right;
    }
    
    
}
