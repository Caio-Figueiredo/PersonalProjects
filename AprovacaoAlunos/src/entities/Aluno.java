package entities;

public class Aluno {

    public double finalGrade, grade1, grade2, grade3;
    public String name;
    double notaDeCorte = 60.00;

    public double calcNota(){
        return finalGrade = grade1 + grade2 + grade3;
    }

    public void validarNota() {

        if (finalGrade > notaDeCorte) {
            System.out.println("FINAL GRADE = " + String.format("%.2f", finalGrade));
            System.out.print("PASS!");
        } else {
            System.out.println("FINAL GRADE = " + String.format("%.2f", finalGrade));
            double result = notaDeCorte - finalGrade;
            System.out.print("FAILED! \n" + "MISSING " + result + " POINTS");
        }
    }

}
