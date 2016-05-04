package cl.ubb.agil;

public class Pila {
	
	int tamanio;
	
	public boolean estaVacia(){
		if(tamanio == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public void agregar(int n){
		tamanio++;
	}

}
