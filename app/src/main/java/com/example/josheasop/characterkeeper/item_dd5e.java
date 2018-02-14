package com.example.josheasop.characterkeeper;

/**
 * Created by Josh Easop on 5/20/2017.
 */

public class item_dd5e
{
    public String name;
    public String weight;
    public String quantity;

    public item_dd5e(){}

    public item_dd5e(String Name, String Weight, String Quant)
    {
        name = Name;
        weight = Weight;
        quantity = Quant;
    }

    public void setName(String in){name = in;}
    public String getName(){return name;}
    public void setWeight(String in){weight = in;}
    public String getWeight(){return weight;}
    public void setQuantity(String in){quantity = in;}
    public String getQuantity(){return quantity;}
}
