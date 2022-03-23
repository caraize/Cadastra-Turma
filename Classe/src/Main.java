public class Main {

    
    public static void main(String[] args) {
        Curso c1 = new Curso();
        Curso c2 = new Curso("Gabriel", 30, 5, 600,10, 3500);
        
       c1.cadastraCurso();
       c1.imprimeDados();
       System.out.println("\nToda a mensalidade de UMA turma: " + c1.TotalMensalidade());
       
       System.out.println("\nMensalidade de TODAS as turmas: " + c1.DinheiroTotalCurso());
       
       System.out.println("\nDinheiro gasto com salario dos professores: " + c1.CalculaSal());
       
       System.out.println("\nDinheiro que sobrou DE APENAS UMA TURMA depois dos gastos com salarios: " + c1.RestoUmaTurma());
       
       System.out.println("\nTOTAL de dinheiro que sobrou DE TODAS AS TURMAS, depois dos gastos com salarios: " + c1.RestoTodas());
       
       
       /*c2.imprimeDados();
       */
       
    }
    
}


 
       