package it.polito.tdp.alien.model;

import java.util.*;

public class Word {

	private String alienWord;
	private LinkedList<String> traduzioni;

	public Word() {
		alienWord = new String();
		traduzioni = new LinkedList<String>();
	}
	
	public Word(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		traduzioni.add(translation);
	}

	public void newWord(String alienWord, String translation) {
		this.alienWord = alienWord;
		traduzioni.add(translation);
	}
	
	public void addTraduzione(String translation) {
		traduzioni.add(translation);
	}

	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public String getTranslation() {
		String translation = "";
		for(String si : traduzioni) {
			translation += si+", ";
		}
		return translation;
	}

}
