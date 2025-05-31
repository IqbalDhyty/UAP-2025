
package uap.bases;

import uap.interfaces.MassCalculable;
import uap.interfaces.MassConverter;
import uap.interfaces.PiRequired;
import uap.interfaces.ShippingCostCalculator;
import uap.interfaces.ThreeDimensional;


public abstract class Shape 
        implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {

    
    protected static final double THICKNESS_CM = 0.5;

   
    protected static final double DENSITY_STEEL = 8.0;


    @Override
    public abstract double calculateVolume();

    
    @Override
    public abstract double calculateSurfaceArea();

    
    @Override
    public abstract double calculateMass();

    
    @Override
    public abstract long calculateShippingCost();

    
    @Override
    public double toKilogram() {
        return calculateMass() / 1000.0;
    }
}
