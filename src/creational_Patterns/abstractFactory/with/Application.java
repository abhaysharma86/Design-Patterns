package creational_Patterns.abstractFactory.with;

class Application {
    private Button button;
    private Checkbox checkbox;

    Application(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    void render() {
        button.paint();
        checkbox.paint();
    }
}
