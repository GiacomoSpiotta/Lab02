package it.polito.tdp.alien.model;

import java.util.*;

public class AlienDictionary {

	private TreeMap<String, Word> dizionario;
	
	public AlienDictionary() {
		dizionario = new TreeMap<String, Word>();
	}
	
	public void addWord(String alienWord, String translation) {
		
		if(dizionario.get(alienWord) == null) {
			Word w = new Word(alienWord, translation);
			dizionario.put(w.getAlienWord(), w);
		}else {
			dizionario.get(alienWord).addTraduzione(translation);
		}
	}
	
	public String translate(String alienWord) {
		return dizionario.get(alienWord).getTranslation();
	}
	
	public void clear() {
		dizionario.clear();
	}
}
