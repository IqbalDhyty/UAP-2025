
package uap.mains;

import java.util.Locale;
import java.util.Scanner;
import uap.models.Sphere;
import uap.models.Torus;

public class KalkulatorPabrik {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Nama Praktikan: <YOUR_FULL_NAME_HERE>");
        System.out.println("NIM Praktikan : <YOUR_NIM_HERE>");
        System.out.println("=============================================\n");

        
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Major Radius (R)   : ");
        double R_torus = scanner.nextDouble();      

        System.out.print("Isikan Minor Radius (r)   : ");
        double r_torus = scanner.nextDouble();     

        
        Torus torus = new Torus(R_torus, r_torus);

        double volumeT = torus.calculateVolume();          
        double areaT   = torus.calculateSurfaceArea();     
        double massT   = torus.calculateMass();            
        double massKgT = torus.toKilogram();               
        long   costT   = torus.calculateShippingCost();    

        
        System.out.println("\nVolume          : " + String.format("%.2f", volumeT));
        System.out.println("Luas permukaan  : " + String.format("%.2f", areaT));
        System.out.println("Massa (gram)    : " + String.format("%.2f", massT));
        System.out.println("Massa (kg)      : " + String.format("%.2f", massKgT));
        System.out.println("Biaya kirim     : Rp" + costT);
        System.out.println("=============================================\n");

        
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Outer Radius (r)   : ");
        double R_sphere = scanner.nextDouble();      

        
        Sphere sphere = new Sphere(R_sphere);

        double volumeS = sphere.calculateVolume();        
        double areaS   = sphere.calculateSurfaceArea();    
        double massS   = sphere.calculateMass();          
        double massKgS = sphere.toKilogram();             
        long   costS   = sphere.calculateShippingCost();   

        
        System.out.println("\nVolume          : " + String.format("%.2f", volumeS));
        System.out.println("Luas permukaan  : " + String.format("%.2f", areaS));
        System.out.println("Massa (gram)    : " + String.format("%.2f", massS));
        System.out.println("Massa (kg)      : " + String.format("%.2f", massKgS));
        System.out.println("Biaya kirim     : Rp" + costS);
        System.out.println("=============================================");

        scanner.close();
    }
}
