package lab06;


/**
            USING NETBEANS?  ADD PACKAGE STATEMENT
*/




/**
    Programmed by   Stephen Brower
    Date Written:    4/9/2013
    Date Modified    7/23/2013 - renamed to Lab 9
                     4/2/2014  - renamed to lab 8
                     4/6/2015  - renamed to lab 10
                               - changed print to inOrderPrint
                     3/30/2016 - added NetBeans and Lab 6 comments

    Note - The Tree is the Tree<E> you create for Lab 6
*/
public class TestTreePart1WithString
{
    public static void main(String[] args)
    {
        Tree<String> myTree = new Tree<>();
        String stringToAdd;

        System.out.println("Before adds, Tree: (Size == "+myTree.size()+")");

        stringToAdd = "Mango";
        myTree.add(stringToAdd);
        System.out.println("After adding <"+stringToAdd+"> Tree: (Size == "+myTree.size()+")");

        stringToAdd = "Grapefruit";
        myTree.add(stringToAdd);
        System.out.println("After adding <"+stringToAdd+"> Tree: (Size == "+myTree.size()+")");

        stringToAdd = "Pomegranate";
        myTree.add(stringToAdd);
        System.out.println("After adding <"+stringToAdd+"> Tree: (Size == "+myTree.size()+")");

        stringToAdd = "Watermellon";
        myTree.add(stringToAdd);
        System.out.println("After adding <"+stringToAdd+"> Tree: (Size == "+myTree.size()+")");

        stringToAdd = "Lemon";
        myTree.add(stringToAdd);
        System.out.println("After adding <"+stringToAdd+"> Tree: (Size == "+myTree.size()+")");

        stringToAdd = "Orange";
        myTree.add(stringToAdd);
        System.out.println("After adding <"+stringToAdd+"> Tree: (Size == "+myTree.size()+")");

        stringToAdd = "Apple";
        myTree.add(stringToAdd);
        System.out.println("After adding <"+stringToAdd+"> Tree: (Size == "+myTree.size()+")");


        System.out.println("\nTree after adds (Size == "+myTree.size()+")");
        myTree.inOrderPrint(); // that method will call root.inOrderPrint();

    }
}

/* Output is:
Before adds, Tree: (Size == 0)
After adding <Mango> Tree: (Size == 1)
After adding <Grapefruit> Tree: (Size == 2)
After adding <Pomegranate> Tree: (Size == 3)
After adding <Watermellon> Tree: (Size == 4)
After adding <Lemon> Tree: (Size == 5)
After adding <Orange> Tree: (Size == 6)
After adding <Apple> Tree: (Size == 7)

Tree after adds (Size == 7)
Apple
Grapefruit
Lemon
Mango
Orange
Pomegranate
Watermellon
*/