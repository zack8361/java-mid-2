package innerclass.ex01;

public class Network {

    public void sendMessage(String text) {
        new NetworkMessage(text).print();
    }
}
