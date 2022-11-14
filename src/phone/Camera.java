package phone;

public class Camera {
    public enum Resolution {
        HD, FULL_HD, FOUR_K
    }
    private Resolution resolution;

    public Camera(Resolution resolution) {
        this.resolution = resolution;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public PhoneFile takePhoto(String name) {
        switch (resolution) {
            case HD:
                return new PhoneFile("jpg", 400, name);
            case FULL_HD:
                return new PhoneFile("jpg", 800, name);
            case FOUR_K:
                return new PhoneFile("jpg", 2400, name);
            default:
                return null;
        }

    }
}
