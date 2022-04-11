public class AplicacaoDeProva public class AplicacaoDeProva extends Prova {

    public void CadastrarResposta(String resposta, int numero)
    {
        if (questoes.size() <= numero){
           questoes.get(numero).setStudentAnswer(resposta); //criar metodo para alocar a resposta do aluno na classe question
        }
    }

    public void CalcularNota(){
        double nota=0;
        for(int i=0; i<questoes.size(); i++){
            if(questoes.get(i).checkAnswer(questoes.get(i).getStudentAnswer())){ // fazer um metodo para pegar a resposta do aluno
                nota += questoes.get(i).getNotaQuestao(); //fazer um metodo para pegar a nota da questao
            } 
        }
        System.out.println("Nota Atingida na Prova: " + nota);
    }

    public void ImprimirRelatorio(){
        for(int i = 0; i <=questoes.size(); i++){
            if(questoes.get(i).checkAnswer(questoes.get(i).getStudentAnswer())){
                System.out.println("Questao "+i+ ") " +questoes.get(i));
                System.out.println("Resposta Informada" + questoes.getStudentAnswer());
                System.out.printIn("Resposta Correta");
            }
        }
    }
}
