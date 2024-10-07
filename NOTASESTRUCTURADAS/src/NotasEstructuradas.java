import javax.swing.JOptionPane;

public class NotasEstructuradas {
    public static void main(String[] args) throws Exception {

        for(int est=1; est <=2;  est++){
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante");
            float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota del estudiante 1"));
            float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota del estudiante 2"));
            float notaFinal = (nota1 + nota2)/2;
            JOptionPane.showMessageDialog(null, "Informacion del estudiante\nNombre: " + nombre + "\nNota final: " + notaFinal);

            if (notaFinal < 3.0) {
                JOptionPane.showMessageDialog(null, "El estudiante " + nombre + " reprobo la materia");
            }else{
                JOptionPane.showMessageDialog(null, "El estudiante " + nombre + " aprobo la materia");
            }
        }
    }
}
