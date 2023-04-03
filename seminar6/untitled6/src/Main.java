public class Main {
    public static void main(String[] args) {
        PersonalSpital stretcher1 = PersonalSpitalFactory.createStretcher("John");
        PersonalSpital assistant1 = PersonalSpitalFactory.createAssistant("Jane");
        PersonalSpital doctor1 = PersonalSpitalFactory.createDoctor("Jack");

    }
}
