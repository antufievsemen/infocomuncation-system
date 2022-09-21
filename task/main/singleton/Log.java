package singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Objects;

public class Log {
    static private Log myLog = null;

    private Log() {
    }

    public static Log getMyLog() {
        if (Objects.isNull(myLog)) {
            myLog = new Log();
        }
        return myLog;
    }

    public void LogExecution(String mes) {
        File file = new File("./task/main/singleton/log.txt");
        try (FileWriter writer = new FileWriter(file, true)) {
            loger(mes, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loger(String logMessage, FileWriter w) throws IOException {
        w.write("\r\nLog Entry : ");
        w.write(LocalDateTime.now().toLocalDate().toString());
        w.write(LocalDateTime.now().toLocalTime().toString());
        w.write(String.format(" Действие: %s", logMessage));
        w.write("-------------------------------");
        w.flush();
    }
}
