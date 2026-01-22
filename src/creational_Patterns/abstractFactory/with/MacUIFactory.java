package creational_Patterns.abstractFactory.with;

class MacUIFactory implements UIFactory {
    public Button createButton() {
        return new MacButton();
    }
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
