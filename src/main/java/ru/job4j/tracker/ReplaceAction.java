package ru.job4j.tracker;

public class ReplaceAction implements UserAction {

    private final Output output;

    public ReplaceAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Изменить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Изменить заявку ===");
        int id = input.askInt("Введите id: ");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        output.println(tracker.replace(id, item) ? "Заявка изменена успешно." : "Ошибка замены заявки.");
        return true;
    }
}
