

import asf.data_structures.lists.LinkedList;

public class Main {

	public static void main(String[] args) {
		String a = "A";
		String line ="------";
		String station ="B445645";
		String distancia ="312312";
		System.out.println(String.format("Estacion:%"+(a.length()+2)
				+"s\n\nConexion%9s\n--------%"+(line.length()+3)+"s\n%s"+"%"+(11-(station.length()%12)+distancia.length())+"s",a,"tiempo",line,station,distancia));

			
	

	}

}
