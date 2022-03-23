
import javax.swing.JOptionPane;


public class Curso {
    String nome;
    int quantidadealunos;
    int turma;
    float mensalidade;
    int professores;
    float salprof;
    
    
    
    //construtor sem parametro
    public Curso(){
}
    //construtor com parametro
    public Curso (String n, int q, int t, float m, int p, float s) {
    this.nome = n;
    this.quantidadealunos = q;
    this.turma = t;
    this.mensalidade = m;
    this.professores = p;
    this.salprof = s;
    }
    
    //metodos, tudo que é ação é metodo
    void cadastraCurso(){
    nome= JOptionPane.showInputDialog(null, "Digite o nome do curso");
    quantidadealunos= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de alunos pretendida por turma"));
    turma= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantas turmas esse curso pretende ter"));
    mensalidade= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da mensalidade"));
    professores=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantos professores a turma terá"));
    salprof=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de um salario (em media) do professor"));
    }
    
    void imprimeDados(){
       System.out.println("Relatorio sobre o curso: " + 
                            "\nNome do curso: " + nome +
                             "\nQuantidade de alunos: " + quantidadealunos +
                              "\nTurma: " + turma +
                               "\nO valor da mensalidade: " +mensalidade 
                                       + "\n ..............");
    }
    
    
    
    
    public float TotalMensalidade(){
        return(this.quantidadealunos * this.mensalidade);
    }
    
    public float DinheiroTotalCurso(){
        return(this.TotalMensalidade() * this.turma);
    }
    
    
    public float CalculaSal(){
        return(this.professores * this.salprof);
}
    
    public float RestoUmaTurma(){
        return(this.TotalMensalidade() - this.CalculaSal());
    }
    
    public float RestoTodas(){
        return(this.DinheiroTotalCurso() - this.CalculaSal());
    }
    
    }