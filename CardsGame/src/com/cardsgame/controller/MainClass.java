package com.cardsgame.controller;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Map;

import javax.smartcardio.Card;

import org.json.JSONException;
import org.json.JSONObject;

public class MainClass {
	public static void main(String args[]) {
		CardsController cardsController = new CardsController();
		Map<String, ArrayList<Card>> map = cardsController.cardsDistribute();
		JSONObject obj = new JSONObject();
		String jsonText=null;

		try {
			for (Map.Entry<String, ArrayList<Card>> entry : map.entrySet()) {
				
				obj.put(entry.getKey().toString(), entry.getValue().toString());
				StringWriter out = new StringWriter();
				obj.write(out);
				jsonText = out.toString();
				
		}
			System.out.println("json object:" + jsonText);
		} catch (Exception e) {

			System.out.println("error in json object");
			e.printStackTrace();
		}

			
	}
}
