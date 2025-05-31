
package uap.models;

import uap.bases.Shape;


public class Sphere extends Shape {

    private final double R;

    
    private static final long PRICE_PER_KG = 2_000L; 

    public Sphere(double R) {
        
        if (R <= THICKNESS_CM) {
            throw new IllegalArgumentException(
                "Outer radius R must be > thickness (0.5 cm)."
            );
        }
        this.R = R;
    }

    @Override
    public double calculateVolume() {
        
        double pi = PI;
        return (4.0 / 3.0) * pi * (R * R * R);
    }

    @Override
    public double calculateSurfaceArea() {
        
        double pi = PI;
        return 4.0 * pi * (R * R);
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
