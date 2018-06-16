package aec2.metro.implementacion.undergroundapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import aec2.metro.implementacion.MetroMadrid;

public class Loader {

	
	
	
	public static MetroMadrid getMetroData() {
		MetroMadrid metro = null;
		try (ObjectInputStream inputObject = new ObjectInputStream(new FileInputStream("metroMadrid.dat"))){
			
	          metro=(MetroMadrid) inputObject.readObject();
		
		} catch (FileNotFoundException e ) {
			System.out.println("File not found!");
		}
		catch( IOException e) {
		     System.out.println("Error to open the file");
		}catch(ClassNotFoundException e) {
			System.out.println("class not found");
		}
		if( metro == null) {
			//for goodness we pass a functional graf to avoid java.Lang.NullPointerException haha 
			metro = new MetroMadrid();
		}
		return metro;
	}
	
	
	public static void saveUndergroundData(MetroMadrid data) {
		
		
		try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("metroMadrid.dat"))){
			output.writeObject(data);
		
		}catch(Exception e) {
			System.out.println("Error: line 45 class:Loader fail to save data into file");
		}
	}

}
