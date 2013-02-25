package jfisher.logic;
/**
 *
 * @author JWhite
 */
public class DistanceConversion {
    
    public static float feetToMeters(int ft){
        return (ft * 0.3048F);
    }
    
    public static float metersToFeet(int meters){
        return meters*3.281F;
    }
    
    public static float milesToKM(float miles){
        return miles*1.609F;
    }
    
    public static float kmToMiles(float km){
        return km*0.6214F;
    }
}