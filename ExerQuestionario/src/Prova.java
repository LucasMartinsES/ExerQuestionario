import java.util.ArrayList;

public class Prova{
    private ArrayList <Question> questoes;

    public Prova(){
        questoes = new ArrayList<Question>();
    }

    public void addQuestion(String text, String answer){    //Metodo para cadastrar questao no array
        Question novQuestion = new Question();
        novQuestion.setText(text);
        novQuestion.setAnswer(answer);
        questoes.add(novQuestion);
    }


    public String returnQuestion(int index){               //Metodo para retornar a questao de acordo com o indice
        if (index < 0 || index > questoes.size()) {
            return null;
        } 
        return questoes.get(index);
    } 

    public void removeQuestion(){                         //Metodo para remover questao pelo indice

    }

    public String exibir(){                              //Mostra a prova
        return "";
    } 
}
