package command;

import java.util.ArrayList;
import java.util.List;

public class ControlUnit {
    private final List<Command> commands = new ArrayList<>();
    private int current = 0;

    public void StoreCommand(Command command) {
        commands.add(command);
    }

    public void ExecuteCommand() {
        commands.get(current).execute();
        current++;
    }

    public void undo() {
        commands.get(current - 1).unExecute();
    }

    public void undo(int i) {
        if (i > current) {
            throw new RuntimeException();
        }
        commands.get(current - i).unExecute();
    }

    public void redo() {
        commands.get(current - 1).execute();
    }

    public void redo(int i) {
        if (i > current) {
            throw new RuntimeException();
        }
        commands.get(current - i).execute();
    }
}

