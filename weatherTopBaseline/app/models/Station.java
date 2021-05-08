package models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Station extends Model
{
  public String name;
  @OneToMany(cascade = CascadeType.ALL)
  public List<Reading> readings = new ArrayList<Reading>();
//  public double latitude;
//  public double longitude;
//  public double celcius;
//  public double fahrenheit;
//  public int windBeaufort;
//  public int pressure;
//  public String windChill;
//  public String windDirection;
  public String weatherCodes;

//  public double maxTemp;
//  public double minTemp;
//  public double maxWind;
//  public double minWind;
//  public int maxPressure;
//  public int minPressure;

  public Station(String name)
  {
    this.name = name;
  }
}

