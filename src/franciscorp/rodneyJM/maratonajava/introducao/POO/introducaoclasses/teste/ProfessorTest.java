package franciscorp.rodneyJM.maratonajava.introducao.POO.introducaoclasses.teste;

import franciscorp.rodneyJM.maratonajava.introducao.POO.introducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor01 = new Professor();

        professor01.name = "Jurisvaldo shokobo";
        professor01.idade = 32;
        professor01.sexo = 'F';

        System.out.println("Nome: "+ professor01.name + "\nIdade: "+ professor01.idade + "\nSexo: "+ professor01.sexo);
    }
}
