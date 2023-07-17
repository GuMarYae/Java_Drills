package week1adv;

public class Message {

    private String recipient;
    private String sender;
    private String msgBody;

    // constructor
    public Message(String recipient, String sender) {
        this.recipient = recipient;
        this.sender = sender;
        this.msgBody = "";
    }

    public void append(String MessageText) {
        this.msgBody = this.msgBody + MessageText;
    }

    public String toString() {
        return "From: " + this.sender + "\n" + this.recipient + "\n" + this.msgBody;
    }

}
