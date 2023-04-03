public class PersonalSpitalFactory {
    public static PersonalSpital createStretcher(String name) {
        return new Stretcher(name);
    }

    public static PersonalSpital createAssistant(String name) {
        return new Assistant(name);
    }

    public static PersonalSpital createDoctor(String name) {
        return new Doctor(name);
    }
}
