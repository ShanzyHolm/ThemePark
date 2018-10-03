public class ThemePark {
    private String name;
    private double admissionPrice;

    public ThemePark(String name) {
        this.name = name;
        this.admissionPrice = 5.00;
    }

    public String getName() {
        return name;
    }

    public double getAdmissionPrice() {
        return admissionPrice;
    }
}
