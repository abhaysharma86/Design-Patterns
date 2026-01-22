package creational_Patterns.abstractFactory.without;

class Application {

    private Button button;
    private Checkbox checkbox;

    Application(String osType) {

        if (osType.equals("WINDOWS")) {
            button = new WindowsButton();
            checkbox = new WindowsCheckbox();

        } else if (osType.equals("MAC")) {
            button = new MacButton();
            checkbox = new MacCheckbox();
        }
    }

    void render() {
        button.paint();
        checkbox.paint();
    }
}
