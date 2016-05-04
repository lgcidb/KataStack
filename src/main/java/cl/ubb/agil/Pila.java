package cl.ubb.agil;

public class Pila {
	
	int tamanio;
	int contenidoPila[] = new int[2];
	
	public boolean estaVacia(){
		if(tamanio == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public void agregar(int n){
		tamanio++;
		contenidoPila[tamanio-1] = n;
	}
	
	public int pop(){
		int aux;
		aux = contenidoPila[tamanio-1];
		tamanio--;
		return aux;
	}

}
