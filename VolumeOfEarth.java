// Program to calculate volume of Earth in cubic kilometers and cubic miles

// Create VolumeOfEarth class to calculate volume of Earth
public class VolumeOfEarth {
    public static void main(String[] args) {
        // Create a variable earthRadiusKm to store value of radius of the Earth in kilometers
        double earthRadiusKm = 6378;

        // Create a variable earthVolumeKm to calculate the volume of the Earth in cubic kilometers
        double earthVolumeKm = (4.0 / 3.0) * Math.PI * Math.pow(earthRadiusKm, 3);

        // Create a variable earthRadiusMiles to convert the radius from kilometers to miles using conversion factor (1 km = 0.621 miles) 
        double earthRadiusMiles = earthRadiusKm * 0.621;

        // Create a variable earthVolumeMiles to calculate the volume of the Earth in cubic miles
        double earthVolumeMiles = (4.0 / 3.0) * Math.PI * Math.pow(earthRadiusMiles, 3);

        // Print the calculated volume
        System.out.println("The volume of earth in cubic kilometers is " + String.format("%.2f", earthVolumeKm) + " and cubic miles is " + String.format("%.2f", earthVolumeMiles));
    }
}
