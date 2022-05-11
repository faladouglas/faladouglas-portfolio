package collection_Map;

import java.util.*;

public class Example_Map {
    public static void main(String[] args) {

        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos ");
        Map<String, Double> carrosPopulares;
        carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("\nsubstitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("\nconfira se o modelo tucson esta no dicionario: " + carrosPopulares.containsKey("tucson"));

        System.out.println("\nconfira se o modelo uno esta no dicionario: " + carrosPopulares.containsKey("uno"));

        System.out.println("\nexiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("\nexiba os modelos");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("\nexiba o consumo dos carros");
        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);

        System.out.println("\nexiba o modelo mais economico e seu consumo:");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("modelo mais eficiente: " + modeloMaisEficiente + " | " + consumoMaisEficiente);
            }


        }
        System.out.println("exiba o modelo menos economico e seu consumo:");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("modelo menos eficiente: " + modeloMenosEficiente + "|" + consumoMenosEficiente);

            }


        }
        System.out.println("\nexiba a soma dos consumos");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();

        }
        System.out.println(soma);

        System.out.println("exiba a media dos consumos dos veiculos:\n" + (soma/carrosPopulares.size()));

        System.out.println(carrosPopulares);
        System.out.println("remova os modelos com o consumo igual  a  15.4 km/l:");
        Iterator<Double>iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("\nexiba todos os carros na ordem em que foram informados");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("\nexiba o dicionario ordenado pelo modelo");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);

        }};
        System.out.println(carrosPopulares2.toString());

        System.out.println("aoague o conjunto de carros");
        carrosPopulares2.clear();
        System.out.println(carrosPopulares2);

        System.out.println("confira se a lista esta vazia " + carrosPopulares2.isEmpty());
        System.out.println(carrosPopulares2.toString());



    }

}
