package commandpattern;

public class RemoteControllerTest {
    public static void main(String[] args) {
        Command lightOnCommand = new LightOnCommand(new Light());

        SimpleRemoteController remoteController = new SimpleRemoteController();
        remoteController.setCommand(lightOnCommand);
        remoteController.buttonWasPressed();
    }
}
