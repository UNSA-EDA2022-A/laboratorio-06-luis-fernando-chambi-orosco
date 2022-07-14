package com.example.project;

public class Exercise3 {

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();

        BST<Integer> tree = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree.insert(value);
        }

        System.out.print(obj.bstEstrictamenteBinario(tree));
        
    }

public <T extends Comparable<T>> boolean bstEstrictamenteBinario(BST<T> a){
    	Node<T> aux = a.root; //extraemos la raiz 
    	if(a.isEmpty()) {
    		return true; //si esta vacio  es binario
    	}
    	return nodeBinario(aux); // metodo recursivo

    }
    private <T extends Comparable<T>> boolean nodeBinario(Node<T> b){
    	if((b.right != null && b.left == null) || (b.right == null && b.left != null)) { //si un nodo hijo es nulo y el otro no, no sera albol binario
            return false;
            
    	}
    	else if(b.right != null && b.left != null) { //Si sus hijos son diferente de nulo 
            return nodeBinario(b.left) && nodeBinario(b.right); //si ambos hijos son perfectamente binarios  arbol  binario 
    		
    	}
    	else //si ambos hijos son nulos sera binario 
    		return true;
    }
}
