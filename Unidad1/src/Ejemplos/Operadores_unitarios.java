package Ejemplos;

public class Operadores_unitarios {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
		//+ convierten al operando en int en caso de que fuese byte, short o char.
		//- cambia el signo al operando.
		//++n incrementa al operando en 1 (evaluando el operando después de incrementarse).
		//n++ incrementa el operando en 1 (evaluando el operando antes de incrementarse).
		//--n decrementa el operando en 1 (evaluando el operando después de decrementarse).
		//n-- decrementa el operando en 1 (evaluando el operando antes de decrementarse).
		
		//>: compara si un operando es mayor que otro op1 > op2
		//<: compara si un operando es menor que otro op1 < op2
		//==: compara si un operando es igual que otro op1 == op2. Cuidado con no confundir con el operador de asignación =
		//!=: compara si un operando es distinto que otro op1 != op2
		//>=: compara si un operando es mayor o igual que otro op1 >= op2
		//<=: compara si un operando es menor o igual que otro op1 <= op2
		
		//&&: AND lógico. Comprueba si ambos operandos son verdaderos op1 && op2
		//||: OR lógico. Comprueba si uno de los dos operandos es verdadero op1 || op2
		//!: NOT lógico. Niega al operadondo !op
		
		y = ++x;
		System.out.println("y vale: "+ y +", x vale: " + x);
		y = ++x;
		System.out.println("y vale: "+ y +", x vale: " + x);
		y = --x;
		System.out.println("y vale: "+ y +", x vale: " + x);
		y = x--;
		System.out.println("y vale: "+ y +", x vale: " + x);
				
	}

}
