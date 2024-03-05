public class Puzzle8 {

    public static void main(String[] args) {
    	
    	String estadoInicial = "41275386  ";
    	String estadoFinal   = "12345678 ";
    	
        
        //Instanciar el arbol
        ArbolBusqueda a = new ArbolBusqueda(estadoInicial, estadoFinal);
       
        //Realiza cada una de las busquedas y las imprime
        a.busquedaPorProfundidad();
        a.imprimirSolucion();
        
        a.busquedaPorAnchura();
        a.imprimirSolucion();
        
       
    }
    
}