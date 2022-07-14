package com.example.project;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstSimilares(tree1, tree2));
        
    }


    public <T extends Comparable<T>> boolean bstSimilares(BST<T> a1, BST<T> a2){
         //Si estan vacios retorna true
    	if(a1.isEmpty() && a2.isEmpty()) {
    		return true;
    	//Si un arbol esta vacio y el otro no, retorn false
    	} else if (a1.isEmpty() || a2.isEmpty()){
    		return false;
    	//Si ambos no es tan vacios 
    	} else {
            // usamos un metodo recursivo
    		return similares(a1.root, a2.root);
    	}
    }
     public <T extends Comparable<T>> boolean similares(Node<T> a, Node<T> b){
    	//Si ambos nodos son nulos quiere decir que el nodo padre no tiene hijos
    	if(a == null && b == null) {
    		return true;
    	//Basta con que un nodo de cualquier arbol sea nulo y el otro, y viceversa, retornara false
    	} else if((a!= null && b == null) || (a == null && b != null)) {
    		return false;
    	}
    	// usamos recursividad si son nodos padre
    	return similares(a.left, b.left) && similares(a.right, b.right);

    }
}