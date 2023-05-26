public class Main {
    public static void main(String[] args) {
        // Notre chauffage
        HeatManager manager = new HeatManager();

        // Les commandes
        ICommand off = new CommandTurnOffHeating(manager);
        ICommand on = new CommandTurnOnHeating(manager);
        ICommand increase = new CommandIncreaseHeatingValue(manager);
        ICommand decrease = new CommandDecreaseHeatingValue(manager);

        // Les invokers/controller
        Invoker telecommande = new Invoker();
        Invoker switchGeneral = new Invoker();

        // Config des invoker controller
        telecommande.addCommand("increase1", increase);
        telecommande.addCommand("decrease1", decrease);

        switchGeneral.addCommand("off", off);
        switchGeneral.addCommand("on", on);

        // Demo
        System.out.println(manager.toString());

        // Turn on
        switchGeneral.execute("on");
        System.out.println(manager.toString());

        // Increase
        telecommande.execute("increase");
        System.out.println(manager.toString());

        // Decrease
        telecommande.execute("decrease");
        System.out.println(manager.toString());

        // Turn off
        switchGeneral.execute("off");
        System.out.println(manager.toString());
    }
}