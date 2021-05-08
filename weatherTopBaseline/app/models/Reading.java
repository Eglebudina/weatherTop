package models;

import javax.persistence.Entity;
import java.util.HashMap;
import java.util.HashSet;
import play.db.jpa.Model;
import java.util.ArrayList;
import java.util.Iterator;

@Entity
public class Reading extends Model
{

  public int code;
  public double temperature;
  public double windSpeed;
  public int pressure;
  private HashMap <String,String> weatherCodes;


  public Reading(int code,double temperature, double windSpeed, int pressure)
  {
    this.code = code;
    this.temperature = temperature;
    this.windSpeed = windSpeed;
    this.pressure = pressure;
  }
  public static String codeToText(int code)
  {
    HashMap <Integer, String> weatherCodes = new HashMap<>();

    weatherCodes.put(100, "Clear");
    weatherCodes.put(200, "Partial clouds");
    weatherCodes.put(300, "Cloudy");
    weatherCodes.put(400, "Light showers");
    weatherCodes.put(500, "Heavy showers");
    weatherCodes.put(600, "Rain");
    weatherCodes.put(700, "Snow");
    weatherCodes.put(800, "Thunder");

    return weatherCodes.get(code);
  }
}
