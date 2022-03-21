package springcore.SpringCoreAns_2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	  private  int questionId;
	  private  String  question;
	  
	  private List<String> ans;
	  private Set<String>  anssSet;
	  private Map<Integer,String> ansMap;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAns() {
		return ans;
	}
	public void setAns(List<String> ans) {
		this.ans = ans;
	}
	public Set<String> getAnssSet() {
		return anssSet;
	}
	public void setAnssSet(Set<String> anssSet) {
		this.anssSet = anssSet;
	}
	public Map<Integer, String> getAnsMap() {
		return ansMap;
	}
	public void setAnsMap(Map<Integer, String> ansMap) {
		this.ansMap = ansMap;
	}
	  
	public void ansSetDisplay(){
        System.out.println(questionId+". "+question);
        for(String ans:anssSet){
            System.out.println(ans);
        }
    }
	
	  
}
