
package uap.models;

import uap.bases.Shape;


public class Torus extends Shape {

    private final double R;   
    private final double r;   
    
    private static final long PRICE_PER_KG = 2_000L; 

    public Torus(double R, double r) {
       
        if (r <= THICKNESS_CM) {
            throw new IllegalArgumentException(
                "Minor radius r must be > thickness (0.5 cm)."
            );
        }
        this.R = R;
        this.r = r;
    }

    @Override
    public double calculateVolume() {
        
        double pi = PI;           
        return 2.0 * pi * pi * R * (r * r);
    }

    @Override
    public double calculateSurfaceArea() {
        
        double pi = PI;
        return 4.0 * pi * pi * R * r;
    }

    @Override
    public double calculateMass() {
       
        double area = calculateSurfaceArea();
        return DENSITY_STEEL * area * THICKNESS_CM;
    }

    @Override
    public long calculateShippingCost() {
        double massKg = toKilogram();                    
        long kgRoundedUp = (long) Math.ceil(massKg);     
        return kgRoundedUp * PRICE_PER_KG;
    }
}
