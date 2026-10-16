package Metodos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            // Instanciación de los módulos de definición y lógica iterativa
            DefinicionSistema sistema = new DefinicionSistema();
            MetodosIterativos metodos = new MetodosIterativos();

            // Ejecución secuencial de ambos métodos numéricos
            metodos.resolverJacobi(sistema);
            metodos.resolverGaussSeidel(sistema);
        }
    }