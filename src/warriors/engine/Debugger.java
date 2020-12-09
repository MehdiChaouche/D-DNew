package warriors.engine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Debugger extends Lancerdé {
	
	private int i;
	List<Integer> Scenario = new ArrayList<Integer>();
	
	public Debugger(String path) {
		this.i = -1;
		String line="";
		BufferedReader readFile = null;
		String splitBy = ",";
		try {
			readFile = new BufferedReader(new FileReader(path));
			while((line = readFile.readLine())!=null) {
				String [] dice = line.split(splitBy);
				for(int i=0; i < dice.length; i++) {
					Scenario.add(Integer.parseInt(dice[i]));
				}
			}
		} catch (Exception e) {
			System.out.println("Erreur du debug.");
		}
	}
	
	public int getI() {
		return i;
	}
	
	public void setI(int i) {
		this.i = i;
	}
	
	public List<Integer> getListDebug() {
		return Scenario;
	}
	
	public void setListDebug(List<Integer> listDebug) {
		this.Scenario = listDebug;
	}

	@Override
	public int diceRoll() {
		// TODO Auto-generated method stub
		int newI = getI()+1;
		setI(newI);
		int result = Scenario.get(i);
		System.out.println("Tirage du dé : " + result);
		return result;
	}
}