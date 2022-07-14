package com.example.project;

public class Exercise2 {

    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstIguales(tree1, tree2));
        
    }


    public <T extends Comparable<T>> boolean bstIguales(BST<T> a1, BST<T> a2){

    
    	if (a1.isEmpty() && a2.isEmpty()) { 
    		return true; //si ambos están vacios retoan true
    	}
    	else //usaremos un metodo recursivo para los nodos 
    		return nodeIguales(a1.root, a2.root) && nodeIguales(a1.root, a2.root);  
    	    //el  subarboles izquierdo y derecho son iguales seran bst iguales
    }
    private <T extends Comparable<T>> boolean nodeIguales(Node<T> a1, Node<T> a2){ //Metodo recursivo 
    	if(a1 == null && a2 == null) { //Si los nodos son iguales a null
                return nodeIguales(a1.left, a2.left) && nodeIguales(a1.right, a2.right); 
    		}
    		else { 
    			if(a1.data != a2.data) { //si los nodos son diferentes retirnara false
    			return false; 
    		}
    		
    	}
    	if((a1 != null && a2 == null) || (a1 == null && a2 != null)) { //Si un nodo es nulo y el otro tiene valor los bst no son iguales
    		return false;
    	}
    	else 
    		return true;
    }

    }

