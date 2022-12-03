package json;

import org.json.JSONObject;

public class ManipulandoJson {
    public String criandoJson(){
        JSONObject json = new JSONObject();
        json.put("nome", "Rangel");
        json.put("sobrenome", "Souza");
        json.put("idade", 35);
        //System.out.println(json);
        //System.out.println(json.get("nome"));
        return json.get("nome").toString();
    }
}
