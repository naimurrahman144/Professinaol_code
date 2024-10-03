package chapter_9;

import java.util.ArrayList;

public class AnyCorrectChoiceQuestion extends Question{
    private  ArrayList<String> choices;
    private ArrayList<Integer> answer;
    public AnyCorrectChoiceQuestion(String questionText){
        super(questionText);
        choices = new ArrayList<>();
        answer = new ArrayList<>();
    }
    public void addChoice(String choice,boolean correct){
        choices.add(choice);
        if(correct){
            answer.add(1);
        }
        else {
            answer.add(0);
        }
    }
    public boolean checkAnswer(String response){
        int index = choices.indexOf(response);
        if (answer.get(index) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("enter any correct answer");
        for(int i = 0; i<choices.size();i++){
            int choiceNumber = i+1;
            System.out.println(choiceNumber+" : "+choices.get(i));
        }
    }
}
