package org.example;
import java.util.HashMap;
import java.util.Map;

public class WorkWithData implements IWorkWithData {
    OpenFile file = new OpenFile();
    String[] dataArray = file.openFile();
    public void NomberOfWords(){
        System.out.printf("%d продуктов в корзине\n",dataArray.length);
    }

    public void LongestWord() {
        int length =0;
        int count = 0;
        for (int i = 0; i <dataArray.length;i++){
            if (dataArray[i].length()> length)
                count = i;
        }
        System.out.printf("%s - является самым длинным словом", dataArray[count]);
    }

    public void theNumberOfIndividualIngredients() {
        HashMap<String, Integer> ingridientsCollection = new HashMap<String, Integer>();
        for (int i = 0; i < dataArray.length; i++) {
            String nameTofind = dataArray[i];
            if(!ingridientsCollection.containsKey(nameTofind)){
                ingridientsCollection.put(nameTofind,1);
            }
            else {
                Integer value = ingridientsCollection.get(nameTofind);
                value++;
                ingridientsCollection.replace(nameTofind,value);
            }

        }
        int count = 0;
        for (Map.Entry<String,Integer> Ingtidient: ingridientsCollection.entrySet()
        ) {
            System.out.println("Ингридиент " + Ingtidient.getKey() + " встречается "+ Ingtidient.getValue()+" раз");
            count++;
        }
        System.out.println(count);

    }


}
