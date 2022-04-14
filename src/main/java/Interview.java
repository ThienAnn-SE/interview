import command.CommandRouter;
import command.CommandRouterFactory;
import command.DaggerCommandRouterFactory;

import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandRouterFactory commandRouterFactory = DaggerCommandRouterFactory.create();
        CommandRouter commandRouter = commandRouterFactory.router();

        while (scanner.hasNextLine()) {
            commandRouter.route(scanner.nextLine());
        }
    }
}
